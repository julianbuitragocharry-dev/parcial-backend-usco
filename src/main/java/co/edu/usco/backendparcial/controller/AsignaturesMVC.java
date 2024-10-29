package co.edu.usco.backendparcial.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("asignatures")
@AllArgsConstructor
public class AsignaturesMVC {

    @GetMapping
    public String asignatures(Model model) {
        return "asignatures";
    }
}
