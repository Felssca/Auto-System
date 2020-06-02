 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.toyota.dao;

import br.com.toyota.entidades.Usuario;
import br.com.toyota.exceptions.ToyotaException;
import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

/**
 * Classe responsável por efetuar a persistência no sistema 
 * @author Kabelera
 */
public class UsuarioDAO implements Serializable {

    private EntityManager em;
    private static UsuarioDAO usuarioDAO = null;

    public EntityManager getEntityManager() {
        EntityManagerFacade emf = new EntityManagerFacade();
        em = emf.getEntityManager();
        return em;
    }

    public static UsuarioDAO getInstace() {
        if (usuarioDAO == null) {
            usuarioDAO = new UsuarioDAO();
        }
        return usuarioDAO;
    }

    public Usuario acessarSistema(Usuario usuario) throws ToyotaException {
        Query query = null;
        Usuario usuarioResultado = null;
        query = getEntityManager().createNamedQuery("Usuario.acessarSistema");
        query.setParameter("senha", usuario.getSenha());
        query.setParameter("login", usuario.getLogin());
        try {
            usuarioResultado = (Usuario) query.getSingleResult();
        } catch (NoResultException ex) {
            return usuarioResultado;
        } catch(Exception e){
            throw new ToyotaException("Ocorreu um erro inesperado ");
        }


        return usuarioResultado;

    }
}
