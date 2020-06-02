/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.toyota.dao;

import br.com.toyota.entidades.Estoque;
import br.com.toyota.exceptions.ToyotaException;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

/**
 *
 * @author Felipe Saboya SCA _ TCC
 */
public class EstoqueDAO implements Serializable {

    private EntityManager em;
    private static EstoqueDAO estoqueDAO = null;
    

    public EntityManager getEntityManager() {
        EntityManagerFacade emf = new EntityManagerFacade();
        em = emf.getEntityManager();
        return em;
    }

    public static EstoqueDAO getInstace() {
        if (estoqueDAO == null) {
            estoqueDAO = new EstoqueDAO();
        }
        return estoqueDAO;
    }

    public Collection<Estoque> listarEstoque() throws ToyotaException {
        Query query = null;
        Collection<Estoque> estoqueRetornoLista = null;
        query = getEntityManager().createNamedQuery("Estoque.listarEstoque");
        try {
            estoqueRetornoLista = query.getResultList();
        } catch (NoResultException ex) {
            return estoqueRetornoLista;
        } catch (Exception e) {
            throw new ToyotaException("Ocorreu um erro inesperado ");
        }
        return estoqueRetornoLista;
    }
}
