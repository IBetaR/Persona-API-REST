package com.ibetar.apirestpersona.service;

import com.ibetar.apirestpersona.persistence.entity.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PersonaService extends BaseService<Persona, Long>{

    List<Persona> search(String filter) throws Exception;
    Page<Persona> search(String filter, Pageable pageable) throws Exception;
}
