/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.toyota.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Felipe Saboya SCA _ TCC
 */
@Entity
@Table(name = "forma_pagamento_dominio", catalog = "Toyota", schema = "")
@NamedQueries({
    @NamedQuery(name = "FormaPagamentoDominio.findAll", query = "SELECT f FROM FormaPagamentoDominio f"),
    @NamedQuery(name = "FormaPagamentoDominio.findByIdFormaPagamentoDominio", query = "SELECT f FROM FormaPagamentoDominio f WHERE f.idFormaPagamentoDominio = :idFormaPagamentoDominio"),
    @NamedQuery(name = "FormaPagamentoDominio.findByCartaoCredito", query = "SELECT f FROM FormaPagamentoDominio f WHERE f.cartaoCredito = :cartaoCredito"),
    @NamedQuery(name = "FormaPagamentoDominio.findByAvista", query = "SELECT f FROM FormaPagamentoDominio f WHERE f.avista = :avista"),
    @NamedQuery(name = "FormaPagamentoDominio.findByEntradaPrestacao", query = "SELECT f FROM FormaPagamentoDominio f WHERE f.entradaPrestacao = :entradaPrestacao"),
    @NamedQuery(name = "FormaPagamentoDominio.findByPrestacao", query = "SELECT f FROM FormaPagamentoDominio f WHERE f.prestacao = :prestacao"),
    @NamedQuery(name = "FormaPagamentoDominio.findByUsado", query = "SELECT f FROM FormaPagamentoDominio f WHERE f.usado = :usado")})
public class FormaPagamentoDominio implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_forma_pagamento_dominio")
    private Integer idFormaPagamentoDominio;
    @Column(name = "cartao_credito")
    private Integer cartaoCredito;
    @Column(name = "avista")
    private Integer avista;
    @Column(name = "entrada_prestacao")
    private Integer entradaPrestacao;
    @Column(name = "prestacao")
    private Integer prestacao;
    @Column(name = "usado")
    private Integer usado;

    public FormaPagamentoDominio() {
    }

    public FormaPagamentoDominio(Integer idFormaPagamentoDominio) {
        this.idFormaPagamentoDominio = idFormaPagamentoDominio;
    }

    public Integer getIdFormaPagamentoDominio() {
        return idFormaPagamentoDominio;
    }

    public void setIdFormaPagamentoDominio(Integer idFormaPagamentoDominio) {
        this.idFormaPagamentoDominio = idFormaPagamentoDominio;
    }

    public Integer getCartaoCredito() {
        return cartaoCredito;
    }

    public void setCartaoCredito(Integer cartaoCredito) {
        this.cartaoCredito = cartaoCredito;
    }

    public Integer getAvista() {
        return avista;
    }

    public void setAvista(Integer avista) {
        this.avista = avista;
    }

    public Integer getEntradaPrestacao() {
        return entradaPrestacao;
    }

    public void setEntradaPrestacao(Integer entradaPrestacao) {
        this.entradaPrestacao = entradaPrestacao;
    }

    public Integer getPrestacao() {
        return prestacao;
    }

    public void setPrestacao(Integer prestacao) {
        this.prestacao = prestacao;
    }

    public Integer getUsado() {
        return usado;
    }

    public void setUsado(Integer usado) {
        this.usado = usado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFormaPagamentoDominio != null ? idFormaPagamentoDominio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FormaPagamentoDominio)) {
            return false;
        }
        FormaPagamentoDominio other = (FormaPagamentoDominio) object;
        if ((this.idFormaPagamentoDominio == null && other.idFormaPagamentoDominio != null) || (this.idFormaPagamentoDominio != null && !this.idFormaPagamentoDominio.equals(other.idFormaPagamentoDominio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.toyota.entidades.FormaPagamentoDominio[ idFormaPagamentoDominio=" + idFormaPagamentoDominio + " ]";
    }
    
}
