package com.ibetar.apirestpersona.persistence.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "localidad")
public class Localidad extends Base{

    @Column(name = "denomination")
    private String denomination;
}
