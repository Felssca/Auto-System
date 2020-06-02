/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.toyota.sessionBeans;

import br.com.toyota.dao.VeiculoDAO;
import br.com.toyota.entidades.HistoricoVeiculo;
import br.com.toyota.entidades.Veiculo;
import br.com.toyota.exceptions.ToyotaException;
import br.com.toyota.interfaces.IVeiculos;
import java.util.Collection;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author Kabelera
 */
@Stateless
@LocalBean

public class VeiculosSessionBean implements IVeiculos {
    
    public VeiculosSessionBean(){}

    @Override
    public Collection<Veiculo> listarVeiculos() throws ToyotaException {
        Collection<Veiculo> listaVeiculos = VeiculoDAO.getInstace().listarVeiculos();
        return listaVeiculos;
    }

    @Override
    public Veiculo veiculo(Integer idVeiculo) throws ToyotaException {
        Veiculo veiculo = VeiculoDAO.getInstace().veiculo(idVeiculo);
        return veiculo;
    }

  
    
}
