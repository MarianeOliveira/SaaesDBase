package br.com.saaes.modelo;

import java.io.Serializable;
import java.math.BigInteger;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 
 */
@Entity
@Table(name = "t900_usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "T900Usuario.findAll", query = "SELECT t FROM T900Usuario t"),
    @NamedQuery(name = "T900Usuario.findById", query = "SELECT t FROM T900Usuario t WHERE t.id = ?1"),
    @NamedQuery(name = T900Usuario.BUSCA_USUARIO, query = "SELECT t FROM T900Usuario t WHERE t.usuario = ?1"),
    @NamedQuery(name = "T900Usuario.findBySenha", query = "SELECT t FROM T900Usuario t WHERE t.senha = ?1")})

public class T900Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    
    public static final String BUSCA_USUARIO = "T900Usuario.findByUsuario";
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "usuario")
    private String usuario;
    @Size(max = 255)
    @Column(name = "senha")
    private String senha;
    @Column(name = "dt_inc")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtInc;
    @Column(name = "dt_fim")
    @Temporal(TemporalType.DATE)
    private Date dtFim;
    @Size(max = 255)
    @Column(name = "nome")
    private String nome;
    @Column(name = "telefone")
    private BigInteger telefone;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="E-mail inválido")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 255)
    @Column(name = "email")
    private String email;
    @Column(name = "ativo")
    private Boolean ativo;

    public T900Usuario() {
    }

    public T900Usuario(Long id) {
        this.id = id;
    }

    public T900Usuario(Long id, String usuario) {
        this.id = id;
        this.usuario = usuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigInteger getTelefone() {
        return telefone;
    }

    public void setTelefone(BigInteger telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof T900Usuario)) {
            return false;
        }
        T900Usuario other = (T900Usuario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.saaes.modelo.T900Usuario[ id=" + id + " ]";
    }
    
}
