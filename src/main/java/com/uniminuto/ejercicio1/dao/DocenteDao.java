
package com.uniminuto.ejercicio1.dao;

import com.uniminuto.ejercicio1.entityEjb.Docente;

public interface DocenteDao {
    Long insert(Docente docente);

    boolean delete(Long id);

    Docente findById(Long idDocente);
}
