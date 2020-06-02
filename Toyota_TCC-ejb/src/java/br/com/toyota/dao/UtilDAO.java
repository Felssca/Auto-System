/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.toyota.dao;

import br.com.toyota.entidades.Cidade;
import br.com.toyota.entidades.Estado;
import br.com.toyota.exceptions.ToyotaException;
import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

/**
 *
 * @author Kabelera
 */
public class UtilDAO {
    
    private EntityManager em;
    private static UtilDAO utilDAO = null;
    
    public EntityManager getEntityManager() {
        EntityManagerFacade emf = new EntityManagerFacade();
        em = emf.getEntityManager();
        return em;
    }
    
    public static UtilDAO getInstace() {
        if (utilDAO == null) {
            utilDAO = new UtilDAO();
        }
        return utilDAO;
    }
    
   
    public Collection<Estado> listarEstados() throws ToyotaException {
        
        Query query = null;
        Collection<Estado> estadoRetornoLista = null;
        
        query = getEntityManager().createNamedQuery("Estado.listarTodos");
        
        
        try {
            estadoRetornoLista = query.getResultList();
        } catch (NoResultException ex) {
            return estadoRetornoLista;
        } catch (Exception e) {
            throw new ToyotaException("Ocorreu um erro inesperado " + e.getCause());
        }
        return estadoRetornoLista;
    }
    public Collection<Cidade> listarCidades(Estado estado) throws ToyotaException {
        
        Query query = null;
        Collection<Cidade> cidadeRetornoLista = null;
        
        query = getEntityManager().createNamedQuery("Estado.listarTodos");
        
        
        try {
            cidadeRetornoLista = query.getResultList();
        } catch (NoResultException ex) {
            return cidadeRetornoLista;
        } catch (Exception e) {
            throw new ToyotaException("Ocorreu um erro inesperado " + e.getCause());
        }
        return cidadeRetornoLista;
    }
}
