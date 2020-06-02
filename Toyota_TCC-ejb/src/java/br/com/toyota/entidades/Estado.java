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
@Table(name = "estado", catalog = "toyota", schema = "")
@NamedQueries({
    @NamedQuery(name = "Estado.listarTodos", query = "SELECT e FROM Estado e"),
    @NamedQuery(name = "Estado.findByCodEstado", query = "SELECT e FROM Estado e WHERE e.codEstado = :codEstado"),
    @NamedQuery(name = "Estado.findByCodPais", query = "SELECT e FROM Estado e WHERE e.codPais = :codPais"),
    @NamedQuery(name = "Estado.findBySglEstado", query = "SELECT e FROM Estado e WHERE e.sglEstado = :sglEstado"),
    @NamedQuery(name = "Estado.findByNomEstado", query = "SELECT e FROM Estado e WHERE e.nomEstado = :nomEstado"),
    @NamedQuery(name = "Estado.findByIdEstado", query = "SELECT e FROM Estado e WHERE e.idEstado = :idEstado")})
public class Estado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_estado")
    private short codEstado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_pais")
    private short codPais;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "sgl_estado")
    private String sglEstado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nom_estado")
    private String nomEstado;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_estado")
    private Integer idEstado;

    public Estado() {
    }

    public Estado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public Estado(Integer idEstado, short codEstado, short codPais, String sglEstado, String nomEstado) {
        this.idEstado = idEstado;
        this.codEstado = codEstado;
        this.codPais = codPais;
        this.sglEstado = sglEstado;
        this.nomEstado = nomEstado;
    }

    public short getCodEstado() {
        return codEstado;
    }

    public void setCodEstado(short codEstado) {
        this.codEstado = codEstado;
    }

    public short getCodPais() {
        return codPais;
    }

    public void setCodPais(short codPais) {
        this.codPais = codPais;
    }

    public String getSglEstado() {
        return sglEstado;
    }

    public void setSglEstado(String sglEstado) {
        this.sglEstado = sglEstado;
    }

    public String getNomEstado() {
        return nomEstado;
    }

    public void setNomEstado(String nomEstado) {
        this.nomEstado = nomEstado;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstado != null ? idEstado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estado)) {
            return false;
        }
        Estado other = (Estado) object;
        if ((this.idEstado == null && other.idEstado != null) || (this.idEstado != null && !this.idEstado.equals(other.idEstado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.toyota.entidades.Estado[ idEstado=" + idEstado + " ]";
    }
    
}
