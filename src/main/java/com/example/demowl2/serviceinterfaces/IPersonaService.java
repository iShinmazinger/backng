package com.example.demowl2.serviceinterfaces;

import com.example.demowl2.entities.Persona;

import java.util.List;

public interface IPersonaService {
    public void insert(Persona persona);
    public List<Persona> list();
    public void delete(int personaid);
}
