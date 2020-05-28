package pl.coderslab.bk.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import pl.coderslab.bk.entity.Role;
import pl.coderslab.bk.entity.User;
import pl.coderslab.bk.interfaces.UserService;
import pl.coderslab.bk.repository.RoleRepository;
import pl.coderslab.bk.repository.UserRepository;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    public UserServiceImpl(
            UserRepository userRepository,
            RoleRepository roleRepository,
            BCryptPasswordEncoder passwordEncoder
    ) {
        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @Override
    public User findByUserName(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public void saveUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setEnabled(1);
        if(user.getRoles() == null || user.getRoles().size()==0) {
            Set<Role> roles = new HashSet<>();
            roles.add(roleRepository.findOneByName("ROLE_USER"));
            user.setRoles(roles);
        }
        userRepository.save(user);
    }
}