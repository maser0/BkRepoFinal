package pl.coderslab.bk.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.bk.entity.Student;

import pl.coderslab.bk.service.StudentService;

@Controller
//@Secured("Role_Admin")
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public String get(Model model) {
        model.addAttribute("student", new Student());
        return "studentCreate";
    }

    @PostMapping
    public String post (@ModelAttribute Student student){
        studentService.save(student);
        return "studentList";
    }


    @GetMapping("/list")
    public String getList(Model model) {
        model.addAttribute("students", studentService.findAll());
        return "studentList";
    }


    @GetMapping("/delete/{id}")
    @ResponseBody
    public String delete(@PathVariable long id) {
        Student studentToDelete = studentService.read(id);
        studentService.delete(studentToDelete);
        return "Deleted";
    }

    @GetMapping("/confirmDelete/{id}")
    public String confirmDelete(@PathVariable long id, Model model) {
        Student student = studentService.read(id);
        model.addAttribute("student", student);
        return "confirmDeleteStudent";
    }
    @GetMapping("/{id}")
    public String edit(@PathVariable long id,Model model){
        Student student = studentService.read(id);
        model.addAttribute("student", student);
        return "studentCreate";
    }

}

