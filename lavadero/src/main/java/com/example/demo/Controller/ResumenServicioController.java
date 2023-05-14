package com.example.demo.Controller;

import com.example.demo.InterfaceService.IResumenServicioService;
import com.example.demo.Model.ResumenServicio;
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
public class ResumenServicioController {

    @Autowired
    private IResumenServicioService service;

    @GetMapping("/listarfactura")
    public String listar(Model model) {
        List<ResumenServicio> facturas = service.listar();
        model.addAttribute("facturas", facturas);
        return "listarfacturas";
    }

    @GetMapping("/crearfactura")
    public String agregar(Model model) {
        model.addAttribute("factura", new ResumenServicio());
        return "crearfacturas";
    }

    @PostMapping("/guardarfactura")
    public String save(@Validated ResumenServicio f) {
        service.save(f);
        return "redirect:/listarfactura";
    }

    @GetMapping("/editarfactura/{id}")
    public String editar(@PathVariable Long id, Model model) {
        Optional<ResumenServicio> factura = service.listarId(id);
        model.addAttribute("factura", factura);
        return "crearfacturas";
    }

    @GetMapping("/eliminarfactura/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/listarfactura";

    }


}
