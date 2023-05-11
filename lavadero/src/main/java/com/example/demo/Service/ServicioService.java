package com.example.demo.Service;

import com.example.demo.Interface.IServicio;
import com.example.demo.InterfaceService.IServicioService;
import com.example.demo.Model.Servicio;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ServicioService implements IServicioService {

    @Autowired
    private IServicio data;

    @Override
    public List<Servicio> listar() {
        return (List<Servicio>)
                data.findAll();
    }

    @Override
    public Optional<Servicio> listarId(Long id) {
        return data.findById(id);
    }

    @Override
    public int save(Servicio s) {
        int res = 0;
        Servicio servicio = data.save(s);
        if (!servicio.equals(null)) {
            res = 1;
        }
        return res;
    }

    @Override
    public void delete(Long id) {
        data.deleteById(id);
    }




}
