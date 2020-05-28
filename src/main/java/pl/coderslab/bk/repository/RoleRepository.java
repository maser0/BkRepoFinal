package pl.coderslab.examplesecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.examplesecurity.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findOneByName(String roleName);
}