package pl.coderslab.bk.service;


import org.springframework.stereotype.Service;
import pl.coderslab.bk.entity.Presence;
import pl.coderslab.bk.repository.PresenceRepository;

import java.util.List;

@Service
public class PresenceService {
    private final PresenceRepository presenceRepository;

    public PresenceService(PresenceRepository presenceRepository) {
        this.presenceRepository = presenceRepository;
    }

    public void save (Presence presence){
        presenceRepository.save(presence);
    }

    public void saveList (List <Presence> presenceList){

        presenceList.forEach(presence -> presenceRepository.save(presence));
    }


    public void delete (Presence presence){
        presenceRepository.delete(presence);
    }

    public void edit (Presence presence){
        Presence presenceToEdit = presenceRepository.getOne(presence.getId());
        presenceRepository.save(presenceToEdit);
    }

    public Presence read (Long id){
        return  presenceRepository.getOne(id);}
    
    
    public List<Presence> findAll (){
        return presenceRepository.findAll();
    }
}
