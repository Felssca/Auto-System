/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.toyota.interfaces;

import br.com.toyota.entidades.Usuario;
import br.com.toyota.exceptions.ToyotaException;
import javax.ejb.Local;
import javax.ejb.Remote;

/**
 *
 * @author Felipe Saboya SCA _ TCC
 */

@Remote 
@Local
public interface IUsuario  {
    
    public Usuario inserirUsuario(Usuario usuario);
    public Usuario acessarSistema(Usuario usuario)throws ToyotaException;
    

}
