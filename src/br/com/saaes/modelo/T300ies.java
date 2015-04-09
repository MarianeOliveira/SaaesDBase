package br.com.saaes.modelo;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author f4679646
 */
@Entity
@Table(name = "t300ies")
@NamedQueries({
    @NamedQuery(name = T300ies.FIND_ALL, query = "SELECT t FROM T300ies t ")})

public class T300ies implements Serializable {
    @Column(name = "usuario_cadastro")
    private Integer usuarioCadastro;
    @Column(name = "dt_cadastro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCadastro;
    @OneToMany(mappedBy = "idIes")
    private Collection<T400cursos> t400cursosCollection;
    private static final long serialVersionUID = 1L;
    public static final String FIND_ALL = "T300ies.findAll";
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Size(max = 200)
    @Column(name = "nome")
    private String nome;
    @Size(max = 200)
    @Column(name = "campus")
    private String campus;

    public T300ies() {
    }

    public T300ies(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
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
        if (!(object instanceof T300ies)) {
            return false;
        }
        T300ies other = (T300ies) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.saaes.modelo.T300ies[ id=" + id + " ]";
    }

    public Integer getUsuarioCadastro() {
        return usuarioCadastro;
    }

    public void setUsuarioCadastro(Integer usuarioCadastro) {
        this.usuarioCadastro = usuarioCadastro;
    }

    public Date getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(Date dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    public Collection<T400cursos> getT400cursosCollection() {
        return t400cursosCollection;
    }

    public void setT400cursosCollection(Collection<T400cursos> t400cursosCollection) {
        this.t400cursosCollection = t400cursosCollection;
    }
    
}
