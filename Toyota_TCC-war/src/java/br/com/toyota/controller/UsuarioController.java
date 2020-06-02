/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.toyota.controller;

import br.com.toyota.entidades.LogSistema;
import br.com.toyota.entidades.Usuario;
import br.com.toyota.exceptions.ToyotaException;
import br.com.toyota.sessionBeans.LogSessionBean;
import br.com.toyota.sessionBeans.UsuarioSessionBean;

import java.io.Serializable;
import java.util.Date;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 *
 * @author Felipe Saboya SCA _ TCC
 * Classe que faz a ligacao  com o servico ejb de usuario 
 */
@SessionScoped
@ManagedBean(name = "usuarioController")
public class UsuarioController implements Serializable {

    @EJB
    private UsuarioSessionBean usuarioEjb;
    private Usuario usuario = new Usuario();
    private Usuario usuarioRetorno = null;
    
    
      @EJB
    private LogSessionBean logEjb ;
    private LogSistema logSistema;

    public LogSistema getLogSistema() {
        return logSistema;
    }

    public void setLogSistema(LogSistema logSistema) {
        this.logSistema = logSistema;
    }

    public LogSessionBean getLogEjb() {
        return logEjb;
    }

    public void setLogEjb(LogSessionBean logEjb) {
        this.logEjb = logEjb;
    }
 

    public String acessarSistema() throws ToyotaException {
        String retorno = null;
         usuarioRetorno = usuarioEjb.acessarSistema(usuario);
        if (usuarioRetorno != null) {
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", usuarioRetorno); 
             FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Bem vindo ao sistema AutoSys ", "sistema AutoSys"));
             logSistema.setDtModificacao(new Date());
             logSistema.setModulo_sistema("Acesso");
             logSistema.setTipoLog("Login");
             logSistema.setTexto(usuarioRetorno.getNome());
             logEjb.inserirLog(logSistema);
            retorno = "/central";
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario ou senha inválido ", "sistema AutoSys"));
            retorno = "/index";
        }
        return retorno;

    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public UsuarioSessionBean getUsuarioEjb() {
        return usuarioEjb;
    }

    public void setUsuarioEjb(UsuarioSessionBean usuarioEjb) {
        this.usuarioEjb = usuarioEjb;
    }
       public Usuario getUsuarioRetorno() {
        return usuarioRetorno;
    }

    public void setUsuarioRetorno(Usuario usuarioRetorno) {
        this.usuarioRetorno = usuarioRetorno;
    }
}
