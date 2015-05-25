package br.com.saaes.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author f4679646
 */
@Entity
@Table(name = "t910indicadores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = T910indicadores.FIND_ALL, query = "SELECT t FROM T910indicadores t"),
    @NamedQuery(name = T910indicadores.FIND_PK, query = "SELECT t FROM T910indicadores t WHERE t.t910indicadoresPK = ?1")
})
public class T910indicadores implements Serializable {
    private static final long serialVersionUID = 1L;
    public static final String FIND_ALL = "T910indicadores.findAll";
    public static final String FIND_PK = "T910indicadores.findByT906TipoAtoPK";
    @EmbeddedId
    protected T910indicadoresPK t910indicadoresPK;
    @Size(max = 1)
    @Column(name = "ind_2_2")
    private boolean ind2_2;
    @Size(max = 1)
    @Column(name = "ind_2_3")
    private boolean ind2_3;
    @Size(max = 1)
    @Column(name = "ind_2_4")
    private boolean ind2_4;
    @Size(max = 1)
    @Column(name = "ind_2_5")
    private boolean ind2_5;
    @Size(max = 1)
    @Column(name = "ind_2_6")
    private boolean ind2_6;
    @Size(max = 1)
    @Column(name = "ind_2_7")
    private boolean ind2_7;
    @Size(max = 1)
    @Column(name = "ind_2_8")
    private boolean ind2_8;
    @Size(max = 1)
    @Column(name = "ind_2_9")
    private boolean ind2_9;
    @Size(max = 1)
    @Column(name = "ind_2_10")
    private boolean ind2_10;
    @Size(max = 1)
    @Column(name = "ind_2_11")
    private boolean ind2_11;
    @Size(max = 1)
    @Column(name = "ind_2_12")
    private boolean ind2_12;
    @Size(max = 1)
    @Column(name = "ind_2_13")
    private boolean ind2_13;
    @Size(max = 1)
    @Column(name = "ind_2_15")
    private boolean ind2_15;
    @Size(max = 1)
    @Column(name = "ind_2_17")
    private boolean ind2_17;
    @Size(max = 1)
    @Column(name = "ind_2_18")
    private boolean ind2_18;
    @Size(max = 1)
    @Column(name = "ind_2_19")
    private boolean ind2_19;
    @Size(max = 1)
    @Column(name = "ind_2_20")
    private boolean ind2_20;
    @Size(max = 1)
    @Column(name = "ind_3_6")
    private boolean ind3_6;
    @Size(max = 1)
    @Column(name = "ind_3_7")
    private boolean ind3_7;
    @Size(max = 1)
    @Column(name = "ind_3_8")
    private boolean ind3_8;

    public T910indicadores() {
    }

    public T910indicadores(T910indicadoresPK t910indicadoresPK) {
        this.t910indicadoresPK = t910indicadoresPK;
    }

    public T910indicadores(T906tipoato t906TipoAtoId, T905modalidade t905ModalidadeId, T907tipocurso t907TipoCursoId) {
        this.t910indicadoresPK = new T910indicadoresPK(t906TipoAtoId, t905ModalidadeId, t907TipoCursoId);
    }

    public T910indicadoresPK getT910indicadoresPK() {
        return t910indicadoresPK;
    }

    public void setT910indicadoresPK(T910indicadoresPK t910indicadoresPK) {
        this.t910indicadoresPK = t910indicadoresPK;
    }

   
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (t910indicadoresPK != null ? t910indicadoresPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof T910indicadores)) {
            return false;
        }
        T910indicadores other = (T910indicadores) object;
        if ((this.t910indicadoresPK == null && other.t910indicadoresPK != null) || (this.t910indicadoresPK != null && !this.t910indicadoresPK.equals(other.t910indicadoresPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.saaes.modelo.T910indicadores[ t910indicadoresPK=" + t910indicadoresPK + " ]";
    }

    public boolean getInd2_2() {
        return ind2_2;
    }

    public void setInd2_2(boolean ind2_2) {
        this.ind2_2 = ind2_2;
    }

    public boolean getInd2_3() {
        return ind2_3;
    }

    public void setInd2_3(boolean ind2_3) {
        this.ind2_3 = ind2_3;
    }

    public boolean getInd2_4() {
        return ind2_4;
    }

    public void setInd2_4(boolean ind2_4) {
        this.ind2_4 = ind2_4;
    }

    public boolean getInd2_5() {
        return ind2_5;
    }

    public void setInd2_5(boolean ind2_5) {
        this.ind2_5 = ind2_5;
    }

    public boolean getInd2_6() {
        return ind2_6;
    }

    public void setInd2_6(boolean ind2_6) {
        this.ind2_6 = ind2_6;
    }

    public boolean getInd2_7() {
        return ind2_7;
    }

    public void setInd2_7(boolean ind2_7) {
        this.ind2_7 = ind2_7;
    }

    public boolean getInd2_8() {
        return ind2_8;
    }

    public void setInd2_8(boolean ind2_8) {
        this.ind2_8 = ind2_8;
    }

    public boolean getInd2_9() {
        return ind2_9;
    }

    public void setInd2_9(boolean ind2_9) {
        this.ind2_9 = ind2_9;
    }

    public boolean getInd2_10() {
        return ind2_10;
    }

    public void setInd2_10(boolean ind2_10) {
        this.ind2_10 = ind2_10;
    }

    public boolean getInd2_11() {
        return ind2_11;
    }

    public void setInd2_11(boolean ind2_11) {
        this.ind2_11 = ind2_11;
    }

    public boolean getInd2_12() {
        return ind2_12;
    }

    public void setInd2_12(boolean ind2_12) {
        this.ind2_12 = ind2_12;
    }

    public boolean getInd2_13() {
        return ind2_13;
    }

    public void setInd2_13(boolean ind2_13) {
        this.ind2_13 = ind2_13;
    }

    public boolean getInd2_15() {
        return ind2_15;
    }

    public void setInd2_15(boolean ind2_15) {
        this.ind2_15 = ind2_15;
    }

    public boolean getInd2_17() {
        return ind2_17;
    }

    public void setInd2_17(boolean ind2_17) {
        this.ind2_17 = ind2_17;
    }

    public boolean getInd2_18() {
        return ind2_18;
    }

    public void setInd2_18(boolean ind2_18) {
        this.ind2_18 = ind2_18;
    }

    public boolean getInd2_19() {
        return ind2_19;
    }

    public void setInd2_19(boolean ind2_19) {
        this.ind2_19 = ind2_19;
    }

    public boolean getInd2_20() {
        return ind2_20;
    }

    public void setInd2_20(boolean ind2_20) {
        this.ind2_20 = ind2_20;
    }

    public boolean getInd3_6() {
        return ind3_6;
    }

    public void setInd3_6(boolean ind3_6) {
        this.ind3_6 = ind3_6;
    }

    public boolean getInd3_7() {
        return ind3_7;
    }

    public void setInd3_7(boolean ind3_7) {
        this.ind3_7 = ind3_7;
    }

    public boolean getInd3_8() {
        return ind3_8;
    }

    public void setInd3_8(boolean ind3_8) {
        this.ind3_8 = ind3_8;
    }

    
}
