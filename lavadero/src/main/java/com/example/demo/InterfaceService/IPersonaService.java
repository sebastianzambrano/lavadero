package com.example.demo.InterfaceService;

import com.example.demo.Model.Persona;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication(scanBasePackages = {"com.example.CrudSpringBoot"})
public interface IPersonaService {

    public List<Persona> listar();

    Optional<Persona> listarId(Long id);

    public int save (Persona p);

    public void delete(Long id);

    //public void update(Long id);


}
