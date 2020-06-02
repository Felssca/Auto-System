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

/**
 *
 * @author Felipe Saboya SCA _ TCC
 */
@Entity
@Table(name = "log_sistema", catalog = "Toyota", schema = "")
@NamedQueries({
    @NamedQuery(name = "LogSistema.findAll", query = "SELECT l FROM LogSistema l"),
    @NamedQuery(name = "LogSistema.findByIdlog", query = "SELECT l FROM LogSistema l WHERE l.idlog = :idlog"),
    @NamedQuery(name = "LogSistema.findByDtModificacao", query = "SELECT l FROM LogSistema l WHERE l.dtModificacao = :dtModificacao")})
public class LogSistema implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @GeneratedValue( strategy = GenerationType.AUTO)
    @Column(name = "idlog")
    private Integer idlog;
    @Column(name = "dt_modificacao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtModificacao; 
    @Column(name = "texto")
    private String texto;
    @Column(name = "tipo_log")
    private String tipoLog;
    @Column(name = "modulo_sistema")
    private String modulo_sistema;

    public String getModulo_sistema() {
        return modulo_sistema;
    }

    public void setModulo_sistema(String modulo_sistema) {
        this.modulo_sistema = modulo_sistema;
    }

    public String getTipoLog() {
        return tipoLog;
    }

    public void setTipoLog(String tipoLog) {
        this.tipoLog = tipoLog;
    }

    public LogSistema() {
    }

    public LogSistema(Integer idlog) {
        this.idlog = idlog;
    }

    public Integer getIdlog() {
        return idlog;
    }

    public void setIdlog(Integer idlog) {
        this.idlog = idlog;
    }

    public Date getDtModificacao() {
        return dtModificacao;
    }

    public void setDtModificacao(Date dtModificacao) {
        this.dtModificacao = dtModificacao;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idlog != null ? idlog.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LogSistema)) {
            return false;
        }
        LogSistema other = (LogSistema) object;
        if ((this.idlog == null && other.idlog != null) || (this.idlog != null && !this.idlog.equals(other.idlog))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.toyota.entidades.LogSistema[ idlog=" + idlog + " ]";
    }
    
}
