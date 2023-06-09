package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.InterfaceService.IPersonaService;
import com.example.demo.Model.Persona;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class PersonaController {

    @Autowired
    private IPersonaService service;

    @GetMapping("/listarpersona")
    public String listar(Model model){
        List<Persona> personas= service.listar();
        model.addAttribute("personas", personas);
        return "listarpersonas";
    }

    @GetMapping("/crearpersona")
    public String agregar(Model model){
        model.addAttribute("persona", new Persona());
        return "crearpersonas";
    }

    @PostMapping("/guardarpersona")
    public String save(@Validated Persona p){
        service.save(p);
        return "redirect:/listarpersona";
    }

    @GetMapping("/editarpersona/{id}")
    public String editar(@PathVariable Long id, Model model){
        Optional<Persona> persona = service.listarId(id);
        model.addAttribute("persona", persona);
        return "crearpersonas";
    }

    @GetMapping("/eliminarpersona/{id}")
    public String delete(@PathVariable Long id){
        service.delete(id);
        return "redirect:/listarpersona";

    }

}
