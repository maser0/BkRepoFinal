package pl.coderslab.bk.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.bk.entity.Trainer;
import pl.coderslab.bk.service.TrainerService;

import javax.validation.Valid;

@Controller
//@Secured("Role_Admin")
@RequestMapping("/admin/trainer")
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
    public String post (@Valid @ModelAttribute Trainer trainer, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            return "trainerCreate";
        }
        trainerService.save(trainer);
        return "redirect:/admin/trainer/list";
    }


    @GetMapping("/list")
    public String getList(Model model) {
        model.addAttribute("trainers", trainerService.findAll());
        return "trainerList";
    }


    @GetMapping("/delete/{id}")

    public String delete(@PathVariable long id) {
        Trainer trainerToDelete = trainerService.read(id);
        trainerService.delete(trainerToDelete);
        return "redirect:/admin/trainer/list";
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
