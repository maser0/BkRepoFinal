package pl.coderslab.bk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.bk.entity.Group;
import pl.coderslab.bk.entity.Student;
import pl.coderslab.bk.entity.Trainer;

import java.util.List;

@Repository
public interface StudentRepository  extends JpaRepository<Student, Long> {

    List<Student> findAllByGroupsId(long groupId);
    Student findOneByNameAndSurname(String name, String surname);
}
