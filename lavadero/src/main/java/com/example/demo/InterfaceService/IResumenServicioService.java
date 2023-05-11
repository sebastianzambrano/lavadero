package com.example.demo.InterfaceService;

import com.example.demo.Model.ResumenServicio;
import com.example.demo.Model.Servicio;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication(scanBasePackages = {"com.example.CrudSpringBoot"})
public interface IResumenServicioService {
    public List<ResumenServicio> listar();
    public Optional<ResumenServicio> listarId(Long identidadCliente);
    public int save (ResumenServicio f);

    public void delete(Long identidadCliente);
}
