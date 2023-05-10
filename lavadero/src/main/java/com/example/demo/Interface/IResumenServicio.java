package com.example.demo.Interface;

import com.example.demo.Model.ResumenServicio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IResumenServicio extends JpaRepository<ResumenServicio,Long> {
}
