/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.saaes.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author tefi
 */
@Embeddable
public class T400docentePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "id")
    private long id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_curso")
    private long idCurso;

    public T400docentePK() {
    }

    public T400docentePK(long id, long idCurso) {
        this.id = id;
        this.idCurso = idCurso;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(long idCurso) {
        this.idCurso = idCurso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (int) idCurso;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof T400docentePK)) {
            return false;
        }
        T400docentePK other = (T400docentePK) object;
        if (this.id != other.id) {
            return false;
        }
        if (this.idCurso != other.idCurso) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.saaes.modelo.T400docentePK[ id=" + id + ", idCurso=" + idCurso + " ]";
    }
    
}
