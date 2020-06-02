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
import javax.validation.constraints.Size;

/**
 *
 * @author Kabelera
 */
@Entity
@Table(name = "historico_veiculo")
@NamedQueries({
    @NamedQuery(name = "HistoricoVeiculo.findAll", query = "SELECT h FROM HistoricoVeiculo h"),
    @NamedQuery(name = "HistoricoVeiculo.findByIdHistoricoVeiculo", query = "SELECT h FROM HistoricoVeiculo h WHERE h.idHistorico = :idHistorico"),
    @NamedQuery(name = "HistoricoVeiculo.listarHistorico", query = "SELECT h FROM HistoricoVeiculo h WHERE h.idVeiculo = :idVeiculo"),
      @NamedQuery(name = "HistoricoVeiculo.listarHistoricoUnico", query = "SELECT h.idHistorico FROM HistoricoVeiculo h WHERE h.idVeiculo = :idVeiculo"),
    @NamedQuery(name = "HistoricoVeiculo.findByDtEntrada", query = "SELECT h FROM HistoricoVeiculo h WHERE h.dtEntrada = :dtEntrada"),
    @NamedQuery(name = "HistoricoVeiculo.findByDtSaida", query = "SELECT h FROM HistoricoVeiculo h WHERE h.dtSaida = :dtSaida"),
    @NamedQuery(name = "HistoricoVeiculo.findByProprietario", query = "SELECT h FROM HistoricoVeiculo h WHERE h.proprietario = :proprietario"),
    @NamedQuery(name = "HistoricoVeiculo.findBySinistro", query = "SELECT h FROM HistoricoVeiculo h WHERE h.sinistro = :sinistro"),
    @NamedQuery(name = "HistoricoVeiculo.findByEstado", query = "SELECT h FROM HistoricoVeiculo h WHERE h.estado = :estado"),
    @NamedQuery(name = "HistoricoVeiculo.findByLocalVenda", query = "SELECT h FROM HistoricoVeiculo h WHERE h.localVenda = :localVenda"),
    @NamedQuery(name = "HistoricoVeiculo.findByMultas", query = "SELECT h FROM HistoricoVeiculo h WHERE h.multas = :multas"),
    @NamedQuery(name = "HistoricoVeiculo.findByIpva", query = "SELECT h FROM HistoricoVeiculo h WHERE h.ipva = :ipva")})
public class HistoricoVeiculo implements Serializable {

    @Column(name = "dt_entrada")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtEntrada;
    @Column(name = "dt_saida")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtSaida;
    @Column(name = "km")
    private Integer km;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_historico_veiculo")
    private Integer idHistorico;
    @Size(max = 45)
    @Column(name = "proprietario")
    private String proprietario;
    @Size(max = 45)
    @Column(name = "sinistro")
    private String sinistro;
    @Size(max = 45)
    @Column(name = "estado")
    private String estado;
    @Size(max = 45)
    @Column(name = "local_venda")
    private String localVenda;
    @Size(max = 45)
    @Column(name = "multas")
    private String multas;
    @Size(max = 45)
    @Column(name = "ipva")
    private String ipva;
    @Column(name = "id_veiculo")
    private Integer idVeiculo;


    public Integer getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(Integer idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public HistoricoVeiculo() {
    }

    public HistoricoVeiculo(Integer idHistorico) {
        this.idHistorico = idHistorico;
    }

    public Integer getIdHistorico() {
        return idHistorico;
    }

    public void setIdHistorico(Integer idHistorico) {
        this.idHistorico = idHistorico;
    }

    public Date getDtEntrada() {
        return dtEntrada;
    }

    public void setDtEntrada(Date dtEntrada) {
        this.dtEntrada = dtEntrada;
    }

    public Date getDtSaida() {
        return dtSaida;
    }

    public void setDtSaida(Date dtSaida) {
        this.dtSaida = dtSaida;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getSinistro() {
        return sinistro;
    }

    public void setSinistro(String sinistro) {
        this.sinistro = sinistro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getLocalVenda() {
        return localVenda;
    }

    public void setLocalVenda(String localVenda) {
        this.localVenda = localVenda;
    }

    public String getMultas() {
        return multas;
    }

    public void setMultas(String multas) {
        this.multas = multas;
    }

    public String getIpva() {
        return ipva;
    }

    public void setIpva(String ipva) {
        this.ipva = ipva;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idHistorico != null ? idHistorico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistoricoVeiculo)) {
            return false;
        }
        HistoricoVeiculo other = (HistoricoVeiculo) object;
        if ((this.idHistorico == null && other.idHistorico != null) || (this.idHistorico != null && !this.idHistorico.equals(other.idHistorico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.toyota.entidades.HistoricoVeiculo[ idHistoricoVeiculo=" + idHistorico + " ]";
    }

    public Integer getKm() {
        return km;
    }

    public void setKm(Integer km) {
        this.km = km;
    }

 
}
