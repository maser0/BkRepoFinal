package pl.coderslab.examplesecurity.interfaces;

import pl.coderslab.examplesecurity.entity.User;

public interface UserService {
    User findByUserName(String name);
    void saveUser(User user);
}
