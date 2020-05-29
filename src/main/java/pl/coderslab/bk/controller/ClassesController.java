package pl.coderslab.bk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.bk.entity.Classes;
import pl.coderslab.bk.entity.Group;
import pl.coderslab.bk.entity.Presence;
import pl.coderslab.bk.entity.Student;
import pl.coderslab.bk.service.ClassesService;
import pl.coderslab.bk.service.GroupService;

import java.util.List;

@Controller
@RequestMapping ("/classes")
public class ClassesController {
    private final GroupService groupService;
    private final ClassesService classesService;


    public ClassesController(GroupService groupService, ClassesService classesService) {
        this.groupService = groupService;
        this.classesService = classesService;
    }

    @GetMapping("/{id}")
    public String get(@PathVariable long id, Model model){
        Group group = groupService.read(id) ;
        model.addAttribute("group", group);
        model.addAttribute("classes", new Classes());

        return "classes";
    }

    @PostMapping ("/{id}")
    public String post(@PathVariable long id, @ModelAttribute Classes classes){
        Group group = groupService.read(id);
        classes.setGroup(group);
        classesService.save(classes);


        return "redirect:/classes/presence/"+classes.getId();
    }

    @GetMapping("presence/{classId}")
    public String pres(@PathVariable long classId, Model model){
        Classes classes = classesService.read(classId);
        model.addAttribute("classes",classes);
        return "presenceView";
    }

    @PostMapping("presence/{classId}")
    @ResponseBody
    public String presUpdate(
            @PathVariable long classId,
            @ModelAttribute List<Presence> presenceList
     ) {

        return "data";
    }


    @GetMapping("/list")
    public String getList(Model model) {
        model.addAttribute("classes", classesService.findAll());
        return "classesList";
    }


}
