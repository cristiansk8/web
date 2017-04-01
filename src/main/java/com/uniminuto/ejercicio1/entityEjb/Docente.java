package com.uniminuto.ejercicio1.entityEjb;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="Docentes")

public class Docente {

    @Id
    @Column(name = "idDocente")
    private Long iddocente;
    
    
    @Column (name= "nombre")
    private String nombreDocente;
    
    @Column (name="apellido")
    private String apellidoDocente;
    
    @Column (name="direccion")
    private String direccionDocente;
    
    @Column (name="especificacion")
    private String especificacionDocenten;

    public String getNombreDocente() {
        return nombreDocente;
    }

    public void setNombreDocente(String nombreDocente) {
        this.nombreDocente = nombreDocente;
    }

    public String getApellidoDocente() {
        return apellidoDocente;
    }

    public void setApellidoDocente(String apellidoDocente) {
        this.apellidoDocente = apellidoDocente;
    }

    public String getDireccionDocente() {
        return direccionDocente;
    }

    public void setDireccionDocente(String direccionDocente) {
        this.direccionDocente = direccionDocente;
    }

    public String getEspecificacionDocenten() {
        return especificacionDocenten;
    }

    public void setEspecificacionDocenten(String especificacionDocenten) {
        this.especificacionDocenten = especificacionDocenten;
    }
    
    @OneToMany(mappedBy = "Docente", cascade = CascadeType.ALL)
    private List<Materia> materias;

    public Docente() {

    }

    public Long getIddocente() {
        return iddocente;
    }

    public void setIddocente(Long iddocente) {
        this.iddocente = iddocente;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    
    
    
}
