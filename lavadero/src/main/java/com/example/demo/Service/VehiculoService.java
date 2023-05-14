package com.example.demo.Service;

import com.example.demo.Interface.IVehiculo;
import com.example.demo.InterfaceService.IVehiculoService;
import com.example.demo.Model.Vehiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehiculoService implements IVehiculoService {

    @Autowired
    private IVehiculo data;

    @Override
    public List<Vehiculo> listar() {
        return (List<Vehiculo>)
                data.findAll();
    }

    @Override
    public Optional<Vehiculo> listarPlaca(Long id) {
        return data.findById(id);
    }

    @Override
    public int save(Vehiculo v) {
        int res = 0;
        Vehiculo vehiculo = data.save(v);
        if (!vehiculo.equals(null)) {
            res = 1;
        }
        return res;
    }

    @Override
    public void delete(Long id) {
        data.deleteById(id);
    }

}


