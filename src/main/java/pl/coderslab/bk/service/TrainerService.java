package pl.coderslab.bk.service;

import org.springframework.stereotype.Service;
import pl.coderslab.bk.entity.Trainer;
import pl.coderslab.bk.entity.Trainer;
import pl.coderslab.bk.repository.TrainerRepository;

import java.util.List;

@Service
public class TrainerService {
    private final TrainerRepository trainerRepository;

    public TrainerService(TrainerRepository trainerRepository) {
        this.trainerRepository = trainerRepository;
    }

    public void save (Trainer trainer){
        trainerRepository.save(trainer);
    }

    public void delete (Trainer trainer){
        trainerRepository.delete(trainer);
    }

    public void edit (Trainer trainer){
        Trainer trainerToEdit = trainerRepository.getOne(trainer.getId());
        trainerRepository.save(trainerToEdit);
    }
    public Trainer read (Long id){
        return  trainerRepository.getOne(id);

    }

    public List<Trainer> findAll (){
        return  trainerRepository.findAll();
    }




}
