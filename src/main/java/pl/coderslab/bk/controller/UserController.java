package pl.coderslab.bk.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.bk.fixture.InitDataFixture;

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
        return "done";
    }


}
