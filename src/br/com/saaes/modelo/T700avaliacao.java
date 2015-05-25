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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tefi
 */
@Entity
@Table(name = "t700avaliacao")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = T700avaliacao.FIND_ALL, query = "SELECT t FROM T700avaliacao t"),
    @NamedQuery(name = T700avaliacao.FIND_BY_ID, query = "SELECT t FROM T700avaliacao t WHERE t.t700avaliacaoPK.id = ?1"),
    @NamedQuery(name = T700avaliacao.FIND_BY_T200, query = "SELECT t FROM T700avaliacao t WHERE t.t700avaliacaoPK.t300CursoId.t200IesId = ?1"),
    @NamedQuery(name = T700avaliacao.FIND_BY_T300, query = "SELECT t FROM T700avaliacao t WHERE t.t700avaliacaoPK.t300CursoId = ?1"),
    @NamedQuery(name = T700avaliacao.FIND_BY_DT_AVALIACAO, query = "SELECT t FROM T700avaliacao t WHERE t.dtAvaliacao = ?1")})

public class T700avaliacao implements Serializable {
    private static final long serialVersionUID = 1L;
    public static final String FIND_ALL = "T700avaliacao.findAll";
    public static final String FIND_BY_ID = "T700avaliacao.findById";
    public static final String FIND_BY_T200 = "T700avaliacao.findByT200IesId";
    public static final String FIND_BY_T300 = "T700avaliacao.findByT300CursoId";
    public static final String FIND_BY_DT_AVALIACAO = "T700avaliacao.findByDtAvaliacao";
    @EmbeddedId
    protected T700avaliacaoPK t700avaliacaoPK;
    @Size(max = 19)
    @Column(name = "conceito_ind_2_2")
    private String conceitoInd2_2 = "NAO SE APLICA";
    @Size(max = 19)
    @Column(name = "conceito_ind_2_3")
    private String conceitoInd2_3 = "NAO SE APLICA";
    @Size(max = 19)
    @Column(name = "conceito_ind_2_4")
    private String conceitoInd2_4 = "NAO SE APLICA";
    @Size(max = 19)
    @Column(name = "conceito_ind_2_5")
    private String conceitoInd2_5 = "NAO SE APLICA";
    @Size(max = 19)
    @Column(name = "conceito_ind_2_6")
    private String conceitoInd2_6 = "NAO SE APLICA";
    @Size(max = 19)
    @Column(name = "conceito_ind_2_7")
    private String conceitoInd2_7 = "NAO SE APLICA";
    @Size(max = 19)
    @Column(name = "conceito_ind_2_8")
    private String conceitoInd2_8 = "NAO SE APLICA";
    @Size(max = 19)
    @Column(name = "conceito_ind_2_9")
    private String conceitoInd2_9 = "NAO SE APLICA";
    @Size(max = 19)
    @Column(name = "conceito_ind_2_10")
    private String conceitoInd2_10 = "NAO SE APLICA";
    @Size(max = 19)
    @Column(name = "conceito_ind_2_11")
    private String conceitoInd2_11 = "NAO SE APLICA";
    @Size(max = 19)
    @Column(name = "conceito_ind_2_12")
    private String conceitoInd2_12 = "NAO SE APLICA";
    @Size(max = 19)
    @Column(name = "conceito_ind_2_13")
    private String conceitoInd2_13 = "NAO SE APLICA";
    @Size(max = 19)
    @Column(name = "conceito_ind_2_15")
    private String conceitoInd2_15 = "NAO SE APLICA";
    @Size(max = 19)
    @Column(name = "conceito_ind_2_17")
    private String conceitoInd2_17 = "NAO SE APLICA";
    @Size(max = 19)
    @Column(name = "conceito_ind_2_18")
    private String conceitoInd2_18 = "NAO SE APLICA";
    @Size(max = 19)
    @Column(name = "conceito_ind_2_19")
    private String conceitoInd2_19 = "NAO SE APLICA";
    @Size(max = 19)
    @Column(name = "conceito_ind_2_20")
    private String conceitoInd2_20 = "NAO SE APLICA";
    @Size(max = 19)
    @Column(name = "conceito_ind_3_6")
    private String conceitoInd3_6 = "NAO SE APLICA";
    @Size(max = 19)
    @Column(name = "conceito_ind_3_7")
    private String conceitoInd3_7 = "NAO SE APLICA";
    @Size(max = 19)
    @Column(name = "conceito_ind_3_8")
    private String conceitoInd3_8 = "NAO SE APLICA";
    @Column(name="nota_ind2")
    private Double notaInd2;
    @Column(name="nota_ind3")
    private Double notaInd3;
    @Column(name = "dt_avaliacao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAvaliacao;
    @JoinColumn(name = "t906_tipo_ato_id", referencedColumnName = "id")
    @ManyToOne
    private T906tipoato t906TipoAtoId;
    @JoinColumn(name = "t905_modalidade_id", referencedColumnName = "id")
    @ManyToOne
    private T905modalidade t905ModalidadeId;
    @JoinColumn(name = "t900_usuario_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private T900Usuario t900UsuarioId;

    public T700avaliacao() {
    }

    public T700avaliacao(T700avaliacaoPK t700avaliacaoPK) {
        this.t700avaliacaoPK = t700avaliacaoPK;
    }

    public T700avaliacao(long id, T300cursos t300CursoId) {
        this.t700avaliacaoPK = new T700avaliacaoPK(id, t300CursoId);
    }

    public T700avaliacaoPK getT700avaliacaoPK() {
        return t700avaliacaoPK;
    }

    public void setT700avaliacaoPK(T700avaliacaoPK t700avaliacaoPK) {
        this.t700avaliacaoPK = t700avaliacaoPK;
    }

    public String getConceitoInd2_2() {
        return conceitoInd2_2;
    }

    public void setConceitoInd2_2(String conceitoInd2_2) {
        this.conceitoInd2_2 = conceitoInd2_2;
    }

    public String getConceitoInd2_3() {
        return conceitoInd2_3;
    }

    public void setConceitoInd2_3(String conceitoInd2_3) {
        this.conceitoInd2_3 = conceitoInd2_3;
    }

    public String getConceitoInd2_4() {
        return conceitoInd2_4;
    }

    public void setConceitoInd2_4(String conceitoInd2_4) {
        this.conceitoInd2_4 = conceitoInd2_4;
    }

    public String getConceitoInd2_5() {
        return conceitoInd2_5;
    }

    public void setConceitoInd2_5(String conceitoInd2_5) {
        this.conceitoInd2_5 = conceitoInd2_5;
    }

    public String getConceitoInd2_6() {
        return conceitoInd2_6;
    }

    public void setConceitoInd2_6(String conceitoInd2_6) {
        this.conceitoInd2_6 = conceitoInd2_6;
    }

    public String getConceitoInd2_7() {
        return conceitoInd2_7;
    }

    public void setConceitoInd2_7(String conceitoInd2_7) {
        this.conceitoInd2_7 = conceitoInd2_7;
    }

    public String getConceitoInd2_8() {
        return conceitoInd2_8;
    }

    public void setConceitoInd2_8(String conceitoInd2_8) {
        this.conceitoInd2_8 = conceitoInd2_8;
    }

    public String getConceitoInd2_9() {
        return conceitoInd2_9;
    }

    public void setConceitoInd2_9(String conceitoInd2_9) {
        this.conceitoInd2_9 = conceitoInd2_9;
    }

    public String getConceitoInd2_10() {
        return conceitoInd2_10;
    }

    public void setConceitoInd2_10(String conceitoInd2_10) {
        this.conceitoInd2_10 = conceitoInd2_10;
    }

    public String getConceitoInd2_11() {
        return conceitoInd2_11;
    }

    public void setConceitoInd2_11(String conceitoInd2_11) {
        this.conceitoInd2_11 = conceitoInd2_11;
    }

    public String getConceitoInd2_12() {
        return conceitoInd2_12;
    }

    public void setConceitoInd2_12(String conceitoInd2_12) {
        this.conceitoInd2_12 = conceitoInd2_12;
    }

    public String getConceitoInd2_13() {
        return conceitoInd2_13;
    }

    public void setConceitoInd2_13(String conceitoInd2_13) {
        this.conceitoInd2_13 = conceitoInd2_13;
    }

    public String getConceitoInd2_15() {
        return conceitoInd2_15;
    }

    public void setConceitoInd2_15(String conceitoInd2_15) {
        this.conceitoInd2_15 = conceitoInd2_15;
    }

    public String getConceitoInd2_17() {
        return conceitoInd2_17;
    }

    public void setConceitoInd2_17(String conceitoInd2_17) {
        this.conceitoInd2_17 = conceitoInd2_17;
    }

    public String getConceitoInd2_18() {
        return conceitoInd2_18;
    }

    public void setConceitoInd2_18(String conceitoInd2_18) {
        this.conceitoInd2_18 = conceitoInd2_18;
    }

    public String getConceitoInd2_19() {
        return conceitoInd2_19;
    }

    public void setConceitoInd2_19(String conceitoInd2_19) {
        this.conceitoInd2_19 = conceitoInd2_19;
    }

    public String getConceitoInd2_20() {
        return conceitoInd2_20;
    }

    public void setConceitoInd2_20(String conceitoInd2_20) {
        this.conceitoInd2_20 = conceitoInd2_20;
    }

    public String getConceitoInd3_6() {
        return conceitoInd3_6;
    }

    public void setConceitoInd3_6(String conceitoInd3_6) {
        this.conceitoInd3_6 = conceitoInd3_6;
    }

    public String getConceitoInd3_7() {
        return conceitoInd3_7;
    }

    public void setConceitoInd3_7(String conceitoInd3_7) {
        this.conceitoInd3_7 = conceitoInd3_7;
    }

    public String getConceitoInd3_8() {
        return conceitoInd3_8;
    }

    public void setConceitoInd3_8(String conceitoInd3_8) {
        this.conceitoInd3_8 = conceitoInd3_8;
    }

    
    public Date getDtAvaliacao() {
        return dtAvaliacao;
    }

    public void setDtAvaliacao(Date dtAvaliacao) {
        this.dtAvaliacao = dtAvaliacao;
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

    public T900Usuario getT900UsuarioId() {
        return t900UsuarioId;
    }

    public void setT900UsuarioId(T900Usuario t900UsuarioId) {
        this.t900UsuarioId = t900UsuarioId;
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

    public Double getNotaInd2() {
        return notaInd2;
    }

    public void setNotaInd2(Double notaInd2) {
        this.notaInd2 = notaInd2;
    }

    public Double getNotaInd3() {
        return notaInd3;
    }

    public void setNotaInd3(Double notaInd3) {
        this.notaInd3 = notaInd3;
    }
    
}
