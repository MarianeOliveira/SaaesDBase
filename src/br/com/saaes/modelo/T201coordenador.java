package br.com.saaes.modelo;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author tefi
 */
@Entity
@Table(name = "t201coordenador")
@NamedQueries({
    @NamedQuery(name = T201coordenador.FIN_ALL, query = "SELECT t FROM T201coordenador t")})
public class T201coordenador implements Serializable {
    private static final long serialVersionUID = 1L;
    public static final String FIN_ALL = "T201coordenador.findAll";

    @EmbeddedId
    protected T201coordenadorPK t201coordenadorPK;
    @Size(max = 100)
    @Column(name = "nome")
    private String nome;
    @Size(max = 100)
    @Column(name = "atuacao_coord")
    private String atuacaoCoord;
    @Column(name = "carga_horaria")
    private BigInteger cargaHoraria;
    @Column(name = "ens_dist")
    private Integer ensDist;
    @Column(name = "ens_super")
    private Integer ensSuper;
    @Column(name = "ens_tec")
    private Integer ensTec;
    @Column(name = "gest_academica")
    private Integer gestAcademica;
    @Column(name = "regime_trab")
    private Integer regimeTrab;
    @Column(name = "titulacao")
    private Integer titulacao;
    @Column(name = "usuario_cadastro")
    private Integer usuarioCadastro;
    @Column(name = "dt_cadastro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCadastro;

    public T201coordenador() {
    }

    public T201coordenador(T201coordenadorPK t201coordenadorPK) {
        this.t201coordenadorPK = t201coordenadorPK;
    }

    public T201coordenador(long id, long idCurso) {
        this.t201coordenadorPK = new T201coordenadorPK(id, idCurso);
    }

    public T201coordenadorPK getT201coordenadorPK() {
        return t201coordenadorPK;
    }

    public void setT201coordenadorPK(T201coordenadorPK t201coordenadorPK) {
        this.t201coordenadorPK = t201coordenadorPK;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAtuacaoCoord() {
        return atuacaoCoord;
    }

    public void setAtuacaoCoord(String atuacaoCoord) {
        this.atuacaoCoord = atuacaoCoord;
    }

    public BigInteger getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(BigInteger cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Integer getEnsDist() {
        return ensDist;
    }

    public void setEnsDist(Integer ensDist) {
        this.ensDist = ensDist;
    }

    public Integer getEnsSuper() {
        return ensSuper;
    }

    public void setEnsSuper(Integer ensSuper) {
        this.ensSuper = ensSuper;
    }

    public Integer getEnsTec() {
        return ensTec;
    }

    public void setEnsTec(Integer ensTec) {
        this.ensTec = ensTec;
    }

    public Integer getGestAcademica() {
        return gestAcademica;
    }

    public void setGestAcademica(Integer gestAcademica) {
        this.gestAcademica = gestAcademica;
    }

    public Integer getRegimeTrab() {
        return regimeTrab;
    }

    public void setRegimeTrab(Integer regimeTrab) {
        this.regimeTrab = regimeTrab;
    }

    public Integer getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(Integer titulacao) {
        this.titulacao = titulacao;
    }

    public Integer getUsuarioCadastro() {
        return usuarioCadastro;
    }

    public void setUsuarioCadastro(Integer usuarioCadastro) {
        this.usuarioCadastro = usuarioCadastro;
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
        hash += (t201coordenadorPK != null ? t201coordenadorPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof T201coordenador)) {
            return false;
        }
        T201coordenador other = (T201coordenador) object;
        if ((this.t201coordenadorPK == null && other.t201coordenadorPK != null) || (this.t201coordenadorPK != null && !this.t201coordenadorPK.equals(other.t201coordenadorPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.saaes.modelo.T201coordenador[ t201coordenadorPK=" + t201coordenadorPK + " ]";
    }
    
}
