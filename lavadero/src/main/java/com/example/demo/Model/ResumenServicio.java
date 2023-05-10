package com.example.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Resumen Servicio")
public class ResumenServicio {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    private Long identidadCliente;
    private Long idVehiculo;
    private long idPersona;
    private long idServicio;


    @OneToOne
    private Vehiculo vehiculos;

    @OneToOne
    private Servicio servicio;
}
