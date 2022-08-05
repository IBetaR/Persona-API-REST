package com.ibetar.apirestpersona.persistence.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "libro")
public class Libro extends Base{

    @Column(name = "title")
    private String title;

    @Column(name = "date")
    private int date;

    @Column(name = "genre")
    private String  genre;

    @Column(name = "pages")
    private int pages;
}
