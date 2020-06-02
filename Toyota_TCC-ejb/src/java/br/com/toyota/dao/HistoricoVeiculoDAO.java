/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.toyota.dao;

import br.com.toyota.entidades.HistoricoVeiculo;
import br.com.toyota.entidades.HistoricoVeiculoRevisoes;
import br.com.toyota.entidades.Veiculo;
import br.com.toyota.exceptions.ToyotaException;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

/**
 *
 * @author Kabelera
 */
public class HistoricoVeiculoDAO implements Serializable{
    
    private EntityManager em;
    private static HistoricoVeiculoDAO historicoDAO = null;

    public EntityManager getEntityManager() {
        EntityManagerFacade emf = new EntityManagerFacade();
        em = emf.getEntityManager();
        return em;
    }

    public static HistoricoVeiculoDAO getInstace() {
        if (historicoDAO == null) {
            historicoDAO = new HistoricoVeiculoDAO();
        }
        return historicoDAO;
    }
   
     public Collection<HistoricoVeiculo>listarHistorico(Veiculo veiculo) throws ToyotaException {
        Query query = null;
        Collection<HistoricoVeiculo> historicoRetornoLista = null;
        query = getEntityManager().createNamedQuery("HistoricoVeiculo.listarHistorico");
        query.setParameter("idVeiculo", veiculo.getIdVeiculo());
        try {
            historicoRetornoLista = query.getResultList();
        } catch (NoResultException ex) {
            return historicoRetornoLista;
        } catch (Exception e) {
            throw new ToyotaException("Ocorreu um erro inesperado "+e.getCause());
        }finally{
        em.close();
        }
        return historicoRetornoLista;
    }
     
   
       
}
