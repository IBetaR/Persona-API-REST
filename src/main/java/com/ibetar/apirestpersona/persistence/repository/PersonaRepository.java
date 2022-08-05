package com.ibetar.apirestpersona.persistence.repository;

import com.ibetar.apirestpersona.persistence.entity.Persona;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {


    List<Persona> findByNameContainingOrLastnameContaining(String name, String lastname);

    boolean existsByDni(int dni);
//
//    @Query("select p from Persona p where p.name like concat('%', ?1, '%') or p.lastname like concat('%', ?2, '%')")
//    List<Persona> searchPersona (String name, String lastname);
//
    @Query("SELECT p FROM Persona p WHERE p.name LIKE %:filter% or p.lastname LIKE %:filter%")
    List<Persona> search(@Param("filter") String filter);

    @Query(
            value = "SELECT * FROM persona WHERE persona.name LIKE %:filter% or persona.lastname LIKE %:filter%",
            nativeQuery = true
    )
    List<Persona> searchNative(@Param("filter") String filter);
}
