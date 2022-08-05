package com.ibetar.apirestpersona.service;

import com.ibetar.apirestpersona.persistence.entity.Persona;

import java.util.List;

public interface PersonaService extends BaseService<Persona, Long>{

    List<Persona> search(String filter) throws Exception;
}
