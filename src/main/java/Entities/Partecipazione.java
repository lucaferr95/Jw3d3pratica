package Entities;

import Enumeration.Stato;
import jakarta.persistence.*;

@Entity

public class Partecipazione {
    @Id
    @GeneratedValue
    private int id;


    @ManyToOne
    @JoinColumn(name = "evento_id")
    private Evento evento;

    @Enumerated(EnumType.STRING)
    private Stato stato;

    @ManyToOne
    @JoinColumn(name = "persona_id")
    private Persona persona;

    public Partecipazione() {
    }

    public Partecipazione(Stato stato) {


        this.stato = stato;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Stato getStato() {
        return stato;
    }

    public void setStato(Stato stato) {
        this.stato = stato;
    }

    @Override
    public String toString() {
        return "Partecipazione{" +
                "id=" + id +
                ", evento=" + evento +
                ", stato=" + stato +
                ", persona=" + persona +
                '}';
    }



}
