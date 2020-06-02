/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.toyota.controller;

import br.com.toyota.entidades.Cliente;
import br.com.toyota.entidades.Estado;
import br.com.toyota.exceptions.ToyotaException;
import br.com.toyota.sessionBeans.ClienteSessionBean;
import br.com.toyota.sessionBeans.UtilSessionBean;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author Kabelera
 */
@SessionScoped
@ManagedBean(name = "clienteController")
public class ClienteController implements Serializable {

    @EJB
    private ClienteSessionBean clienteEjb;
    @EJB
    private UtilSessionBean utilEjb;
    private Cliente cliente = new Cliente();
    private Estado estado = new Estado();
    private List<Estado> estadoLista;
    private List<Cliente> clienteLista;
    private String url;

    public void inserirCliente() throws ToyotaException {
        clienteEjb.inserirCliente(cliente);
        if (cliente.getIdCliente() > 0) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Cliente Cadastrado", "Cliente Cadastrado"));
            listarClientes();
        } else {

            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "mensagem", "Erro ao inserir Cliente"));
        }


    }

    public void listarEstado() throws ToyotaException {
        estadoLista = (List) utilEjb.listarEstados();
    }

    public void onEditRow(RowEditEvent event) throws ToyotaException {
        Cliente clienteEditado = (Cliente) event.getObject();
        alterarCliente(clienteEditado);
    }

    public void alterarCliente(Cliente cliente) throws ToyotaException {
        clienteEjb.alteraCliente(cliente);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "alerta", "Cliente Alterado"));
        listarClientes();





    }

    public String listarClientes() throws ToyotaException {
        clienteLista = (List) clienteEjb.listarClientes(cliente);
        listarEstado();
        return "clientePesquisa";
    }

    public String navegacao(String url) {
        return url;
    }

    public UtilSessionBean getUtilEjb() {
        return utilEjb;
    }

    public void setUtilEjb(UtilSessionBean utilEjb) {
        this.utilEjb = utilEjb;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ClienteSessionBean getClienteEjb() {
        return clienteEjb;
    }

    public void setClienteEjb(ClienteSessionBean clienteEjb) {
        this.clienteEjb = clienteEjb;
    }

    public List<Cliente> getClienteLista() {
        return clienteLista;
    }

    public void setClienteLista(List<Cliente> clienteLista) {
        this.clienteLista = clienteLista;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public List<Estado> getEstadoLista() {
        return estadoLista;
    }

    public void setEstadoLista(List<Estado> estadoLista) {
        this.estadoLista = estadoLista;
    }
}
