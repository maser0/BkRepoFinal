package pl.coderslab.bk.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.bk.entity.User;
import pl.coderslab.bk.fixture.InitDataFixture;
import pl.coderslab.bk.interfaces.UserService;

@Controller
public class UserController {

    private final InitDataFixture initDataFixture;
    private final UserService userService;

    public UserController(InitDataFixture initDataFixture, UserService userService) {
        this.initDataFixture = initDataFixture;
        this.userService = userService;
    }

    @GetMapping("/admin")
    @ResponseBody
    public String admin(
            @AuthenticationPrincipal UserDetails customUser
    ) {
        return "You are logged as " + customUser;
    }

    @GetMapping("/about")
    public String about() {
        return "user/panel";
    }

    @GetMapping("/initData")
    @ResponseBody
    public String createUser() {

        this.initDataFixture.initRoles();
        this.initDataFixture.initUsers();
        this.initDataFixture.initStudents();
        this.initDataFixture.initGroup();
        return "done";
    }

    @GetMapping("/createUser")
    public String cuser(Model model){
        model.addAttribute("user", new User());
        return "createUser";
    }

    @PostMapping("/createUser")
    @ResponseBody
    public String post(@ModelAttribute User user){
        userService.saveUser(user);
        return "created";
    }


}
