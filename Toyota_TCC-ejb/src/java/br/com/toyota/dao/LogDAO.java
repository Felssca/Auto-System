/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.toyota.dao;

import br.com.toyota.entidades.Cidade;
import br.com.toyota.entidades.Cliente;
import br.com.toyota.entidades.Estado;
import br.com.toyota.entidades.LogSistema;
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
public class LogDAO {
    
    private EntityManager em;
    private static LogDAO logDao = null;
    
    public EntityManager getEntityManager() {
        EntityManagerFacade emf = new EntityManagerFacade();
        em = emf.getEntityManager();
        return em;
    }
    
    public static LogDAO getInstace() {
        if (logDao == null) {
            logDao = new LogDAO();
        }
        return logDao;
    }
    
    public LogSistema inserirLog(LogSistema log) throws ToyotaException {
        LogSistema logResultado = null;
        try {
            EntityTransaction transaction = getEntityManager().getTransaction();
            transaction.begin();            
            if (log.getIdlog() != null) {
                log.setIdlog(null);
            }
            em.persist(log);
            transaction.commit();
        } catch (PersistenceException e) {
            throw new ToyotaException("Ocorreu um erro ao tentar inserir Cliente" + e);
        } catch (Exception e) {
            throw new ToyotaException("Ocorreu um erro inesperado " + e);
            
        }
        
        
        return logResultado;
        
    }
    
    
    
    public Collection<LogSistema> listarLog(Estado estado) throws ToyotaException {
        
        Query query = null;
        Collection<LogSistema> cidadeRetornoLista = null;
        
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
