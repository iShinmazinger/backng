package com.example.demowl2.entities;


import javax.persistence.*;

@Entity
@Table(name = "persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int personaid;
    private String personanombre;
    private int personaedad;
    private String personaemail;

    public Persona() {
    }

    public Persona(int personaid, String personanombre, int personaedad, String personaemail) {
        this.personaid = personaid;
        this.personanombre = personanombre;
        this.personaedad = personaedad;
        this.personaemail = personaemail;
    }

    public int getPersonaid() {
        return personaid;
    }

    public void setPersonaid(int personaid) {
        this.personaid = personaid;
    }

    public String getPersonanombre() {
        return personanombre;
    }

    public void setPersonanombre(String personanombre) {
        this.personanombre = personanombre;
    }

    public int getPersonaedad() {
        return personaedad;
    }

    public void setPersonaedad(int personaedad) {
        this.personaedad = personaedad;
    }

    public String getPersonaemail() {
        return personaemail;
    }

    public void setPersonaemail(String personaemail) {
        this.personaemail = personaemail;
    }
}
