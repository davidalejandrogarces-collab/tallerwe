/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uvpalmira.fpoe.persistencia;

import co.edu.uvpalmira.fpoe.jpalib.AbstractDAO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import java.util.List;
import java.util.logging.Logger;
import univalle.edu.co.fpoe.modelo.Asignatura;

/**
 *
 * @author Sala Sistemas
 */
public class AsignaturaDAO extends AbstractDAO<Asignatura> {

    public AsignaturaDAO(EntityManagerFactory emf) {
        super(Asignatura.class, emf);
    }

    public Asignatura buscarPorCodigo(String codigo) {
        EntityManager em = super.getEntityManager();
        return (Asignatura) em.createNamedQuery("Asignatura.Buscarporcodigo")
                .setParameter("codigo", codigo)
                .getSingleResult();

    }

    public List<Asignatura> buscarPorEscuela(String codigoEscuela) {
        EntityManager em = super.getEntityManager();
        return em.createNamedQuery("Asignatura.BuscarPorEscula")
                .setParameter("prefijo", codigoEscuela)
                .getResultList();

    }
}
