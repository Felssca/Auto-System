/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.toyota.sessionBeans;

import br.com.toyota.dao.UsuarioDAO;
import br.com.toyota.entidades.Usuario;
import br.com.toyota.exceptions.ToyotaException;
import br.com.toyota.interfaces.IUsuario;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;



/**
 *
 * @author Felipe Saboya SCA _ TCC
 * Classe EJB de ServiÃ§o Usuario.
 *
 */


@Stateless
@LocalBean
public class UsuarioSessionBean implements IUsuario{
  
    
    public UsuarioSessionBean(){}
    
    @Override
    public Usuario inserirUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Usuario acessarSistema(Usuario usuario) throws ToyotaException{       
     usuario = UsuarioDAO.getInstace().acessarSistema(usuario);
     return usuario;
    }

   
    

}
