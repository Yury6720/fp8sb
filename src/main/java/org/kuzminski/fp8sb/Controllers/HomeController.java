package org.kuzminski.fp8sb.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String getHomePage() {
        return "homePage";
    }

    @GetMapping("/registration")
    private String newUserRegistration (){
        return "newUserRegistrationForm";
    }
}
