/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.toyota.sessionBeans;

import br.com.toyota.dao.EstoqueDAO;
import br.com.toyota.entidades.Estoque;
import br.com.toyota.exceptions.ToyotaException;
import br.com.toyota.interfaces.IEstoque;
import java.util.Collection;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author Felipe Saboya SCA _ TCC
 */
@Stateless
@LocalBean
public class EstoqueSessionBean implements IEstoque {

    Estoque estoque;

    public EstoqueSessionBean() {
    }

    @Override
    public Collection<Estoque> listarEstoque() throws ToyotaException {
        Collection<Estoque> listaEstoque = EstoqueDAO.getInstace().listarEstoque();
        return listaEstoque;

    }
}
