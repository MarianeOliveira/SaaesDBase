package br.com.saaes.modelo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
//import org.codehaus.jackson.annotate.JsonIgnore;

/**
 *
 * @author f4679646
 */
@Entity
@Table(name = "t901_tp_usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "T901TpUsuario.findAll", query = "SELECT t FROM T901TpUsuario t")})
public class T901TpUsuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Size(max = 255)
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "ativo")
    private Integer ativo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "t901TpUsuario")
    private Collection<T900Usuario> t900UsuarioCollection;

    public T901TpUsuario() {
    }

    public T901TpUsuario(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getAtivo() {
        return ativo;
    }

    public void setAtivo(Integer ativo) {
        this.ativo = ativo;
    }

    @XmlTransient
//    @JsonIgnore
    public Collection<T900Usuario> getT900UsuarioCollection() {
        return t900UsuarioCollection;
    }

    public void setT900UsuarioCollection(Collection<T900Usuario> t900UsuarioCollection) {
        this.t900UsuarioCollection = t900UsuarioCollection;
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
        if (!(object instanceof T901TpUsuario)) {
            return false;
        }
        T901TpUsuario other = (T901TpUsuario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.saaes.modelo.T901TpUsuario[ id=" + id + " ]";
    }
    
}
