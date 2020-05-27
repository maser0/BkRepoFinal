package pl.coderslab.bk.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.bk.entity.Trainer;
import pl.coderslab.bk.service.TrainerService;

@Controller
//@Secured("Role_Admin")
@RequestMapping("/trainer")
public class TrainerController {

    private final TrainerService trainerService;

    public TrainerController(TrainerService trainerService) {
        this.trainerService = trainerService;
    }



    @GetMapping
    public String get(Model model) {
        model.addAttribute("trainer", new Trainer());
        return "trainerCreate";
    }

    @PostMapping
    public String post (@ModelAttribute Trainer trainer){
        trainerService.save(trainer);
        return "trainerList";
    }


    @GetMapping("/list")
    public String getList(Model model) {
        model.addAttribute("trainers", trainerService.findAll());
        return "trainerList";
    }


    @GetMapping("/delete/{id}")
    @ResponseBody
    public String delete(@PathVariable long id) {
        Trainer trainerToDelete = trainerService.read(id);
        trainerService.delete(trainerToDelete);
        return "Deleted";
    }

    @GetMapping("/confirmDelete/{id}")
    public String confirmDelete(@PathVariable long id, Model model) {
        Trainer trainer = trainerService.read(id);
        model.addAttribute("trainer", trainer);
        return "confirmDeleteTrainer";
    }

    @GetMapping("/{id}")
    public String edit(@PathVariable long id,Model model){
        Trainer trainer = trainerService.read(id);
        model.addAttribute("trainer", trainer);
        return "trainerCreate";
    }

}
