package com.example.demo.Controller;

import com.example.demo.InterfaceService.IResumenServicioService;
import com.example.demo.Model.ResumenServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

public class ResumenServicioController {

    @Autowired
    private IResumenServicioService service;

    @GetMapping("/listarfacturas")
    public String listar(Model model) {
        List<ResumenServicio> factura = service.listar();
        model.addAttribute("facturas", factura);
        return "index";
    }

    @GetMapping("/crearfactura")
    public String agregar(Model model) {
        model.addAttribute("factura", new ResumenServicio());
        return "form";
    }

    @PostMapping("/guardarfactura")
    public String save(@Validated ResumenServicio f) {
        service.save(f);
        return "redirect:/listar";
    }

    @GetMapping("/editarfactura/{identidadCliente}")
    public String editar(@PathVariable Long identidadCliente, Model model) {
        Optional<ResumenServicio> factura = service.listarId(identidadCliente);
        model.addAttribute("factura", factura);
        return "form";
    }

    @GetMapping("/eliminarfactura/{identidadCliente}")
    public String delete(@PathVariable Long identidadCliente){
        service.delete(identidadCliente);
        return "redirect:/listar";

    }


}
