/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.toyota.entidades;

import java.io.Serializable;

/**
 *
 * @author Felipe Saboya SCA _ TCC
 */
public class FormaPagamento implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer valor;
    private Integer valorCarroUsado;
    private Integer valorCarroUsadoPrazo;
    private Integer valorCarroUsadoCredito;
    private Integer valorVisa;
    private Integer valorMaster;
    private Integer valorAmerica;
    private Integer entrada;
    private Integer qtPrestacoes;
    private String bandeira;
    private String tipoPagamento;
    private String descPagamento;
    
    
     public Integer getValorCarroUsadoCredito() {
        return valorCarroUsadoCredito;
    }

    public void setValorCarroUsadoCredito(Integer valorCarroUsadoCredito) {
        this.valorCarroUsadoCredito = valorCarroUsadoCredito;
    }

    public Integer getValorCarroUsadoPrazo() {
        return valorCarroUsadoPrazo;
    }

    public void setValorCarroUsadoPrazo(Integer valorCarroUsadoPrazo) {
        this.valorCarroUsadoPrazo = valorCarroUsadoPrazo;
    }

    public Integer getEntrada() {
        return entrada;
    }

    public void setEntrada(Integer entrada) {
        this.entrada = entrada;
    }

    public Integer getQtPrestacoes() {
        return qtPrestacoes;
    }

    public void setQtPrestacoes(Integer qtPrestacoes) {
        this.qtPrestacoes = qtPrestacoes;
    }

    public Integer getValorAmerica() {
        return valorAmerica;
    }

    public void setValorAmerica(Integer valorAmerica) {
        this.valorAmerica = valorAmerica;
    }

    public Integer getValorMaster() {
        return valorMaster;
    }

    public void setValorMaster(Integer valorMaster) {
        this.valorMaster = valorMaster;
    }

    public Integer getValorVisa() {
        return valorVisa;
    }

    public void setValorVisa(Integer valorVisa) {
        this.valorVisa = valorVisa;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public String getDescPagamento() {
        return descPagamento;
    }

    public void setDescPagamento(String descPagamento) {
        this.descPagamento = descPagamento;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public Integer getValorCarroUsado() {
        return valorCarroUsado;
    }

    public void setValorCarroUsado(Integer valorCarroUsado) {
        this.valorCarroUsado = valorCarroUsado;
    }

    public FormaPagamento() {
    }
}
