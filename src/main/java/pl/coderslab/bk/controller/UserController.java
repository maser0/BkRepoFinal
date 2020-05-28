package pl.coderslab.examplesecurity.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.examplesecurity.entity.Role;
import pl.coderslab.examplesecurity.entity.User;
import pl.coderslab.examplesecurity.fixture.InitDataFixture;
import pl.coderslab.examplesecurity.interfaces.RoleService;
import pl.coderslab.examplesecurity.interfaces.UserService;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Controller
public class UserController {

    private final InitDataFixture initDataFixture;

    public UserController(InitDataFixture initDataFixture) {
        this.initDataFixture = initDataFixture;
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
        return "initialized";
    }


}
