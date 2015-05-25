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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

/**
 *
 * @author f4679646
 */
@Embeddable
public class T910indicadoresPK implements Serializable {

    @JoinColumn(name = "t906_tipo_ato_id", referencedColumnName = "id")
    @ManyToOne
    private T906tipoato t906TipoAtoId;
    @JoinColumn(name = "t905_modalidade_id", referencedColumnName = "id")
    @ManyToOne
    private T905modalidade t905ModalidadeId;
    @JoinColumn(name = "t907_tipo_curso_id", referencedColumnName = "id")
    @ManyToOne
    private T907tipocurso t907TipoCursoId;

    public T910indicadoresPK() {
    }

    public T910indicadoresPK(T906tipoato t906TipoAtoId, T905modalidade t905ModalidadeId, T907tipocurso t907TipoCursoId) {
        this.t906TipoAtoId = t906TipoAtoId;
        this.t905ModalidadeId = t905ModalidadeId;
        this.t907TipoCursoId = t907TipoCursoId;
    }

    public T906tipoato getT906TipoAtoId() {
        return t906TipoAtoId;
    }

    public void setT906TipoAtoId(T906tipoato t906TipoAtoId) {
        this.t906TipoAtoId = t906TipoAtoId;
    }

    public T905modalidade getT905ModalidadeId() {
        return t905ModalidadeId;
    }

    public void setT905ModalidadeId(T905modalidade t905ModalidadeId) {
        this.t905ModalidadeId = t905ModalidadeId;
    }

    public T907tipocurso getT907TipoCursoId() {
        return t907TipoCursoId;
    }

    public void setT907TipoCursoId(T907tipocurso t907TipoCursoId) {
        this.t907TipoCursoId = t907TipoCursoId;
    }

   
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof T910indicadoresPK)) {
            return false;
        }
        T910indicadoresPK other = (T910indicadoresPK) object;
        if (this.t906TipoAtoId != other.t906TipoAtoId) {
            return false;
        }
        if (this.t905ModalidadeId != other.t905ModalidadeId) {
            return false;
        }
        if (this.t907TipoCursoId != other.t907TipoCursoId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.saaes.modelo.T910indicadoresPK[ t906TipoAtoId=" + t906TipoAtoId + ", t905ModalidadeId=" + t905ModalidadeId + ", t907TipoCursoId=" + t907TipoCursoId + " ]";
    }
    
}
