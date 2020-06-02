/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.toyota.controller;

import br.com.toyota.entidades.Estoque;
import br.com.toyota.entidades.HistoricoVeiculo;
import br.com.toyota.entidades.HistoricoVeiculoRevisoes;
import br.com.toyota.entidades.Veiculo;
import br.com.toyota.exceptions.ToyotaException;
import br.com.toyota.sessionBeans.HistoricoVeiculoSessionBean;
import br.com.toyota.sessionBeans.VeiculosSessionBean;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author FelipeSSCA
 */
@SessionScoped
@ManagedBean(name = "veiculoController")
public class VeiculoController implements Serializable {

    @EJB
    private VeiculosSessionBean veiculoEjb;
    @EJB
    private HistoricoVeiculoSessionBean historicoEjb;
    private Veiculo veiculo = new Veiculo();
    private HistoricoVeiculoRevisoes historicoVeiculoRev = new HistoricoVeiculoRevisoes();
    private List<Veiculo> veiculoLista;
    private List<HistoricoVeiculo> historicoLista = null;
    private List<HistoricoVeiculoRevisoes> historicoRevLista;
    private Estoque estoque;
    private List<Estoque> estoqueLista;
    
   

   

    public String listarVeiculos() throws ToyotaException {
        veiculoLista = (List) veiculoEjb.listarVeiculos();
        setVeiculoLista(veiculoLista);
        return null;

    }


    public Estoque getEstoque() {
        return estoque;
    }

    public List<HistoricoVeiculoRevisoes> getHistoricoRevLista() {
        return historicoRevLista;
    }

    public void setHistoricoRevLista(List<HistoricoVeiculoRevisoes> historicoRevLista) {
        this.historicoRevLista = historicoRevLista;
    }

    public HistoricoVeiculoRevisoes getHistoricoVeiculoRev() {
        return historicoVeiculoRev;
    }

    public void setHistoricoVeiculoRev(HistoricoVeiculoRevisoes historicoVeiculoRev) {
        this.historicoVeiculoRev = historicoVeiculoRev;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public List<HistoricoVeiculo> getHistoricoLista() {
        return historicoLista;
    }

    public void setHistoricoLista(List<HistoricoVeiculo> historicoLista) {
        this.historicoLista = historicoLista;
    }

    public HistoricoVeiculoSessionBean getHistoricoEjb() {
        return historicoEjb;
    }

    public void setHistoricoEjb(HistoricoVeiculoSessionBean historicoEjb) {
        this.historicoEjb = historicoEjb;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public VeiculosSessionBean getVeiculoEjb() {
        return veiculoEjb;
    }

    public void setVeiculoEjb(VeiculosSessionBean veiculoEjb) {
        this.veiculoEjb = veiculoEjb;
    }

    public List<Veiculo> getVeiculoLista() {
        return veiculoLista;
    }

    public void setVeiculoLista(List<Veiculo> veiculoLista) {
        this.veiculoLista = veiculoLista;
    }

    public List<Estoque> getEstoqueLista() {
        return estoqueLista;
    }

    public void setEstoqueLista(List<Estoque> estoqueLista) {
        this.estoqueLista = estoqueLista;
    }
}
