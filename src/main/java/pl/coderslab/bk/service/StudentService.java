package pl.coderslab.bk.service;

import org.springframework.stereotype.Service;
import pl.coderslab.bk.entity.Group;
import pl.coderslab.bk.entity.Student;
import pl.coderslab.bk.repository.StudentRepository;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void save (Student student){
        studentRepository.save(student);
    }

    public void delete (Student student){
        studentRepository.delete(student);
    }

    public void edit (Student student){
        Student studentToEdit = studentRepository.getOne(student.getId());
        studentRepository.save(studentToEdit);
    }

    public Student read (Long id){
        return  studentRepository.getOne(id);}
    
    public List<Student> findAll (){
         return studentRepository.findAll();
    }

    public List<Student> findAllByGroupId(long id){ return studentRepository.findAllByGroupsId(id);}

    public Student findOneByNameAndSurname (String name, String surname){
        return studentRepository.findOneByNameAndSurname(name, surname);
    }
}
