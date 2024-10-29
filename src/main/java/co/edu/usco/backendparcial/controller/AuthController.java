package co.edu.usco.backendparcial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("auth")
public class AuthController {

    @GetMapping("login")
    public String login() {
        return "login";
    }

    @GetMapping("denied")
    public String denied() {
        return "denied";
    }
}