package com.ibetar.apirestpersona.service;

import com.ibetar.apirestpersona.persistence.entity.Persona;
import com.ibetar.apirestpersona.persistence.repository.BaseRepository;
import com.ibetar.apirestpersona.persistence.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService{

    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<Persona> search(String filter) throws Exception {
        try {
            //List<Persona> personas = personaRepository.findByNameContainingOrLastnameContaining(filter,filter);
            //List<Persona> personas = personaRepository.search(filter);
            List<Persona> personas = personaRepository.searchNative(filter);
            return personas;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Persona> search(String filter, Pageable pageable) throws Exception {
        try {
            //Page<Persona> personas = personaRepository.findByNameContainingOrLastnameContaining(filter,filter, pageable);
            //Page<Persona> personas = personaRepository.search(filter, pageable);
            Page<Persona> personas = personaRepository.searchNative(filter, pageable);
            return personas;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}



//    @Override
//    @Transactional
//    public List<Persona> findAll() throws Exception {
//        try {
//            List<Persona> entities = personaRepository.findAll();
//            return entities;
//        } catch (Exception e) {
//            throw new Exception(e.getMessage());
//        }
//    }
//
//    @Override
//    @Transactional
//    public Persona findById(Long id) throws Exception {
//        try {
//            Optional<Persona> entityOptional = personaRepository.findById(id);
//            return entityOptional.get();
//        } catch (Exception e) {
//            throw new Exception(e.getMessage());
//        }
//    }
//
//    @Override
//    @Transactional
//    public Persona save(Persona entity) throws Exception {
//        try {
//            entity = personaRepository.save(entity);
//            return entity;
//        } catch (Exception e) {
//            throw new Exception(e.getMessage());
//        }
//    }
//
//    @Override
//    @Transactional
//    public Persona update(Long id, Persona entity) throws Exception {
//        try {
//            Optional<Persona> entityOptional = personaRepository.findById(id);
//            Persona persona = entityOptional.get();
//            persona = personaRepository.save(entity);
//            return persona;
//
//        } catch (Exception e) {
//            throw new Exception(e.getMessage());
//        }
//    }
//
//    @Override
//    @Transactional
//    public boolean delete(Long id) throws Exception {
//        try {
//            if (personaRepository.existsById(id)){
//                personaRepository.deleteById(id);
//                return true;
//            } else {
//                throw new Exception();
//            }
//        } catch (Exception e) {
//            throw new Exception(e.getMessage());
//        }
//
//    }
//}
