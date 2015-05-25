
package br.com.saaes.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tefi
 */
@Entity
@Table(name = "t400t300docentes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "T400t300docentes.findAll", query = "SELECT t FROM T400t300docentes t"),
    @NamedQuery(name = "T400t300docentes.findById", query = "SELECT t FROM T400t300docentes t WHERE t.id = :id"),
    @NamedQuery(name = "T400t300docentes.findByDtCadastro", query = "SELECT t FROM T400t300docentes t WHERE t.dtCadastro = :dtCadastro")})
public class T400t300docentes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @JoinColumn(name = "t300_curso_id", referencedColumnName = "id")
    @ManyToOne
    private T300cursos t300CursoId;
    @JoinColumn(name = "t400_docente_id", referencedColumnName = "id")
    @ManyToOne
    private T400docente t400DocenteId;
    @Column(name = "dt_cadastro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCadastro;

    public T400t300docentes() {
    }

    public T400t300docentes(Long id) {
        this.id = id;
    }
    public T400t300docentes(T300cursos t300) {
        this.t300CursoId = t300;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(Date dtCadastro) {
        this.dtCadastro = dtCadastro;
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
        if (!(object instanceof T400t300docentes)) {
            return false;
        }
        T400t300docentes other = (T400t300docentes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.saaes.modelo.T400t300docentes[ id=" + id + " ]";
    }

    public T300cursos getT300CursoId() {
        return t300CursoId;
    }

    public void setT300CursoId(T300cursos t300CursoId) {
        this.t300CursoId = t300CursoId;
    }

    public T400docente getT400DocenteId() {
        return t400DocenteId;
    }

    public void setT400DocenteId(T400docente t400DocenteId) {
        this.t400DocenteId = t400DocenteId;
    }
    
}
