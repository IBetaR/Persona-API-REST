package com.ibetar.apirestpersona.controller;

import com.ibetar.apirestpersona.persistence.entity.Persona;
import com.ibetar.apirestpersona.service.PersonaServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas")
public class PersonaController extends BaseControllerImpl <Persona, PersonaServiceImpl>{

}
