package pl.coderslab.bk.service;


import org.springframework.stereotype.Service;
import pl.coderslab.bk.entity.Classes;
import pl.coderslab.bk.entity.Presence;
import pl.coderslab.bk.entity.Student;
import pl.coderslab.bk.repository.ClassesRepository;
import pl.coderslab.bk.repository.PresenceRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClassesService {
    private final ClassesRepository classesRepository;
    private final PresenceRepository presenceRepository;

    public ClassesService(ClassesRepository classesRepository, PresenceRepository presenceRepository) {
        this.classesRepository = classesRepository;
        this.presenceRepository = presenceRepository;
    }

    public void save(Classes classes) {
        classesRepository.save(classes);

        //Generate prencence for each student
//        List<Presence> presences = new ArrayList<>();
//        List<Student> students = classes.getGroup().getStudents();
//        students.forEach(student -> {
//            Presence presence = new Presence();
//            presence.setStudent(student);
//            presence.setClasses(classes);
//            presence.setAbsence(false);
//            presenceRepository.save(presence);
//            presences.add(presence);
//        });
//        classes.setPresences(presences);
    }

    public void delete(Classes classes) {
        classesRepository.delete(classes);
    }


    public Classes read(Long id) {
        return classesRepository.getOne(id);
    }


    public List<Classes> findAll() {
        return classesRepository.findAll();
    }
}
