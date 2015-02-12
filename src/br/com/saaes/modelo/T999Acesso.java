package br.com.saaes.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 
 */
@Entity
@Table(name = "t999_acesso")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = T999Acesso.FIND_ALL, query = "SELECT t FROM T999Acesso t"),
    @NamedQuery(name = T999Acesso.FIND_USUARIO, query = "SELECT t FROM T999Acesso t WHERE t.t900Usuario = ?1")
})

public class T999Acesso implements Serializable {
    private static final long serialVersionUID = 1L;
    
    public static final String FIND_ALL = "T999Acesso.findAll";
    public static final String FIND_USUARIO = "T999Acesso.findUsuario";
    
    @EmbeddedId
    protected T999AcessoPK t999AcessoPK;
    @Size(max = 8)
    @Column(name = "senha")
    private String senha;
    @JoinColumn(name = "id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private T900Usuario t900Usuario;

    public T999Acesso() {
    }

    public T999Acesso(T999AcessoPK t999AcessoPK) {
        this.t999AcessoPK = t999AcessoPK;
    }

    public T999Acesso(int id, String login) {
        this.t999AcessoPK = new T999AcessoPK(id, login);
    }

    public T999AcessoPK getT999AcessoPK() {
        return t999AcessoPK;
    }

    public void setT999AcessoPK(T999AcessoPK t999AcessoPK) {
        this.t999AcessoPK = t999AcessoPK;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public T900Usuario getT900Usuario() {
        return t900Usuario;
    }

    public void setT900Usuario(T900Usuario t900Usuario) {
        this.t900Usuario = t900Usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (t999AcessoPK != null ? t999AcessoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof T999Acesso)) {
            return false;
        }
        T999Acesso other = (T999Acesso) object;
        if ((this.t999AcessoPK == null && other.t999AcessoPK != null) || (this.t999AcessoPK != null && !this.t999AcessoPK.equals(other.t999AcessoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.saaes.modelo.T999Acesso[ t999AcessoPK=" + t999AcessoPK + " ]";
    }
    
}
