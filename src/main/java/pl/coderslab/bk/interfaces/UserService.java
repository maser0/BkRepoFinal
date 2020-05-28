package pl.coderslab.bk.interfaces;

import pl.coderslab.bk.entity.User;

public interface UserService {
    User findByUserName(String name);
    void saveUser(User user);
}
