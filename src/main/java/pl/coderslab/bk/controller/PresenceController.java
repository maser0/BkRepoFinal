//package pl.coderslab.bk.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//import pl.coderslab.bk.entity.*;
//import pl.coderslab.bk.service.ClassesService;
//import pl.coderslab.bk.service.GroupService;
//import pl.coderslab.bk.service.PresenceService;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Controller
//@RequestMapping ("/presence")
//public class PresenceController {
//    private final GroupService groupService;
//    private final ClassesService classesService;
//    private final PresenceService presenceService;
//
//
//    public PresenceController(GroupService groupService, ClassesService classesService, PresenceService presenceService) {
//        this.groupService = groupService;
//        this.classesService = classesService;
//        this.presenceService = presenceService;
//    }
//
////    @GetMapping("/{id}")  // tutaj to jest group ID
////    public String get(@PathVariable long id, Model model){
////        Group group = groupService.read(id) ;
////        model.addAttribute("group", group);
////        model.addAttribute("classes", new Classes());
////
////        return "classes";
////    }
//
//    @PostMapping ("/{id}")
//    public String post(@PathVariable long id, @ModelAttribute Classes classes){
//        Group group = groupService.read(id);
//        classes.setGroup(group);
//        classesService.save(classes);
//
//
//        return "redirect:/classes/presence/" +classes.getId();
//    }
//
//    @GetMapping("/presence/{classId}")
//    public String pres(@PathVariable long classId, Model model){
//        Classes classes = classesService.read(classId);
////        Presence presence = new Presence();
//        Group group = classes.getGroup();
////        List<Student> students = group.getStudents();
////        students.forEach(presence::setStudent);
//        List<Presence> presences = new ArrayList<>();
//        List<Student> students = classes.getGroup().getStudents();
//        for (Student student : students) {
//            Presence presence = new Presence();
//            presence.setStudent(student);
//            presence.setClasses(classes);
//            presence.setAbsence(false);
//            presenceService.save(presence);
//            presences.add(presence);
//        }
////
////        presences.add(presence);
//        classes.setPresences(presences);
//        List<Trainer> trainers = group.getTrainers();
//        model.addAttribute("classes",classes);
////        model.addAttribute("students",students);
//        model.addAttribute("trainers", trainers);
//
//        return "presenceView";
//    }
//
//    @PostMapping("presence/{classId}")
//    @ResponseBody
//    public String presUpdate( @PathVariable long classId, @ModelAttribute List<Presence> presenceList  ) {
//       Classes classes = classesService.read(classId);
//       classes.setPresences(presenceList);
////        List<Boolean> booleans = new ArrayList<>();
////        String[] params = request.getParameterValues("absence");
////        for (String param : params) {
////            booleans.add(Boolean.parseBoolean(param));
////        }
////        List<Student> students = classes.getGroup().getStudents();
////        for (Student student : students) {
////            presence.setStudent(student);
////            presence.setClasses(classes);
////            presence.setAbsence(false);
////            presenceService.save(presence);
////            presences.add(presence);
////        }
//
//
//        return "data";
//    }
//
//
//
//
//
//
//
//    @GetMapping("/list")
//    public String getList(Model model) {
//        model.addAttribute("classes", classesService.findAll());
//        return "classesList";
//    }
//
//
//}
