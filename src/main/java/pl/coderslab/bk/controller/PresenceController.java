package pl.coderslab.bk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.bk.entity.Presence;
import pl.coderslab.bk.entity.Student;
import pl.coderslab.bk.service.StudentService;

import java.util.List;

@Controller
@RequestMapping ("/presence")
public class PresenceController {
    private final StudentService studentService;


    public PresenceController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/{id}")
    public String get(@PathVariable long id, Model model){
        List<Student> students = studentService.findAllByGroupId(id);
        model.addAttribute("students", students);
        return "presence";
    }

//    @PostMapping
//    public String post(@ModelAttribute Presence presence){
//
//    }


}
