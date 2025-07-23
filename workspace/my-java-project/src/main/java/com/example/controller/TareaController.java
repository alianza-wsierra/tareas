package com.example.controller;

import com.example.model.Tarea;
import com.example.model.TareaService;
import com.example.model.TareaServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TareaController {
    private final TareaService tareaService = new TareaServiceImpl();

    @GetMapping("/")
    public String listarTareas(Model model) {
        model.addAttribute("tareas", tareaService.listarTareas());
        return "index";
    }

    @PostMapping("/crear")
    public String crearTarea(@RequestParam int id, @RequestParam String tipo, @RequestParam String estado) {
        tareaService.crearTarea(new Tarea(id, tipo, estado));
        return "redirect:/";
    }

    @PostMapping("/marcar")
    public String marcarTarea(@RequestParam int id, @RequestParam String estado) {
        tareaService.marcarTarea(id, estado);
        return "redirect:/";
    }
}