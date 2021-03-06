package br.com.saaes.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author tefi
 */
@Entity
@Table(name = "t902titulacao")
@NamedQueries({
    @NamedQuery(name = T902titulacao.FIND_ALL, query = "SELECT t FROM T902titulacao t")})
public class T902titulacao implements Serializable {
    private static final long serialVersionUID = 1L;
    public static final String FIND_ALL = "T902titulacao.findAll";
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Size(max = 50)
    @Column(name = "descricao")
    private String descricao;

    public T902titulacao() {
    }

    public T902titulacao(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
        if (!(object instanceof T902titulacao)) {
            return false;
        }
        T902titulacao other = (T902titulacao) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.saaes.modelo.T902titulacao[ id=" + id + " ]";
    }
    
}
