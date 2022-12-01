package com.example.loginnew2.securitycontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class SecurityController {
    @GetMapping("/login")
    public String login(){
        return "loginPage";
    }
    @GetMapping("/home")
    public String home(){
        return "index";
    }
}
