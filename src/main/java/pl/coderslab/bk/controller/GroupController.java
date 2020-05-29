package pl.coderslab.bk.controller;


import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.bk.entity.Group;
import pl.coderslab.bk.entity.Student;
import pl.coderslab.bk.service.GroupService;
import pl.coderslab.bk.service.StudentService;

import javax.validation.Valid;
import java.util.List;

@Controller
//@Secured("Role_Admin")
//@RequestMapping("/admin/group")
public class GroupController {

    private final GroupService groupService;
    private final StudentService studentService;

    public GroupController(GroupService groupService, StudentService studentService) {
        this.groupService = groupService;
        this.studentService = studentService;
    }

    @GetMapping ("/admin/group")
    public String get(Model model) {
        model.addAttribute("group", new Group());
        return "groupCreate";
    }

    @PostMapping ("/admin/group")
    public String post (@Valid @ModelAttribute Group group, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            return "groupCreate";
        }
        groupService.save(group);
        return "redirect:/group/list";
    }


    @GetMapping("/group/list")
    public String getList(Model model) {
        model.addAttribute("groups", groupService.findAll());
        return "groupList";
    }


    @GetMapping("/admin/group/delete/{id}")
//    @ResponseBody
    public String delete(@PathVariable long id) {
        Group groupToDelete = groupService.read(id);
        groupService.delete(groupToDelete);
        return "redirect:/group/list";
    }

    @GetMapping("/admin/group/confirmDelete/{id}")
    public String confirmDelete(@PathVariable long id, Model model) {
        Group group = groupService.read(id);
        model.addAttribute("group", group);
        return "confirmDeleteGroup";
    }

    @GetMapping("/admin/group/{id}")
    public String edit(@PathVariable long id,Model model){
        Group group = groupService.read(id);
        model.addAttribute("group", group);
        return "groupCreate";
    }

    @ModelAttribute("students")
    public List<Student> students(){
        return studentService.findAll();
    }
}
