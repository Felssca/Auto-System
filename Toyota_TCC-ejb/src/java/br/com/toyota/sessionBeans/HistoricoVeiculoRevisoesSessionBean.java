/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.toyota.sessionBeans;

import br.com.toyota.dao.HistoricoVeiculoRevisoesDAO;
import br.com.toyota.entidades.HistoricoVeiculoRevisoes;
import br.com.toyota.exceptions.ToyotaException;
import br.com.toyota.interfaces.IHistoricoVeiculosRevisoes;
import java.util.Collection;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author Kabelera
 */
@Stateless
@LocalBean

public class HistoricoVeiculoRevisoesSessionBean implements IHistoricoVeiculosRevisoes {
    
    public HistoricoVeiculoRevisoesSessionBean(){}

   

  

    @Override
    public Collection<HistoricoVeiculoRevisoes> listarHistoricoRevisoes(Integer idHistorico) throws ToyotaException {
         Collection<HistoricoVeiculoRevisoes> listaHistoricoVeiculosRevisoes = HistoricoVeiculoRevisoesDAO.getInstace().listarHistoricoRevisoes(idHistorico);
        return listaHistoricoVeiculosRevisoes;
       
    }
    
    
}
