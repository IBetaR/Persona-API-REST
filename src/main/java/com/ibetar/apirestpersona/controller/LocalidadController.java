package com.ibetar.apirestpersona.controller;

import com.ibetar.apirestpersona.persistence.entity.Localidad;
import com.ibetar.apirestpersona.service.LocalidadService;
import com.ibetar.apirestpersona.service.LocalidadServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/localidades")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl> {
}
