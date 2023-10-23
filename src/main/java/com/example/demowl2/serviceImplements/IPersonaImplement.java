package com.example.demowl2.serviceImplements;


import com.example.demowl2.serviceinterfaces.IPersonaService;
import com.example.demowl2.entities.Persona;
import com.example.demowl2.repositories.IPersonaRepository;
import com.example.demowl2.serviceinterfaces.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IPersonaImplement implements IPersonaService {

    @Autowired
    private IPersonaRepository pR;

    @Override
    public void insert(Persona persona) {
        pR.save(persona);
    }

    @Override
    public List<Persona> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int personaid) {
        pR.deleteById(personaid);
    }
}
