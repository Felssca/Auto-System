/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.toyota.dao;

import br.com.toyota.entidades.HistoricoVeiculo;
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
public class VeiculoDAO implements Serializable {

    private EntityManager em;
    private static VeiculoDAO veiculoDAO = null;

    public EntityManager getEntityManager() {
        EntityManagerFacade emf = new EntityManagerFacade();
        em = emf.getEntityManager();
        return em;
    }

    public static VeiculoDAO getInstace() {
        if (veiculoDAO == null) {
            veiculoDAO = new VeiculoDAO();
        }
        return veiculoDAO;
    }

    public Veiculo veiculo(Integer idVeiculo) throws ToyotaException {
        Veiculo veiculoResultado = null;
        Query query = null;
        query = getEntityManager().createNamedQuery("Veiculo.listarVeiculoUnico");
        query.setParameter("idVeiculo",idVeiculo);
        veiculoResultado = (Veiculo)query.getSingleResult();
        return veiculoResultado;
    }

    public Collection<Veiculo> listarVeiculos() throws ToyotaException {
        Query query = null;
        Collection<Veiculo> veiculoRetornoLista = null;
        query = getEntityManager().createNamedQuery("Veiculo.listarVeiculos");
        try {
            veiculoRetornoLista = query.getResultList();
        } catch (NoResultException ex) {
            return veiculoRetornoLista;
        } catch (Exception e) {
            throw new ToyotaException("Ocorreu um erro inesperado " + e.getCause());
        }
        return veiculoRetornoLista;
    }
}
