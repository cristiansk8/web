package com.uniminuto.ejercicio1.dao;

import com.uniminuto.ejercicio1.entityEjb.Estudiante;
import com.uniminuto.ejercicio1.entityEjb.Materia;
import java.util.List;

public interface MateriaDao {

    Long insert(Materia materia);

    boolean delete(Long id);

    List<Estudiante> findEstudianteListByMateriaId(Long idEstudiante);

}
