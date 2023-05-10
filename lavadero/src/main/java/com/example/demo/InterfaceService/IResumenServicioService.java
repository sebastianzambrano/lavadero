package com.example.demo.InterfaceService;

import com.example.demo.Model.ResumenServicio;
import com.example.demo.Model.Servicio;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication(scanBasePackages = {"com.example.CrudSpringBoot"})
public interface IResumenServicioService {
    public List<Servicio> listar();
    public Optional<Servicio> listarId();
    public int save (ResumenServicio r);

    public void delete(Long id);
}
