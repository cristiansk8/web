package com.uniminuto.ejercicio1.dao;

import com.uniminuto.ejercicio1.entityEjb.Estudiante;
import java.util.List;

public interface EstudianteDao {

    Long insert(Estudiante estudiante);

    boolean delete(Long id);
    
    List<Estudiante> findEstudianteListByMateriaId(Long ServicioId); 

}
