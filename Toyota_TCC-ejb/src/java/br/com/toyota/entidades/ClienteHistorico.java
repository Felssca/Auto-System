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
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Felipe Saboya SCA _ TCC
 */
@Entity
@Table(name = "cliente_historico", catalog = "Toyota", schema = "")
@NamedQueries({
    @NamedQuery(name = "ClienteHistorico.findAll", query = "SELECT c FROM ClienteHistorico c"),
    @NamedQuery(name = "ClienteHistorico.findByIdClienteHistorico", query = "SELECT c FROM ClienteHistorico c WHERE c.idClienteHistorico = :idClienteHistorico"),
    @NamedQuery(name = "ClienteHistorico.findByDtUltimaCompra", query = "SELECT c FROM ClienteHistorico c WHERE c.dtUltimaCompra = :dtUltimaCompra"),
    @NamedQuery(name = "ClienteHistorico.findByRetricaoSpc", query = "SELECT c FROM ClienteHistorico c WHERE c.retricaoSpc = :retricaoSpc"),
    @NamedQuery(name = "ClienteHistorico.findByFormaPagamento", query = "SELECT c FROM ClienteHistorico c WHERE c.formaPagamento = :formaPagamento")})
public class ClienteHistorico implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @GeneratedValue( strategy = GenerationType.AUTO)
    @Column(name = "id_cliente_historico")
    private Integer idClienteHistorico;
    @Column(name = "dt_ultima_compra")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtUltimaCompra;
    @Lob
    @Size(max = 65535)
    @Column(name = "observacao")
    private String observacao;
    @Column(name = "retricao_spc")
    private Boolean retricaoSpc;
    @Column(name = "forma_pagamento")
    private Integer formaPagamento;
    @JoinColumn(name = "id_veiculo", referencedColumnName = "id_veiculo")
    @ManyToOne(optional = false)
    private Veiculo idVeiculo;
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
    @ManyToOne(optional = false)
    private Cliente idCliente;
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    @ManyToOne(optional = false)
    private Usuario idUsuario;

    public ClienteHistorico() {
    }

    public ClienteHistorico(Integer idClienteHistorico) {
        this.idClienteHistorico = idClienteHistorico;
    }

    public Integer getIdClienteHistorico() {
        return idClienteHistorico;
    }

    public void setIdClienteHistorico(Integer idClienteHistorico) {
        this.idClienteHistorico = idClienteHistorico;
    }

    public Date getDtUltimaCompra() {
        return dtUltimaCompra;
    }

    public void setDtUltimaCompra(Date dtUltimaCompra) {
        this.dtUltimaCompra = dtUltimaCompra;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Boolean getRetricaoSpc() {
        return retricaoSpc;
    }

    public void setRetricaoSpc(Boolean retricaoSpc) {
        this.retricaoSpc = retricaoSpc;
    }

    public Integer getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(Integer formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Veiculo getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(Veiculo idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idClienteHistorico != null ? idClienteHistorico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClienteHistorico)) {
            return false;
        }
        ClienteHistorico other = (ClienteHistorico) object;
        if ((this.idClienteHistorico == null && other.idClienteHistorico != null) || (this.idClienteHistorico != null && !this.idClienteHistorico.equals(other.idClienteHistorico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.toyota.entidades.ClienteHistorico[ idClienteHistorico=" + idClienteHistorico + " ]";
    }
    
}
