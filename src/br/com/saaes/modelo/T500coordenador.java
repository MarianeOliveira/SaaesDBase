package br.com.saaes.modelo;

import java.io.Serializable;
import java.math.BigInteger;
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

/**
 *
 * @author tefi
 */
@Entity
@Table(name = "t500coordenador")
@NamedQueries({
    
@NamedQuery(name = T500coordenador.FIN_ALL, query = "SELECT t FROM T500coordenador t")})
public class T500coordenador implements Serializable {

    private static final long serialVersionUID = 1L;
    public static final String FIN_ALL = "T500coordenador.findAll";
    @EmbeddedId
    protected T500coordenadorPK t500coordenadorPK;
    @Size(max = 100)
    @Column(name = "nome")
    private String nome = "";
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
    @Column(name = "dt_cadastro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCadastro;
    @JoinColumn(name = "id_curso", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private T300cursos t300cursos;
    @JoinColumn(name = "id_t900_usuario", referencedColumnName = "id")
    @ManyToOne
    private T900Usuario t900Usuario;

    public T500coordenador() {
    }

    public T500coordenador(T500coordenadorPK t500coordenadorPK) {
        this.t500coordenadorPK = t500coordenadorPK;
    }

    public T500coordenador(long id, long idCurso) {
        this.t500coordenadorPK = new T500coordenadorPK(id, idCurso);
    }

    public T500coordenadorPK getT500coordenadorPK() {
        return t500coordenadorPK;
    }

    public void setT500coordenadorPK(T500coordenadorPK t500coordenadorPK) {
        this.t500coordenadorPK = t500coordenadorPK;
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

    public Date getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(Date dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    public T300cursos getT300cursos() {
        return t300cursos;
    }

    public void setT300cursos(T300cursos t300cursos) {
        this.t300cursos = t300cursos;
    }

    public T900Usuario getT900Usuario() {
        return t900Usuario;
    }

    public void setT900Usuario(T900Usuario t900Usuario) {
        this.t900Usuario = t900Usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (t500coordenadorPK != null ? t500coordenadorPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof T500coordenador)) {
            return false;
        }
        T500coordenador other = (T500coordenador) object;
        if ((this.t500coordenadorPK == null && other.t500coordenadorPK != null) || (this.t500coordenadorPK != null && !this.t500coordenadorPK.equals(other.t500coordenadorPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.saaes.modelo.T500coordenador[ t500coordenadorPK=" + t500coordenadorPK + " ]";
    }
    
}
