package com.example.demo.Controller;

import com.example.demo.InterfaceService.IVehiculoService;
import com.example.demo.Model.Vehiculo;
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
public class VehiculoController {

    @Autowired
    private IVehiculoService service;

    @GetMapping("/listarvehiculo")
    public String listar(Model model){
        List<Vehiculo> vehiculos= service.listar();
        model.addAttribute("vehiculo", vehiculos);
        return "index";
    }

    @GetMapping("/crearvehiculo")
    public String agregar(Model model){
        model.addAttribute("vehiculo", new Vehiculo());
        return "vehiculo";
    }

    @PostMapping("/guardarvehiculo")
    public String save(@Validated Vehiculo v){
        service.save(v);
        return "redirect:/listar";
    }

    @GetMapping("/editarvehiculo/{placa}")
    public String editar(@PathVariable Long placa, Model model){
        Optional<Vehiculo> vehiculo = service.listarPlaca(placa);
        model.addAttribute("vehiculo", vehiculo);
        return "form";
    }

    @GetMapping("/eliminarvehiculo/{placa}")
    public String delete(@PathVariable Long placa){
        service.delete(placa);
        return "redirect:/listar";

    }


}
