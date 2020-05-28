package pl.coderslab.bk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.bk.entity.Role;
import pl.coderslab.bk.interfaces.RoleService;
import pl.coderslab.bk.repository.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public void save(Role role) {
        this.roleRepository.save(role);
    }

    @Override
    public Role findOneByName(String roleName) {
        return this.roleRepository.findOneByName(roleName);
    }


}
