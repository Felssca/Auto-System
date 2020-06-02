/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.toyota.sessionBeans;

import br.com.toyota.dao.ClienteDAO;
import br.com.toyota.dao.LogDAO;
import br.com.toyota.entidades.Cliente;
import br.com.toyota.entidades.LogSistema;
import br.com.toyota.exceptions.ToyotaException;
import br.com.toyota.interfaces.ICliente;
import br.com.toyota.interfaces.ILog;
import java.util.Collection;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author Kabelera
 */
@Stateless
@LocalBean
public class LogSessionBean implements ILog {

    public LogSessionBean() {
    }

    @Override
    public LogSistema inserirLog(LogSistema log) throws ToyotaException {
        LogSistema logSistema = LogDAO.getInstace().inserirLog(log);
        return logSistema;
    }

    @Override
    public Collection<LogSistema> listarLog() throws ToyotaException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

 
    
    
}
