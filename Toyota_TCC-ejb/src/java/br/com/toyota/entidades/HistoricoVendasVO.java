/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.toyota.entidades;

import java.util.Date;

/**
 *
 * @author Kabelera
 */
public class HistoricoVendasVO {
    
    private String nomeCliente;
    private String sobrenomeCliente;
    private String modeloVeiculo;
    private String formaPagamento;        
    private double valor;
    private Date dt_compra;

    public Date getDt_compra() {
        return dt_compra;
    }

    public void setDt_compra(Date dt_compra) {
        this.dt_compra = dt_compra;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getSobrenomeCliente() {
        return sobrenomeCliente;
    }

    public void setSobrenomeCliente(String sobrenomeCliente) {
        this.sobrenomeCliente = sobrenomeCliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
