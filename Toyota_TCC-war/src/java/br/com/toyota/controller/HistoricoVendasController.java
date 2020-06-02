/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.toyota.controller;

import br.com.toyota.entidades.Compra;
import br.com.toyota.exceptions.ToyotaException;
import br.com.toyota.sessionBeans.ClienteSessionBean;
import br.com.toyota.sessionBeans.CompraSessionBean;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.PieChartModel;

/**
 *
 * @author FelipeSSCA
 */
@SessionScoped
@ManagedBean(name = "historicoVendas")
public class HistoricoVendasController implements Serializable {

    @EJB
    private ClienteSessionBean clienteEjb;
    @EJB
    private CompraSessionBean compraEjb;
    private Compra compra;
    private List<Compra> compraLista;
    
     private CartesianChartModel categoryModel;

    public CartesianChartModel getCategoryModel() {
        return categoryModel;
    }

    public void setCategoryModel(CartesianChartModel categoryModel) {
        this.categoryModel = categoryModel;
    }

    public PieChartModel getPieModel() {
        return pieModel;
    }

    public void setPieModel(PieChartModel pieModel) {
        this.pieModel = pieModel;
    }
    private PieChartModel pieModel;  

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public List<Compra> getCompraLista() {
        return compraLista;
    }

    public void setCompraLista(List<Compra> compraLista) {
        this.compraLista = compraLista;
    }
   

    public HistoricoVendasController() {
     createPieModel();

    }
    private void createPieModel() {  
        pieModel = new PieChartModel();  
        pieModel.set("Brand 1", 540);  
        pieModel.set("Brand 2", 325);  
        pieModel.set("Brand 3", 702);  
        pieModel.set("Brand 4", 421);  
    }  
    
    public String listarVendas() throws ToyotaException{
        compraLista = (List)compraEjb.listarVendas();
        
        
        return "historicoVenda";
    
    }

    public ClienteSessionBean getClienteEjb() {
        return clienteEjb;
    }

    public void setClienteEjb(ClienteSessionBean clienteEjb) {
        this.clienteEjb = clienteEjb;
    }

    public CompraSessionBean getCompraEjb() {
        return compraEjb;
    }

    public void setCompraEjb(CompraSessionBean compraEjb) {
        this.compraEjb = compraEjb;
    }

  

 
}
