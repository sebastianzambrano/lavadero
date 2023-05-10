package com.example.demo.Interface;

import com.example.demo.Model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersona extends JpaRepository<Persona, Long>  {
}
