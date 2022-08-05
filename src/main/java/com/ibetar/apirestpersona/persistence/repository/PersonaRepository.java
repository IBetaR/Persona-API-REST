package com.ibetar.apirestpersona.persistence.repository;

import com.ibetar.apirestpersona.persistence.entity.Persona;

import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {
}
