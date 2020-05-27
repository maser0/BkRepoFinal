package pl.coderslab.bk.service;


import org.springframework.stereotype.Service;
import pl.coderslab.bk.entity.Group;
import pl.coderslab.bk.repository.GroupRepository;

import java.util.List;

@Service
public class GroupService {
    private final GroupRepository groupRepository;

    public GroupService(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    public void save (Group group){
        groupRepository.save(group);
    }

    public void delete (Group group){
        groupRepository.delete(group);
    }

    public void edit (Group group){
        Group groupToEdit = groupRepository.getOne(group.getId());
        groupRepository.save(groupToEdit);
    }

    public Group read (Long id){
        return  groupRepository.getOne(id);}
    
    
    public List<Group> findAll (){
        return groupRepository.findAll();
    }
}
