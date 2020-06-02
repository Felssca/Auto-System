/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.toyota.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Felipe Saboya SCA _ TCC
 */
public class EntityManagerFacade {
    
    
    private EntityManager em;

    public EntityManager getEntityManager() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ToyotaTCC-ejbPU");
        em = emf.createEntityManager();
        return em;
    }

    
}
