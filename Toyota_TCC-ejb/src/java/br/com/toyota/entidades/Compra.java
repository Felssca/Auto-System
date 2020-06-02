/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.toyota.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Kabelera
 */
@Entity
@Table(name = "compra")
@NamedQueries({
    @NamedQuery(name = "Compra.listarVendas", query = "SELECT c FROM Compra c   "),
    @NamedQuery(name = "Compra.findByIdCompra", query = "SELECT c FROM Compra c WHERE c.idCompra = :idCompra"),
    @NamedQuery(name = "Compra.findByIdVeiculo", query = "SELECT c FROM Compra c WHERE c.idVeiculo = :idVeiculo"),
    @NamedQuery(name = "Compra.findByIdCliente", query = "SELECT c FROM Compra c WHERE c.idCliente = :idCliente"),
    @NamedQuery(name = "Compra.findByValor", query = "SELECT c FROM Compra c WHERE c.valor = :valor"),
    @NamedQuery(name = "Compra.findByFormaPagamento", query = "SELECT c FROM Compra c WHERE c.formaPagamento = :formaPagamento")})
public class Compra implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_compra")
    private Integer idCompra;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_veiculo")
    private int idVeiculo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_cliente")
    private int idCliente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor")
    private double valor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 120)
    @Column(name = "forma_pagamento")
    private String formaPagamento;
    @Column(name = "dt_compra")
    @Temporal(TemporalType.DATE)
    private Date dtCompra;
     @NotNull
    @Column(name = "nome_veiculo")
    private String nomeVeiculo;
     @Column(name = "nome_cliente")
    private String nomeCliente;

    public Date getDtCompra() {
        return dtCompra;
    }

    public void setDtCompra(Date dtCompra) {
        this.dtCompra = dtCompra;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeVeiculo() {
        return nomeVeiculo;
    }

    public void setNomeVeiculo(String nomeVeiculo) {
        this.nomeVeiculo = nomeVeiculo;
    }

    public Date getDataCompra() {
        return dtCompra;
    }

    public void setDataCompra(Date dtCompra) {
        this.dtCompra = dtCompra;
    }

    public Compra() {
    }

    public Compra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public Compra(Integer idCompra, int idVeiculo, int idCliente, double valor, String formaPagamento) {
        this.idCompra = idCompra;
        this.idVeiculo = idVeiculo;
        this.idCliente = idCliente;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
    }

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public int getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(int idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public  double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCompra != null ? idCompra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Compra)) {
            return false;
        }
        Compra other = (Compra) object;
        if ((this.idCompra == null && other.idCompra != null) || (this.idCompra != null && !this.idCompra.equals(other.idCompra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.toyota.entidades.Compra[ idCompra=" + idCompra + " ]";
    }
    
}
