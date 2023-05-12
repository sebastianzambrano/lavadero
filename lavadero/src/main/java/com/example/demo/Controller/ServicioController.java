package com.example.demo.Controller;

import com.example.demo.InterfaceService.IServicioService;
import com.example.demo.Model.Servicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class ServicioController {
    @Autowired
    private IServicioService service;

    @GetMapping("/listarservicio")
    public String listar(Model model) {
        List<Servicio> servicios = service.listar();
        model.addAttribute("servicios", servicios);
        return "servicio";
    }

    @GetMapping("/crearservicio")
    public String agregar(Model model) {
        model.addAttribute("servicio", new Servicio());
        return "servicio";
    }

    @PostMapping("/guardarservicio")
    public String save(@Validated Servicio s) {
        service.save(s);
        return "redirect:/listar";
    }

    @GetMapping("/editarservicio/{id}")
    public String editar(@PathVariable Long id, Model model) {
        Optional<Servicio> servicio = service.listarId(id);
        model.addAttribute("servicio", servicio);
        return "form";
    }

    @GetMapping("/eliminarservicio/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/listar";

    }


}
