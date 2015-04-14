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
public class T700avaliacaoPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "id")
    private long id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_t900Usuario")
    private long idt900Usuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_curso")
    private long idCurso;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_docente")
    private long idDocente;

    public T700avaliacaoPK() {
    }

    public T700avaliacaoPK(long id, long idt900Usuario, long idCurso, long idDocente) {
        this.id = id;
        this.idt900Usuario = idt900Usuario;
        this.idCurso = idCurso;
        this.idDocente = idDocente;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdt900Usuario() {
        return idt900Usuario;
    }

    public void setIdt900Usuario(long idt900Usuario) {
        this.idt900Usuario = idt900Usuario;
    }

    public long getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(long idCurso) {
        this.idCurso = idCurso;
    }

    public long getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(long idDocente) {
        this.idDocente = idDocente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (int) idt900Usuario;
        hash += (int) idCurso;
        hash += (int) idDocente;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof T700avaliacaoPK)) {
            return false;
        }
        T700avaliacaoPK other = (T700avaliacaoPK) object;
        if (this.id != other.id) {
            return false;
        }
        if (this.idt900Usuario != other.idt900Usuario) {
            return false;
        }
        if (this.idCurso != other.idCurso) {
            return false;
        }
        if (this.idDocente != other.idDocente) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.saaes.modelo.T700avaliacaoPK[ id=" + id + ", idt900Usuario=" + idt900Usuario + ", idCurso=" + idCurso + ", idDocente=" + idDocente + " ]";
    }
    
}
