package br.com.saaes.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "t700avaliacao")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = T700avaliacao.FIND_ALL, query = "SELECT t FROM T700avaliacao t")})
public class T700avaliacao implements Serializable {
    private static final long serialVersionUID = 1L;
    public static final String FIND_ALL = "T700avaliacao.findAll";
    @EmbeddedId
    protected T700avaliacaoPK t700avaliacaoPK;
    @JoinColumn(name = "t906_tipo_ato_id", referencedColumnName = "id")
    @ManyToOne
    private T906tipoato t906TipoAtoId;
    @JoinColumn(name = "t905_modalidade_id", referencedColumnName = "id")
    @ManyToOne
    private T905modalidade t905ModalidadeId;
    @Column(name = "dt_avaliacao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAvaliacao;


    public T700avaliacao() {
    }

    public T700avaliacao(T700avaliacaoPK t700avaliacaoPK) {
        this.t700avaliacaoPK = t700avaliacaoPK;
    }

    public T700avaliacao(long id, T300cursos t300CursoId, T400docente t400DocenteId, T900Usuario t900UsuarioId) {
        this.t700avaliacaoPK = new T700avaliacaoPK(id, t900UsuarioId, t400DocenteId, t300CursoId);
    }

    public T700avaliacaoPK getT700avaliacaoPK() {
        return t700avaliacaoPK;
    }

    public void setT700avaliacaoPK(T700avaliacaoPK t700avaliacaoPK) {
        this.t700avaliacaoPK = t700avaliacaoPK;
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

    public Date getDtAvaliacao() {
        return dtAvaliacao;
    }

    public void setDtAvaliacao(Date dtAvaliacao) {
        this.dtAvaliacao = dtAvaliacao;
    }

    
}
