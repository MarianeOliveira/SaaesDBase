/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.saaes.modelo;

import java.io.Serializable;
import java.util.Objects;
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
     @JoinColumn(name = "t300_curso_id", referencedColumnName = "id")
    @ManyToOne
    private T300cursos t300CursoId;
 
    public T700avaliacaoPK() {
    }

    public T700avaliacaoPK(long id, T300cursos t300CursoId) {
        this.id = id;
        this.t300CursoId = t300CursoId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public T300cursos getT300CursoId() {
        return t300CursoId;
    }

    public void setT300CursoId(T300cursos t300CursoId) {
        this.t300CursoId = t300CursoId;
    }

    @Override
    public String toString() {
        return "T700avaliacaoPK{" + "id=" + id + ", t300CursoId=" + t300CursoId + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 67 * hash + Objects.hashCode(this.t300CursoId);
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
        if (!Objects.equals(this.t300CursoId, other.t300CursoId)) {
            return false;
        }
        return true;
    }


}
