package co.edu.usco.backendparcial.controller;

import co.edu.usco.backendparcial.service.AsignatureService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("asignatures")
@AllArgsConstructor
public class Asignatures {
    private final AsignatureService asignatureService;

    @GetMapping
    public String asignatures(Model model) {
        model.addAttribute("asignaturas", asignatureService.getAllAsignatures());
        return "asignatures";
    }
}
