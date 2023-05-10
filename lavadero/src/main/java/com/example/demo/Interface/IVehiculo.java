package com.example.demo.Interface;

import com.example.demo.Model.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVehiculo extends JpaRepository<Vehiculo,Long> {
}
