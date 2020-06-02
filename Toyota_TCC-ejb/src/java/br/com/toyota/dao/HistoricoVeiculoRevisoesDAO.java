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
public class HistoricoVeiculoRevisoesDAO implements Serializable{
    
    private EntityManager em;
    private static HistoricoVeiculoRevisoesDAO historicoRevisoesDAO = null;

    public EntityManager getEntityManager() {
        EntityManagerFacade emf = new EntityManagerFacade();
        em = emf.getEntityManager();
        return em;
    }

    public static HistoricoVeiculoRevisoesDAO getInstace() {
        if (historicoRevisoesDAO == null) {
            historicoRevisoesDAO = new HistoricoVeiculoRevisoesDAO();
        }
        return historicoRevisoesDAO;
    }
   
   
     
   
       public Collection<HistoricoVeiculoRevisoes>listarHistoricoRevisoes(Integer idVeiculo) throws ToyotaException {
        Query query = null;
        Collection<HistoricoVeiculoRevisoes> historicoRevisoesRetornoLista = null;
        query = getEntityManager().createNamedQuery("HistoricoVeiculoRevisoes.listarRevisoesVeiculos");
        query.setParameter("idVeiculo",idVeiculo);
        try {
            historicoRevisoesRetornoLista = query.getResultList();
        } catch (NoResultException ex) {
            return historicoRevisoesRetornoLista;
        } catch (Exception e) {
            throw new ToyotaException("Ocorreu um erro inesperado "+e.getCause());
        }finally{
        em.close();
        }
        return historicoRevisoesRetornoLista;
    }
}
