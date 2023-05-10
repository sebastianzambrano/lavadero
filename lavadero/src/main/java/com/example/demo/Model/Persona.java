package com.example.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "personas", uniqueConstraints = @UniqueConstraint(columnNames = "documentoIdentidad"))
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    private Long documentoIdentidad;
    private String nombre;
    private String apellido;
    private Long   numeroContacto;
    private String username;
    private String password;

    @OneToMany(mappedBy = "persona")
    private List<Vehiculo> vehiculos;

    @OneToMany(mappedBy = "persona")
    private List<Servicio> servicios;





}
