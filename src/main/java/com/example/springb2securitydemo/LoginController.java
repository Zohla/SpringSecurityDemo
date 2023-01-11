package com.example.springb2securitydemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {

        return "login";

    }

    @GetMapping("/secret")
    public String secretZ(){
        return "secret";
    }

    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }
}
