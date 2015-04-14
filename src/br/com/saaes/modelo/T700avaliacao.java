package br.com.saaes.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tefi
 */
@Entity
@Table(name = "t700avaliacao")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "T700avaliacao.findAll", query = "SELECT t FROM T700avaliacao t"),
    @NamedQuery(name = "T700avaliacao.findById", query = "SELECT t FROM T700avaliacao t WHERE t.t700avaliacaoPK.id = :id"),
    @NamedQuery(name = "T700avaliacao.findByIdt900Usuario", query = "SELECT t FROM T700avaliacao t WHERE t.t700avaliacaoPK.idt900Usuario = :idt900Usuario"),
    @NamedQuery(name = "T700avaliacao.findByIdCurso", query = "SELECT t FROM T700avaliacao t WHERE t.t700avaliacaoPK.idCurso = :idCurso"),
    @NamedQuery(name = "T700avaliacao.findByIdDocente", query = "SELECT t FROM T700avaliacao t WHERE t.t700avaliacaoPK.idDocente = :idDocente"),
    @NamedQuery(name = "T700avaliacao.findByModalidade", query = "SELECT t FROM T700avaliacao t WHERE t.modalidade = :modalidade"),
    @NamedQuery(name = "T700avaliacao.findByTipoAto", query = "SELECT t FROM T700avaliacao t WHERE t.tipoAto = :tipoAto")})
public class T700avaliacao implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected T700avaliacaoPK t700avaliacaoPK;
    @Column(name = "modalidade")
    private Integer modalidade;
    @Column(name = "tipo_ato")
    private Integer tipoAto;

    public T700avaliacao() {
    }

    public T700avaliacao(T700avaliacaoPK t700avaliacaoPK) {
        this.t700avaliacaoPK = t700avaliacaoPK;
    }

    public T700avaliacao(long id, long idt900Usuario, long idCurso, long idDocente) {
        this.t700avaliacaoPK = new T700avaliacaoPK(id, idt900Usuario, idCurso, idDocente);
    }

    public T700avaliacaoPK getT700avaliacaoPK() {
        return t700avaliacaoPK;
    }

    public void setT700avaliacaoPK(T700avaliacaoPK t700avaliacaoPK) {
        this.t700avaliacaoPK = t700avaliacaoPK;
    }

    public Integer getModalidade() {
        return modalidade;
    }

    public void setModalidade(Integer modalidade) {
        this.modalidade = modalidade;
    }

    public Integer getTipoAto() {
        return tipoAto;
    }

    public void setTipoAto(Integer tipoAto) {
        this.tipoAto = tipoAto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (t700avaliacaoPK != null ? t700avaliacaoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof T700avaliacao)) {
            return false;
        }
        T700avaliacao other = (T700avaliacao) object;
        if ((this.t700avaliacaoPK == null && other.t700avaliacaoPK != null) || (this.t700avaliacaoPK != null && !this.t700avaliacaoPK.equals(other.t700avaliacaoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.saaes.modelo.T700avaliacao[ t700avaliacaoPK=" + t700avaliacaoPK + " ]";
    }
    
}
