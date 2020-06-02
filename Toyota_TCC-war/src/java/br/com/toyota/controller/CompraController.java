/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.toyota.controller;

import br.com.toyota.entidades.Cliente;
import br.com.toyota.entidades.Compra;
import br.com.toyota.entidades.Estoque;
import br.com.toyota.entidades.FormaPagamento;
import br.com.toyota.entidades.Usuario;
import br.com.toyota.entidades.Veiculo;
import br.com.toyota.exceptions.ToyotaException;
import br.com.toyota.sessionBeans.ClienteSessionBean;
import br.com.toyota.sessionBeans.CompraSessionBean;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.FlowEvent;

/**
 *
 * @author FelipeSSCA
 */
@SessionScoped
@ManagedBean(name = "compraController")
public class CompraController implements Serializable {

    @EJB
    private ClienteSessionBean clienteEjb;
    @EJB
    private CompraSessionBean compraEjb;
    private List<Cliente> clienteLista;
    private Veiculo veiculo = new Veiculo();
    private Estoque estoque = new Estoque();
    private Cliente cliente = new Cliente();
    private FormaPagamento formaPagamento = new FormaPagamento();
    private Usuario usuario = new Usuario();
    private Compra compra = new Compra();

    public CompraController() {
        usuario = (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario");

    }

    public String comprarVeiculo() throws ToyotaException {
        Cliente clientePesquisa = new Cliente();
        clienteLista = (List) clienteEjb.listarClientes(clientePesquisa);
        veiculo = estoque.getIdVeiculo();
        return "compraVeiculo";

    }

    public String onFlowProcess(FlowEvent event) {
        
        
        

        if (skip) {
            skip = false;   //reset in case user goes back  
            return "confirm";
        } else {
            return event.getNewStep();
        }
    }

    public String confirmarCompra() throws ToyotaException {
        String retorno = null;
        compra.setIdVeiculo(veiculo.getIdVeiculo());
        compra.setIdCliente(cliente.getIdCliente());
        compra.setValor(estoque.getValor());
        compra.setFormaPagamento(montarFormaPagamento());
        compra.setDataCompra(new Date());
        compra.setNomeCliente(cliente.getNome()+" "+cliente.getSobrenome());
        compra.setNomeVeiculo(veiculo.getModelo());
        compraEjb.inserirCompra(compra);
        if (compra.getIdCompra() > 0) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Compra Efetuada com Exito!", "Compra Efetuada com Exito!"));
            retorno = "historicoVenda";
        } else {

            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro ao concluir compra", "Erro ao concluir compra"));
            retorno = "compraVeiculo";
        }
        return retorno;


    }

    private String montarFormaPagamento() {
        String formaPagamentoFinal = null;
        StringBuilder br = new StringBuilder();
        br.append("Valor total R$ : ");
        br.append(estoque.getValor());
        if (formaPagamento.getValor() != null) {
            br.append("Pagamento a vista: ");
            br.append(formaPagamento.getValor());
            br.append("Carro Usado: ");
            br.append(formaPagamento.getValorCarroUsado());
        } else if (formaPagamento.getValorAmerica() != null || formaPagamento.getValorMaster() != null || formaPagamento.getValorVisa() != null) {
            br.append("Pagamento com Cartão de crédito: ");
            br.append("Carro Usado: ");
            br.append("Bandeiras: ");
            if (formaPagamento.getValorAmerica() != null) {
                br.append("American Express ");
                br.append("Valor R$: ");
                br.append(formaPagamento.getValorAmerica());
            }
            if (formaPagamento.getValorMaster() != null) {
                br.append("Master Card ");
                br.append("Valor R$: ");
                br.append(formaPagamento.getValorMaster());
            }
            if (formaPagamento.getValorVisa() != null) {
                br.append("Visa ");
                br.append("Valor R$: ");
                br.append(formaPagamento.getValorVisa());
            }else {
             br.append("A Prazo");
                br.append("Valor R$: ");
                br.append(formaPagamento.getQtPrestacoes());
                br.append(formaPagamento.getValorCarroUsadoPrazo());
                br.append("Qt Prestações");
                br.append(formaPagamento.getQtPrestacoes());
            
            }


        }
        formaPagamentoFinal = br.toString();
        return formaPagamentoFinal;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        if (cliente == null) {
        } else {
            this.cliente = cliente;
        }
    }
    private boolean skip;

    public boolean isSkip() {
        return skip;
    }

    public void setSkip(boolean skip) {
        this.skip = skip;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public List<Cliente> getClienteLista() {
        return clienteLista;
    }

    public void setClienteLista(List<Cliente> clienteLista) {
        this.clienteLista = clienteLista;
    }
}
