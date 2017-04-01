package com.uniminuto.ejercicio1.entityEjb;

import java.util.List;
import javax.persistence.*;


@Entity
@Table(name="estudiante")
public class Estudiante {

    @Id
    @Column(name="idEstudiante")
    private Long idestudiante;

    @Column(name="nombre")
    private String nombre;
    
    @Column(name="cedula")
    private String cedula;
      
    @Column(name="apellido")
    private String apellido;
    
  
//
//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(
//            name = "Estudiante_Materia",
//            joinColumns = @JoinColumn(name = "idMateria"),
//            inverseJoinColumns = @JoinColumn(name = "idEstudiante"))
//    private List<Materia> materias;

    public Estudiante() {

    }

    public Long getIdestudiante() {
        return idestudiante;
    }

    public void setIdestudiante(Long idestudiante) {
        this.idestudiante = idestudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

//    public List<Materia> getMaterias() {
//        return materias;
//    }
//
//    public void setMaterias(List<Materia> materias) {
//        this.materias = materias;
//    }

    
}
