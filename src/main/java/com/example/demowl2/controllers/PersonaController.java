package com.example.demowl2.controllers;


import com.example.demowl2.dtos.PersonaDTO;
import com.example.demowl2.entities.Persona;
import com.example.demowl2.serviceinterfaces.IPersonaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/persona")
public class PersonaController {
    @Autowired
    private IPersonaService pS;

    @PostMapping
    public void registrar(@RequestBody PersonaDTO dto) {
        ModelMapper m = new ModelMapper();
        Persona p= m.map(dto, Persona.class);
        pS.insert(p);
    }
    @GetMapping
    public List<PersonaDTO> listar() {
        return pS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PersonaDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        pS.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody PersonaDTO dto) {
        ModelMapper m = new ModelMapper();
        Persona p = m.map(dto, Persona.class);
        pS.insert(p);
    }
}
