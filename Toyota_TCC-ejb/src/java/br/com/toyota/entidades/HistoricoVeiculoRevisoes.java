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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Kabelera
 */
@Entity
@Table(name = "historico_veiculo_revisoes", catalog = "Toyota", schema = "")
@NamedQueries({
    @NamedQuery(name = "HistoricoVeiculoRevisoes.findAll", query = "SELECT hr FROM HistoricoVeiculoRevisoes hr"),
    @NamedQuery(name = "HistoricoVeiculoRevisoes.listarRevisoesVeiculos", query = "SELECT hr FROM HistoricoVeiculoRevisoes hr where hr.idVeiculo = :idVeiculo"),
    @NamedQuery(name = "HistoricoVeiculoRevisoes.listarRevisoes", query = "SELECT hr FROM HistoricoVeiculoRevisoes hr WHERE hr.idHistorico = :idHistorico")})
public class HistoricoVeiculoRevisoes implements Serializable {
    
    @Column(name = "detalhes")
    private String detalhes;
    @Column(name = "km")
    private Integer km;
    @Column(name = "data_revisao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataRevisao;
    @Column(name = "valor_revisao")
    private double valor;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_historico_veiculo_revisoes")
    private Integer idHistoricoVeiculoRevisoes;
    @Column(name = "id_historico_veiculo")
    private Integer idHistorico;
    @Column(name = "id_veiculo")
    private Integer idVeiculo;
    
    public Date getDataRevisao() {
        return dataRevisao;
    }

    public void setDataRevisao(Date dataRevisao) {
        this.dataRevisao = dataRevisao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public Integer getIdHistorico() {
        return idHistorico;
    }

    public void setIdHistorico(Integer idHistorico) {
        this.idHistorico = idHistorico;
    }

    public Integer getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(Integer idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public Integer getIdHistoricoVeiculo() {
        return idHistorico;
    }

    public void setIdHistoricoVeiculo(Integer idHistorico) {
        this.idHistorico = idHistorico;
    }

    public HistoricoVeiculoRevisoes() {
    }

    public HistoricoVeiculoRevisoes(Integer idHistoricoVeiculoRevisoes) {
        this.idHistoricoVeiculoRevisoes = idHistoricoVeiculoRevisoes;
    }

    public Integer getIdHistoricoVeiculoRevisoes() {
        return idHistoricoVeiculoRevisoes;
    }

    public void setIdHistoricoVeiculoRevisoes(Integer idHistoricoVeiculoRevisoes) {
        this.idHistoricoVeiculoRevisoes = idHistoricoVeiculoRevisoes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idHistoricoVeiculoRevisoes != null ? idHistoricoVeiculoRevisoes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistoricoVeiculoRevisoes)) {
            return false;
        }
        HistoricoVeiculoRevisoes other = (HistoricoVeiculoRevisoes) object;
        if ((this.idHistoricoVeiculoRevisoes == null && other.idHistoricoVeiculoRevisoes != null) || (this.idHistoricoVeiculoRevisoes != null && !this.idHistoricoVeiculoRevisoes.equals(other.idHistoricoVeiculoRevisoes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.toyota.entidades.HistoricoVeiculoRevisoes[ idHistoricoVeiculoRevisoes=" + idHistoricoVeiculoRevisoes + " ]";
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    public Integer getKm() {
        return km;
    }

    public void setKm(Integer km) {
        this.km = km;
    }
}
    

