package com.example.demo.InterfaceService;

import com.example.demo.Model.Servicio;
import com.example.demo.Model.Vehiculo;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication(scanBasePackages = {"com.example.CrudSpringBoot"})
public interface IServicioService {
    public List<Servicio> listar();
    public Optional<Servicio> listarId();
    public int save (Servicio s);

    public void delete(Long id);
}
