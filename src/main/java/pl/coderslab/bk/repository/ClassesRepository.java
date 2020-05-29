package pl.coderslab.bk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.bk.entity.Classes;

@Repository
public interface ClassesRepository extends JpaRepository <Classes, Long>{
}
