package com.example.demo.Service;

import com.example.demo.Interface.IResumenServicio;
import com.example.demo.Interface.IServicio;
import com.example.demo.InterfaceService.IResumenServicioService;
import com.example.demo.Model.ResumenServicio;
import com.example.demo.Model.Servicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResumenServicioService implements IResumenServicioService {


    @Autowired
    private IResumenServicio data;

    @Override
    public List<ResumenServicio> listar() {
        return (List<ResumenServicio>)
                data.findAll();
    }

    @Override
    public Optional<ResumenServicio> listarId(Long id) {
        return data.findById(id);
    }

    @Override
    public int save(ResumenServicio r) {
        int res = 0;
        ResumenServicio resumenServicio = data.save(r);
        if (!resumenServicio.equals(null)) {
            res = 1;
        }
        return res;
    }

    @Override
    public void delete(Long identidadCliente) {
        data.deleteById(identidadCliente);
    }


}
