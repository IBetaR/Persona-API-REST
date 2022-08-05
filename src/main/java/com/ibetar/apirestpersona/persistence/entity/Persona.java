package com.ibetar.apirestpersona.persistence.entity;

import io.swagger.models.auth.In;
import lombok.Data;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

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



}
