package pl.coderslab.bk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.bk.entity.Trainer;

@Repository
public interface TrainerRepository extends JpaRepository<Trainer, Long> {
}
