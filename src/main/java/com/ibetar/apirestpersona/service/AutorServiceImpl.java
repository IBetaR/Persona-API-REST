package com.ibetar.apirestpersona.service;

import com.ibetar.apirestpersona.persistence.entity.Autor;
import com.ibetar.apirestpersona.persistence.repository.AutorRepository;
import com.ibetar.apirestpersona.persistence.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService{

    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }
}
