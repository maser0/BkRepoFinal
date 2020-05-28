package pl.coderslab.bk.interfaces;

import pl.coderslab.bk.entity.Role;

public interface RoleService {
    void save(Role role);

    Role findOneByName(String admin);
}
