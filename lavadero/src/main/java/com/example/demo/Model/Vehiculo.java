package com.example.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "vehiculos",uniqueConstraints = @UniqueConstraint(columnNames = "placa"))
public class Vehiculo {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String tipoVehiculo;
    private String placa;

    @ManyToOne
    private Persona persona;

    @OneToOne(mappedBy = "vehiculos")
    private ResumenServicio resumenServicio;





}
