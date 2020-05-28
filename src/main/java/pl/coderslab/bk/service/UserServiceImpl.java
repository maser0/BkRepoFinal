package pl.coderslab.examplesecurity.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import pl.coderslab.examplesecurity.entity.Role;
import pl.coderslab.examplesecurity.entity.User;
import pl.coderslab.examplesecurity.interfaces.UserService;
import pl.coderslab.examplesecurity.repository.RoleRepository;
import pl.coderslab.examplesecurity.repository.UserRepository;

import java.util.Arrays;
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