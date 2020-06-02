/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.toyota.sessionBeans;

import br.com.toyota.dao.HistoricoVeiculoDAO;
import br.com.toyota.dao.HistoricoVeiculoRevisoesDAO;
import br.com.toyota.entidades.HistoricoVeiculo;
import br.com.toyota.entidades.HistoricoVeiculoRevisoes;
import br.com.toyota.entidades.Veiculo;
import br.com.toyota.exceptions.ToyotaException;
import br.com.toyota.interfaces.IHistoricoVeiculos;
import java.util.Collection;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author Kabelera
 */
@Stateless
@LocalBean

public class HistoricoVeiculoSessionBean implements IHistoricoVeiculos {
    
    public HistoricoVeiculoSessionBean(){}

   

    @Override
    public Collection<HistoricoVeiculo>listarHistorico(Veiculo veiculo) throws ToyotaException {
         Collection<HistoricoVeiculo> listaHistoricoVeiculos = HistoricoVeiculoDAO.getInstace().listarHistorico(veiculo);
        return listaHistoricoVeiculos;
    }

   
    
    
}
