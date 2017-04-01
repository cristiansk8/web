package com.uniminuto.ejercicio1.entityEjb;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Materia")
public class Materia {

    @Id
    @Column(name = "idMateria")
    private Long idMateria;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "creditos")
    private String creditos;

    @Column(name = "idDocente")
    private String idDocente;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "Estudiante_Materia",
            joinColumns = @JoinColumn(name = "idEstudiante"),
            inverseJoinColumns = @JoinColumn(name = "idMateria"))
    private List<Estudiante> estudiantes;

    public Materia() {

    }

    public Long getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Long idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCreditos() {
        return creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }

    public String getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(String idDocente) {
        this.idDocente = idDocente;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

   

}
