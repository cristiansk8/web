package com.uniminuto.ejercicio1.servlet;

import com.uniminuto.ejercicio1.dao.DocenteDaoImpl;
import com.uniminuto.ejercicio1.dao.EstudianteDao;
import com.uniminuto.ejercicio1.dao.EstudianteDaoImpl;
import com.uniminuto.ejercicio1.dao.MateriaDaoImpl;
import com.uniminuto.ejercicio1.entityEjb.Docente;
import com.uniminuto.ejercicio1.entityEjb.Estudiante;
import com.uniminuto.ejercicio1.entityEjb.Materia;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        
//        if (request.getParameter("inscribirMateria") != null) {
//            String nombreMateria = request.getParameter("nombre");
//            String creditos = request.getParameter("creditos");
//            String idDocente = request.getParameter("idDocente");
//            Materia materia = new Materia();
//            materia.setCreditos(creditos);
//            MateriaDaoImpl materiaDao =new MateriaDaoImpl();
//            materia.setIdMateria(1l);
//            Long idMateria = materiaDao.insert(materia);
//            request.getRequestDispatcher("/inscripcionMateria.jsp").forward(request, response);
//        }else{
         EstudianteDaoImpl ed = new EstudianteDaoImpl();

        String nombreEst = request.getParameter("yourName");
        String apellidoEst = request.getParameter("apellido");
        String cedulaEst = request.getParameter("cedula");
        Estudiante e = new Estudiante();
        e.setNombre(nombreEst);
        e.setApellido(apellidoEst);
        e.setCedula(cedulaEst);
        e.setIdestudiante(3l);
        long id = ed.insert(e);
        
        
        

        DocenteDaoImpl dd = new DocenteDaoImpl();

        System.out.println("");
    }

    public Materia crearMateriaPojo() {
        Materia materia = new Materia();
        materia.setIdMateria(1l);
        materia.setCreditos("3");
        materia.setIdDocente("1");
        materia.setNombre("calculo");
        return materia;
    }

    public Estudiante crearEstudiantePojo() {
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre("");
        estudiante.setApellido("");
        estudiante.setCedula("84174821");
        return estudiante;
    }

        public Docente crearDocentePojo() {
        Docente docente = new Docente();
        docente.setNombreDocente("");
        docente.setApellidoDocente("");
        docente.getDireccionDocente();
        docente.getEspecificacionDocenten();
        return docente;
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
