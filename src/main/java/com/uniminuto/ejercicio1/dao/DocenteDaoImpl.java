/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uniminuto.ejercicio1.dao;

import com.uniminuto.ejercicio1.entityEjb.Docente;
import com.uniminuto.ejercicio1.entityEjb.Estudiante;
import com.uniminuto.ejercicio1.entityEjb.Materia;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DocenteDaoImpl {
    
    @PersistenceContext(unitName = "movie-unit", type = PersistenceContextType.EXTENDED)
    private EntityManager em;

    public Long insert(Docente docente) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction tx = null;
        Long servicioID = null;
        try {
            tx = session.beginTransaction();
            servicioID = (Long) session.save(docente);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return servicioID;
    }

    public boolean delete(Long id) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Docente p = (Docente) session.load(Docente.class, new Long(id));
            if (null != p) {
                session.delete(p);
            }

            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return true;
    }

    
    public Materia findById(Long idDocente) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Query query = session.createQuery("from Docente S where S.idDocente = :id ");
        query.setParameter("id", idDocente);
        Materia servicio = (Materia) query.getSingleResult();
        return servicio;
    }

    
}
