package com.example.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Servicio {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "id")
    private Long id;

    private String tipoServicio;
    private Long valorServicio;
    @ManyToOne
    private Persona persona;
}
