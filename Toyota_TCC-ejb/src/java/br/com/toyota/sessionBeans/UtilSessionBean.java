/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.toyota.sessionBeans;

import br.com.toyota.dao.UtilDAO;
import br.com.toyota.entidades.Estado;
import br.com.toyota.exceptions.ToyotaException;
import br.com.toyota.interfaces.IUtil;
import java.util.Collection;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author Kabelera
 */
@Stateless
@LocalBean
public class UtilSessionBean implements IUtil {

    public UtilSessionBean() {
    }

    @Override
    public Collection<Estado> listarEstados() throws ToyotaException {
        Collection<Estado>estadoLista = UtilDAO.getInstace().listarEstados();
        return estadoLista;
    }

  

 
    
    
}
