/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.toyota.sessionBeans;

import br.com.toyota.dao.ClienteDAO;
import br.com.toyota.entidades.Cliente;
import br.com.toyota.exceptions.ToyotaException;
import br.com.toyota.interfaces.ICliente;
import java.util.Collection;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author Kabelera
 */
@Stateless
@LocalBean
public class ClienteSessionBean implements ICliente {

    public ClienteSessionBean() {
    }

    @Override
    public Cliente alteraCliente(Cliente cliente) throws ToyotaException {
        Cliente clienteResultado = ClienteDAO.getInstace().alteraCliente(cliente);
        return clienteResultado;
    }
    
    

    @Override
    public Cliente inserirCliente(Cliente cliente)throws ToyotaException {
        Cliente clienteResultado = ClienteDAO.getInstace().inserirCliente(cliente);
        return clienteResultado;
        
    }

    @Override
    public Collection<Cliente> listarClientes(Cliente cliente) throws ToyotaException {
        Collection<Cliente>clienteLista = ClienteDAO.getInstace().listarClientes(cliente);
        return clienteLista;
                
    }
    
    
}
