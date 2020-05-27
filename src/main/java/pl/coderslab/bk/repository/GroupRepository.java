package pl.coderslab.bk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.bk.entity.Group;
import pl.coderslab.bk.entity.Trainer;

@Repository
public interface GroupRepository  extends JpaRepository<Group, Long> {
}
