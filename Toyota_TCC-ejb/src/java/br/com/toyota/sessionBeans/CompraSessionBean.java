    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.toyota.sessionBeans;

import br.com.toyota.dao.CompraDAO;
import br.com.toyota.entidades.Compra;
import br.com.toyota.exceptions.ToyotaException;
import br.com.toyota.interfaces.ICompra;
import java.util.Collection;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author Kabelera
 */
@Stateless
@LocalBean
public class CompraSessionBean implements ICompra {

    public CompraSessionBean() {
    }

    @Override
    public void inserirCompra(Compra compra) throws ToyotaException {
        CompraDAO.getInstace().inserirCompra(compra);
    }

    @Override
    public Collection<Compra> listarVendas() throws ToyotaException {
        Collection<Compra>compraLista = CompraDAO.getInstace().listarVendas();
        return compraLista;
                
    }
    
    
    
}
