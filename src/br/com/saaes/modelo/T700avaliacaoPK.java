
package br.com.saaes.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

/**
 *
 * @author tefi
 */
@Embeddable
public class T700avaliacaoPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private long id;
    @Basic(optional = false)
    @NotNull
    @JoinColumn(name = "t900_usuario_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private T900Usuario t900UsuarioId;
    @Basic(optional = false)
    @NotNull
    @JoinColumn(name = "t400_docente_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private T400docente t400docenteId;
     @Basic(optional = false)
    @NotNull
    @JoinColumn(name = "t300_curso_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private T300cursos t300cursoId;

    public T700avaliacaoPK() {
    }
    
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + (int) (this.id ^ (this.id >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final T700avaliacaoPK other = (T700avaliacaoPK) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public T900Usuario getT900UsuarioId() {
        return t900UsuarioId;
    }

    public void setT900UsuarioId(T900Usuario t900UsuarioId) {
        this.t900UsuarioId = t900UsuarioId;
    }

    public T400docente getT400docenteId() {
        return t400docenteId;
    }

    public void setT400docenteId(T400docente t400docenteId) {
        this.t400docenteId = t400docenteId;
    }

    public T300cursos getT300cursoId() {
        return t300cursoId;
    }

    public void setT300cursoId(T300cursos t300cursoId) {
        this.t300cursoId = t300cursoId;
    }

    @Override
    public String toString() {
        return "T700avaliacaoPK{" + "id=" + id + ", t900UsuarioId=" + t900UsuarioId + ", t400docenteId=" + t400docenteId + ", t300cursosId=" + t300cursoId + '}';
    }

    public T700avaliacaoPK(long id, T900Usuario t900UsuarioId, T400docente t400docenteId, T300cursos t300cursosId) {
        this.id = id;
        this.t900UsuarioId = t900UsuarioId;
        this.t400docenteId = t400docenteId;
        this.t300cursoId = t300cursosId;
    }
   
  
}
