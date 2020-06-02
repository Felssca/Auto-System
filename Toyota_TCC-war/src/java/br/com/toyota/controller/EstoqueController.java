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
import br.com.toyota.sessionBeans.EstoqueSessionBean;
import br.com.toyota.sessionBeans.HistoricoVeiculoRevisoesSessionBean;
import br.com.toyota.sessionBeans.HistoricoVeiculoSessionBean;
import br.com.toyota.sessionBeans.VeiculosSessionBean;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.primefaces.event.TabChangeEvent;

/**
 *
 * @author Felipe Saboya SCA _ TCC
 * Classe Web de controle de Estoque
 */
@SessionScoped
@ManagedBean(name = "estoqueController")
public class EstoqueController implements Serializable {

    @EJB
    private EstoqueSessionBean estoqueEjb;
    @EJB
    private VeiculosSessionBean veiculoEjb;
    @EJB
    private HistoricoVeiculoSessionBean historicoEjb;
    @EJB
    private HistoricoVeiculoRevisoesSessionBean historicoRevisoesEjb;

    
    private Estoque estoque = new Estoque();
    private List<Estoque> estoqueLista;
    private Veiculo veiculo;
    private HistoricoVeiculoRevisoes historicoVeiculoRev;
    private List<Veiculo> veiculoLista;
    private List<HistoricoVeiculo> historicoLista;
    private List<HistoricoVeiculoRevisoes> historicoRevLista;

  

    public EstoqueController() {
    }

    public String listarEstoque() throws ToyotaException {
        
        estoqueLista = (List) estoqueEjb.listarEstoque();
        setEstoqueLista(estoqueLista);
        return "listaVeiculoEstoque";
    }

    public HistoricoVeiculoRevisoesSessionBean getHistoricoRevisoesEjb() {
        return historicoRevisoesEjb;
    }

    public void setHistoricoRevisoesEjb(HistoricoVeiculoRevisoesSessionBean historicoRevisoesEjb) {
        this.historicoRevisoesEjb = historicoRevisoesEjb;
    }

    public void onTabChange(TabChangeEvent event) throws ToyotaException {
        
        if (event.getTab().getId().equals("historico")) {
            veiculo = estoque.getIdVeiculo();
            historicoLista = (List) historicoEjb.listarHistorico(veiculo);
            

        }
        if ( event.getTab().getId().equals("revisoes")) {
            veiculo = estoque.getIdVeiculo();
            historicoRevLista = (List) historicoRevisoesEjb.listarHistoricoRevisoes(veiculo.getIdVeiculo());
            

        }
    }

  

    public HistoricoVeiculoSessionBean getHistoricoEjb() {
        return historicoEjb;
    }

    public void setHistoricoEjb(HistoricoVeiculoSessionBean historicoEjb) {
        this.historicoEjb = historicoEjb;
    }

    public List<HistoricoVeiculo> getHistoricoLista() {
        return historicoLista;
    }

    public void setHistoricoLista(List<HistoricoVeiculo> historicoLista) {
        this.historicoLista = historicoLista;
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

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public EstoqueSessionBean getEstoqueEjb() {
        return estoqueEjb;
    }

    public void setEstoqueEjb(EstoqueSessionBean estoqueEjb) {
        this.estoqueEjb = estoqueEjb;
    }

    public List<Estoque> getEstoqueLista() {
        return estoqueLista;
    }

    public void setEstoqueLista(List<Estoque> estoqueLista) {
        this.estoqueLista = estoqueLista;
    }
}
