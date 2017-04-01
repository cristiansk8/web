package com.uniminuto.ejercicio1.dao;

import com.uniminuto.ejercicio1.entityEjb.Estudiante;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.uniminuto.ejercicio1.entityEjb.Materia;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.HibernateException;
import org.hibernate.Transaction;

public class EstudianteDaoImpl implements EstudianteDao {

    @PersistenceContext(unitName = "movie-unit", type = PersistenceContextType.EXTENDED)
    private EntityManager em;

    @Override
    public Long insert(Estudiante estudiante) {
         SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction tx = null;
        Long servicioID = null;
        try {
            tx = session.beginTransaction();
            servicioID = (Long) session.save(estudiante);
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
            Estudiante p = (Estudiante) session.load(Estudiante.class, new Long(id));
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

    @Override
    public List<Estudiante> findEstudianteListByMateriaId(Long idMateria) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Query query = session.createQuery("from Estudiante P where P.Materia.idMateria = :id ");
        query.setParameter("id", idMateria);
        List<Estudiante> estidiantes = query.getResultList();
        return estidiantes;
    }



}
