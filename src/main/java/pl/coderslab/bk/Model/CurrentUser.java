package pl.coderslab.bk.Model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

public class CurrentUser extends User {
    private final pl.coderslab.bk.entity.User user;

    public CurrentUser(
            String username,
            String password,
            Collection<? extends GrantedAuthority> authorities,
            pl.coderslab.bk.entity.User user
    ) {
        super(username, password, authorities);
        this.user = user;
    }

    public pl.coderslab.bk.entity.User getUser() {
        return user;
    }
}