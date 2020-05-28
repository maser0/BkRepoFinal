package pl.coderslab.bk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import pl.coderslab.bk.Model.CurrentUser;
import pl.coderslab.bk.entity.Role;
import pl.coderslab.bk.entity.User;
import pl.coderslab.bk.interfaces.UserService;

import java.util.HashSet;
import java.util.Set;

public class SpringDataUserDetailsService implements UserDetailsService {

    private UserService userService;

    @Autowired
    public void setUserRepository(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) {
        User user = userService.findByUserName(username);
        if (user == null) {throw new UsernameNotFoundException(username); }
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        Set<Role> roles =  user.getRoles();
        roles.forEach(r -> grantedAuthorities.add(new SimpleGrantedAuthority(r.getName())));

//        return new org.springframework.security.core.userdetails.User(
//                user.getUsername(), user.getPassword(), grantedAuthorities);

//        Change to own implementation
        return new CurrentUser(user.getUsername(), user.getPassword(), grantedAuthorities, user);
    }
}
