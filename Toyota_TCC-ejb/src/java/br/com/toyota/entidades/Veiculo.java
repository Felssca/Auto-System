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
 * @author Felipe Saboya SCA _ TCC
 */
@Entity
@Table(name = "veiculo", catalog = "Toyota", schema = "")
@NamedQueries({
    @NamedQuery(name = "Veiculo.listarVeiculos", query = "SELECT v FROM Veiculo v"),
    @NamedQuery(name = "Veiculo.listarVeiculoUnico", query = "SELECT v FROM Veiculo v WHERE v.idVeiculo = :idVeiculo"),
    @NamedQuery(name = "Veiculo.findByModelo", query = "SELECT v FROM Veiculo v WHERE v.modelo = :modelo"),
    @NamedQuery(name = "Veiculo.findByCor", query = "SELECT v FROM Veiculo v WHERE v.cor = :cor"),
    @NamedQuery(name = "Veiculo.findByMotor", query = "SELECT v FROM Veiculo v WHERE v.motor = :motor"),
    @NamedQuery(name = "Veiculo.findByUsado", query = "SELECT v FROM Veiculo v WHERE v.usado = :usado"),
    @NamedQuery(name = "Veiculo.findByDtFabricacao", query = "SELECT v FROM Veiculo v WHERE v.dtFabricacao = :dtFabricacao")})
public class Veiculo implements Serializable {
    @Column(name ="dt_fabricacao")
    @Temporal(TemporalType.DATE)
    private Date dtFabricacao;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @GeneratedValue( strategy = GenerationType.AUTO)
    @Column(name = "id_veiculo")
    private Integer idVeiculo;
    @Size(max = 45)
    @Column(name = "modelo")
    private String modelo;
    @Size(max = 45)
    @Column(name = "cor")
    private String cor;
    @Size(max = 45)
    @Column(name = "motor")
    private String motor;
    @Column(name = "usado")
    private String usado;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "combustivel")
    private String combustivel;
    @Column(name = "portas")
    private Integer portas;
    @Column(name = "tipo_modelo")
    private String tipoModelo;

    public Veiculo() {
    }

    public Veiculo(Integer idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public Integer getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(Integer idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getUsado() {
        return usado;
    }

    public void setUsado(String usado) {
        this.usado = usado;
    }

    public Date getDtFabricacao() {
        return dtFabricacao;
    }

    public void setDtFabricacao(Date dtFabricacao) {
        this.dtFabricacao = dtFabricacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

      public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public Integer getPortas() {
        return portas;
    }

    public void setPortas(Integer portas) {
        this.portas = portas;
    }

    public String getTipoModelo() {
        return tipoModelo;
    }

    public void setTipoModelo(String tipoModelo) {
        this.tipoModelo = tipoModelo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVeiculo != null ? idVeiculo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Veiculo)) {
            return false;
        }
        Veiculo other = (Veiculo) object;
        if ((this.idVeiculo == null && other.idVeiculo != null) || (this.idVeiculo != null && !this.idVeiculo.equals(other.idVeiculo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.toyota.entidades.Veiculo[ idVeiculo=" + idVeiculo + " ]";
    }


    
}
