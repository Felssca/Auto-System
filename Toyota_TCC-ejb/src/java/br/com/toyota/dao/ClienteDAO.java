/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.toyota.dao;

import br.com.toyota.entidades.Cidade;
import br.com.toyota.entidades.Cliente;
import br.com.toyota.entidades.Estado;
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
public class ClienteDAO {
    
    private EntityManager em;
    private static ClienteDAO clienteDAO = null;
    
    public EntityManager getEntityManager() {
        EntityManagerFacade emf = new EntityManagerFacade();
        em = emf.getEntityManager();
        return em;
    }
    
    public static ClienteDAO getInstace() {
        if (clienteDAO == null) {
            clienteDAO = new ClienteDAO();
        }
        return clienteDAO;
    }
    
    public Cliente inserirCliente(Cliente cliente) throws ToyotaException {
        Cliente clienteResultado = null;
        try {
            EntityTransaction transaction = getEntityManager().getTransaction();
            transaction.begin();            
            if (cliente.getIdCliente() != null) {
                cliente.setIdCliente(null);
            }
            em.persist(cliente);
            transaction.commit();
            
            
            
            
        } catch (PersistenceException e) {
            throw new ToyotaException("Ocorreu um erro ao tentar inserir Cliente" + e);
        } catch (Exception e) {
            throw new ToyotaException("Ocorreu um erro inesperado " + e);
            
        }
        
        
        return clienteResultado;
        
    }
    
    
     public Cliente alteraCliente(Cliente cliente) throws ToyotaException {
        Cliente clienteResultado = null;
        try {
            EntityTransaction transaction = getEntityManager().getTransaction();
            transaction.begin();            
            cliente = em.merge(cliente);
            em.flush();  
            em.clear();  
            transaction.commit();  
            
            
            
            
        } catch (PersistenceException e) {
            throw new ToyotaException("Ocorreu um erro ao tentar inserir Cliente" + e);
        } catch (Exception e) {
            throw new ToyotaException("Ocorreu um erro inesperado " + e);
            
        }
        
        
        return clienteResultado;
        
    }
    
    public Collection<Cliente> listarClientes(Cliente cliente) throws ToyotaException {
        
        Query query = null;
        Collection<Cliente> clienteRetornoLista = null;
        
        query = getEntityManager().createNamedQuery("Cliente.listarClientes");
        
        
        try {
            clienteRetornoLista = query.getResultList();
        } catch (NoResultException ex) {
            return clienteRetornoLista;
        } catch (Exception e) {
            throw new ToyotaException("Ocorreu um erro inesperado " + e.getCause());
        }
        return clienteRetornoLista;
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
