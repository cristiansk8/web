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

public class MateriaDaoImpl implements MateriaDao {

    @PersistenceContext(unitName = "movie-unit", type = PersistenceContextType.EXTENDED)
    private EntityManager em;

    @Override
    public Long insert(Materia materia) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction tx = null;
        Long servicioID = null;
        try {
            tx = session.beginTransaction();
            servicioID = (Long) session.save(materia);
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

    @Override
    public boolean delete(Long id) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Materia p = (Materia) session.load(Materia.class, new Long(id));
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

    
//    @Override
//    public Materia findById(Long MateriaId) {
//        SessionFactory sf = HibernateUtil.getSessionFactory();
//        Session session = sf.openSession();
//        Query query = session.createQuery("from Servicio S where S.idServicio = :id ");
//        query.setParameter("id", MateriaId);
//        Materia servicio = (Materia) query.getSingleResult();
//        return servicio;
//    }

    @Override
    public List<Estudiante> findEstudianteListByMateriaId(Long idEstudiante) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Query query = session.createQuery("from Materia P where P.Estudiante.idEstudiante = :id ");
        query.setParameter("id", idEstudiante);
        List<Estudiante> materias = query.getResultList();
        return materias;
    }


}
