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
@Table(name = "cliente", catalog = "Toyota", schema = "")
@NamedQueries({
    @NamedQuery(name = "Cliente.listarClientes", query = "SELECT c FROM Cliente c ORDER BY c.nome ASC"),
    @NamedQuery(name = "Cliente.findByIdCliente", query = "SELECT c FROM Cliente c WHERE c.idCliente = :idCliente"),
    @NamedQuery(name = "Cliente.pesquisarNome", query = "SELECT c FROM Cliente c WHERE c.nome = :nome"),
    @NamedQuery(name = "Cliente.findBySobrenome", query = "SELECT c FROM Cliente c WHERE c.sobrenome = :sobrenome"),
    @NamedQuery(name = "Cliente.findByEndereco", query = "SELECT c FROM Cliente c WHERE c.endereco = :endereco"),
    @NamedQuery(name = "Cliente.findByTelefoneRes", query = "SELECT c FROM Cliente c WHERE c.telefoneRes = :telefoneRes"),
    @NamedQuery(name = "Cliente.findByTelefoneCel", query = "SELECT c FROM Cliente c WHERE c.telefoneCel = :telefoneCel"),
    @NamedQuery(name = "Cliente.findByTelefoneComercial", query = "SELECT c FROM Cliente c WHERE c.telefoneComercial = :telefoneComercial"),
    @NamedQuery(name = "Cliente.findByCpf", query = "SELECT c FROM Cliente c WHERE c.cpf = :cpf"),
    @NamedQuery(name = "Cliente.findByDtAniversario", query = "SELECT c FROM Cliente c WHERE c.dtAniversario = :dtAniversario"),
    @NamedQuery(name = "Cliente.findByRg", query = "SELECT c FROM Cliente c WHERE c.rg = :rg")})
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @GeneratedValue( strategy = GenerationType.AUTO)
    @Column(name = "id_cliente")
    private Integer idCliente;
    @Size(max = 45)
    @Column(name = "nome")
    private String nome;
    @Size(max = 45)
    @Column(name = "sobrenome")
    private String sobrenome;
    @Size(max = 150)
    @Column(name = "endereco")
    private String endereco;
    @Size(max = 45)
    @Column(name = "telefone_res")
    private String telefoneRes;
    @Size(max = 45)
    @Column(name = "telefone_cel")
    private String telefoneCel;
    @Size(max = 45)
    @Column(name = "telefone_comercial")
    private String telefoneComercial;
    @Size(max = 45)
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "dt_aniversario")
    @Temporal(TemporalType.DATE)
    private Date dtAniversario;
    @Size(max = 45)
    @Column(name = "rg")
    private String rg;
    @Size(max = 45)
    @Column(name = "cidade")
    private String cidade;
    @Size(max = 45)
    @Column(name = "estado")
    private String estado;
    @Size(max = 45)
    @Column(name = "profissao")
    private String profissao;

   
    @Size(max = 45)
    @Column(name = "cep")
    private String cep;
    /*
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCliente")
    private Collection<ClienteHistorico> clienteHistoricoCollection;
     * */
    public Cliente() {
    }

    public Cliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefoneRes() {
        return telefoneRes;
    }

    public void setTelefoneRes(String telefoneRes) {
        this.telefoneRes = telefoneRes;
    }

    public String getTelefoneCel() {
        return telefoneCel;
    }

    public void setTelefoneCel(String telefoneCel) {
        this.telefoneCel = telefoneCel;
    }

    public String getTelefoneComercial() {
        return telefoneComercial;
    }

    public void setTelefoneComercial(String telefoneComercial) {
        this.telefoneComercial = telefoneComercial;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDtAniversario() {
        return dtAniversario;
    }

    public void setDtAniversario(Date dtAniversario) {
        this.dtAniversario = dtAniversario;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
     public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

/*
    public Collection<ClienteHistorico> getClienteHistoricoCollection() {
        return clienteHistoricoCollection;
    }

    public void setClienteHistoricoCollection(Collection<ClienteHistorico> clienteHistoricoCollection) {
        this.clienteHistoricoCollection = clienteHistoricoCollection;
    }
     * 
     */
      public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCliente != null ? idCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.idCliente == null && other.idCliente != null) || (this.idCliente != null && !this.idCliente.equals(other.idCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.toyota.entidades.Cliente[ idCliente=" + idCliente + " ]";
    }
    
}
