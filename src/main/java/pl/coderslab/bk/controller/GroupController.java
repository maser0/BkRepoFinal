package pl.coderslab.bk.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.bk.entity.Group;
import pl.coderslab.bk.service.GroupService;

@Controller
//@Secured("Role_Admin")
@RequestMapping("/group")
public class GroupController {

    private final GroupService groupService;

    public GroupController(GroupService groupService) {
        this.groupService = groupService;
    }

    @GetMapping
    public String get(Model model) {
        model.addAttribute("group", new Group());
        return "groupCreate";
    }

    @PostMapping
    public String post (@ModelAttribute Group group){
        groupService.save(group);
        return "groupList";
    }


    @GetMapping("/list")
    public String getList(Model model) {
        model.addAttribute("groups", groupService.findAll());
        return "groupList";
    }


    @GetMapping("/delete/{id}")
    @ResponseBody
    public String delete(@PathVariable long id) {
        Group groupToDelete = groupService.read(id);
        groupService.delete(groupToDelete);
        return "Deleted";
    }

    @GetMapping("/confirmDelete/{id}")
    public String confirmDelete(@PathVariable long id, Model model) {
        Group group = groupService.read(id);
        model.addAttribute("group", group);
        return "confirmDeleteGroup";
    }

    @GetMapping("/{id}")
    public String edit(@PathVariable long id,Model model){
        Group group = groupService.read(id);
        model.addAttribute("group", group);
        return "groupCreate";
    }

}
