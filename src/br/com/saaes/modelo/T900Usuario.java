package br.com.saaes.modelo;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
//import org.codehaus.jackson.annotate.JsonIgnore;

/**
 *
 * @author f4679646
 */
@Entity
@Table(name = "t900_usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "T900Usuario.findAll", query = "SELECT t FROM T900Usuario t")})
public class T900Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected T900UsuarioPK t900UsuarioPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "cpf_cnpj")
    private String cpfCnpj;
    @Column(name = "dt_inc")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtInc;
    @Column(name = "dt_fim")
    @Temporal(TemporalType.DATE)
    private Date dtFim;
    @Size(max = 12)
    @Column(name = "cd_usu_reg")
    private String cdUsuReg;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ativo")
    private boolean ativo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "t900Usuario")
    private Collection<T999Acesso> t999AcessoCollection;
    @JoinColumn(name = "id_tp_usu", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private T901TpUsuario t901TpUsuario;

    public T900Usuario() {
    }

    public T900Usuario(T900UsuarioPK t900UsuarioPK) {
        this.t900UsuarioPK = t900UsuarioPK;
    }

    public T900Usuario(T900UsuarioPK t900UsuarioPK, String nome, String cpfCnpj, boolean ativo) {
        this.t900UsuarioPK = t900UsuarioPK;
        this.nome = nome;
        this.cpfCnpj = cpfCnpj;
        this.ativo = ativo;
    }

    public T900Usuario(int id, String cdUsu, long idTpUsu) {
        this.t900UsuarioPK = new T900UsuarioPK(id, cdUsu, idTpUsu);
    }

    public T900UsuarioPK getT900UsuarioPK() {
        return t900UsuarioPK;
    }

    public void setT900UsuarioPK(T900UsuarioPK t900UsuarioPK) {
        this.t900UsuarioPK = t900UsuarioPK;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public Date getDtInc() {
        return dtInc;
    }

    public void setDtInc(Date dtInc) {
        this.dtInc = dtInc;
    }

    public Date getDtFim() {
        return dtFim;
    }

    public void setDtFim(Date dtFim) {
        this.dtFim = dtFim;
    }

    public String getCdUsuReg() {
        return cdUsuReg;
    }

    public void setCdUsuReg(String cdUsuReg) {
        this.cdUsuReg = cdUsuReg;
    }

    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @XmlTransient
//    @JsonIgnore
    public Collection<T999Acesso> getT999AcessoCollection() {
        return t999AcessoCollection;
    }

    public void setT999AcessoCollection(Collection<T999Acesso> t999AcessoCollection) {
        this.t999AcessoCollection = t999AcessoCollection;
    }

    public T901TpUsuario getT901TpUsuario() {
        return t901TpUsuario;
    }

    public void setT901TpUsuario(T901TpUsuario t901TpUsuario) {
        this.t901TpUsuario = t901TpUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (t900UsuarioPK != null ? t900UsuarioPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof T900Usuario)) {
            return false;
        }
        T900Usuario other = (T900Usuario) object;
        if ((this.t900UsuarioPK == null && other.t900UsuarioPK != null) || (this.t900UsuarioPK != null && !this.t900UsuarioPK.equals(other.t900UsuarioPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.saaes.modelo.T900Usuario[ t900UsuarioPK=" + t900UsuarioPK + " ]";
    }
    
}
