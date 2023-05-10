package com.example.demo.Interface;

import com.example.demo.Model.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IServicio extends JpaRepository<Servicio,Long> {
}
