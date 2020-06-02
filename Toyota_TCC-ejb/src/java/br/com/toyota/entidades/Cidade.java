/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.toyota.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Kabelera
 */
@Entity
@Table(name = "cidade", catalog = "toyota", schema = "")
@NamedQueries({
    @NamedQuery(name = "Cidade.findAll", query = "SELECT c FROM Cidade c"),
    @NamedQuery(name = "Cidade.findByIdcidade", query = "SELECT c FROM Cidade c WHERE c.idcidade = :idcidade"),
    @NamedQuery(name = "Cidade.findByCodCidade", query = "SELECT c FROM Cidade c WHERE c.codCidade = :codCidade"),
    @NamedQuery(name = "Cidade.findByCodEstado", query = "SELECT c FROM Cidade c WHERE c.codEstado = :codEstado"),
    @NamedQuery(name = "Cidade.findByNomCidade", query = "SELECT c FROM Cidade c WHERE c.nomCidade = :nomCidade")})
public class Cidade implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "idcidade")
    private Integer idcidade;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_cidade")
    private int codCidade;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_estado")
    private short codEstado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nom_cidade")
    private String nomCidade;

    public Cidade() {
    }

    public Cidade(Integer idcidade) {
        this.idcidade = idcidade;
    }

    public Cidade(Integer idcidade, int codCidade, short codEstado, String nomCidade) {
        this.idcidade = idcidade;
        this.codCidade = codCidade;
        this.codEstado = codEstado;
        this.nomCidade = nomCidade;
    }

    public Integer getIdcidade() {
        return idcidade;
    }

    public void setIdcidade(Integer idcidade) {
        this.idcidade = idcidade;
    }

    public int getCodCidade() {
        return codCidade;
    }

    public void setCodCidade(int codCidade) {
        this.codCidade = codCidade;
    }

    public short getCodEstado() {
        return codEstado;
    }

    public void setCodEstado(short codEstado) {
        this.codEstado = codEstado;
    }

    public String getNomCidade() {
        return nomCidade;
    }

    public void setNomCidade(String nomCidade) {
        this.nomCidade = nomCidade;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcidade != null ? idcidade.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cidade)) {
            return false;
        }
        Cidade other = (Cidade) object;
        if ((this.idcidade == null && other.idcidade != null) || (this.idcidade != null && !this.idcidade.equals(other.idcidade))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.toyota.entidades.Cidade[ idcidade=" + idcidade + " ]";
    }
    
}
