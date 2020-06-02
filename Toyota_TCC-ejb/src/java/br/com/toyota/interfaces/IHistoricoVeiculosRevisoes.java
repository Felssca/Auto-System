/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.toyota.interfaces;

import br.com.toyota.entidades.HistoricoVeiculoRevisoes;
import br.com.toyota.exceptions.ToyotaException;
import java.util.Collection;
import javax.ejb.Local;
import javax.ejb.Remote;

/**
 *
 * @author Kabelera
 */
@Remote
@Local
public interface IHistoricoVeiculosRevisoes {
    public Collection<HistoricoVeiculoRevisoes>listarHistoricoRevisoes(Integer idHistorico)throws ToyotaException;
}
