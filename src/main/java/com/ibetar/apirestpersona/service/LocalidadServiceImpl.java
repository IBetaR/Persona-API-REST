package com.ibetar.apirestpersona.service;

import com.ibetar.apirestpersona.persistence.entity.Localidad;
import com.ibetar.apirestpersona.persistence.repository.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }
}
