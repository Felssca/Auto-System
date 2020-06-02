/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.toyota.dao;

import br.com.toyota.entidades.Compra;
import br.com.toyota.entidades.HistoricoVendasVO;
import br.com.toyota.exceptions.ToyotaException;
import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

/**
 *
 * @author Kabelera
 */
public class CompraDAO {
    
    private EntityManager em;
    private static CompraDAO compraDAO = null;
    
    public EntityManager getEntityManager() {
        EntityManagerFacade emf = new EntityManagerFacade();
        em = emf.getEntityManager();
        return em;
    }
    
    public static CompraDAO getInstace() {
        if (compraDAO == null) {
            compraDAO = new CompraDAO();
        }
        return compraDAO;
    }
    
    public void inserirCompra(Compra compra) throws ToyotaException {

        try {
            EntityTransaction transaction = getEntityManager().getTransaction();
            transaction.begin();            
            em.persist(compra);
            transaction.commit();
            
            
            
            
        } catch (PersistenceException e) {
            throw new ToyotaException("Ocorreu um erro ao tentar inserir Cliente" + e);
        } catch (Exception e) {
            throw new ToyotaException("Ocorreu um erro inesperado " + e);
            
        }
        
        
    }
    
    public Collection<Compra> listarVendas() throws ToyotaException {
        
        Query query = null;
        Collection<Compra> compraRetornoLista = null;
        query = getEntityManager().createNamedQuery("Compra.listarVendas");
        
        
        try {
            compraRetornoLista = query.getResultList();
        } catch (NoResultException ex) {
            return compraRetornoLista;
        } catch (Exception e) {
            throw new ToyotaException("Ocorreu um erro inesperado " + e.getCause());
        }
        return compraRetornoLista;
    }
}
