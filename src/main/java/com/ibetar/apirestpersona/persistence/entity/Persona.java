package com.ibetar.apirestpersona.persistence.entity;

import io.swagger.models.auth.In;
import lombok.Data;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "persona")
@Data
//@Audited
public class Persona extends Base {

    @Column(name = "name")
    private String name;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "dni")
    private int dni;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_domicilio")
    private Domicilio domicilio;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(
            name = "persona_libro",
            joinColumns = @JoinColumn (name = "persona_id"),
            inverseJoinColumns = @JoinColumn (name = "libro_id")
    )
    private List<Libro> libros = new ArrayList<Libro>();

}
