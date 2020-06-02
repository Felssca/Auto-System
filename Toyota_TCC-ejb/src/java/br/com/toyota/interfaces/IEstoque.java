/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.toyota.interfaces;

import br.com.toyota.entidades.Estoque;
import br.com.toyota.exceptions.ToyotaException;
import java.util.Collection;
import javax.ejb.Local;
import javax.ejb.Remote;

/**
 *
 * @author Felipe Saboya SCA _ TCC
 */
@Remote 
@Local
public interface  IEstoque {
    
        public Collection<Estoque>listarEstoque()throws ToyotaException;
    
}
