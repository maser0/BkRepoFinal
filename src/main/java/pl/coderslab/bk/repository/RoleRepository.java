package pl.coderslab.bk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.bk.entity.Role;
import pl.coderslab.bk.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findOneByName(String roleName);
}