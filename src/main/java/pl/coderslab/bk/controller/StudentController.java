package pl.coderslab.bk.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.bk.entity.Presence;
import pl.coderslab.bk.entity.Student;

import pl.coderslab.bk.service.StudentService;
import pl.coderslab.bk.validation.TestValidationGroup;

import javax.validation.Valid;
import java.util.List;

@Controller
//@Secured("Role_Admin")
@RequestMapping("/admin/student")
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
    public String post (@Valid @ModelAttribute Student student, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            return "studentCreate";
        }
        try {
            studentService.save(student);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/admin/student/list";
    }


    @GetMapping("/list")
    public String getList(Model model) {
        model.addAttribute("students", studentService.findAll());
        return "studentList";
    }


    @GetMapping("/delete/{id}")

    public String delete(@PathVariable long id) {
        Student studentToDelete = studentService.read(id);
        studentService.delete(studentToDelete);
        return "redirect:/admin/student/list";
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

    @GetMapping("/presence/{id}")
    public String presenceStudent(@PathVariable long id,Model model){
        Student student = studentService.read(id);
        List<Presence> presenceList = student.getPresence();
        model.addAttribute("presenceList", presenceList);
        return "studentPresence";
    }

}

