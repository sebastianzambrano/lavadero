package com.example.demo.InterfaceService;

import com.example.demo.Model.Vehiculo;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication(scanBasePackages = {"com.example.CrudSpringBoot"})
public interface IVehiculoService {

    public List<Vehiculo> listar();
    public Optional<Vehiculo> listarPlaca(Long placa);
    public int save (Vehiculo v);
    public void delete(Long placa);
}
