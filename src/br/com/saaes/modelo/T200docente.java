/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.saaes.modelo;

import java.io.Serializable;
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
@Table(name = "t200docente")
@NamedQueries({
    @NamedQuery(name = T200docente.FIN_ALL, query = "SELECT t FROM T200docente t")})
public class T200docente implements Serializable {
    private static final long serialVersionUID = 1L;
    public static final String FIN_ALL = "T200docente.findAl";
    @EmbeddedId
    protected T200docentePK t200docentePK;
    @Size(max = 100)
    @Column(name = "nome")
    private String nome;
    @Column(name = "expr_coord_cur_dist")
    private Integer exprCoordCurDist;
    @Column(name = "expr_prof_magist_coord")
    private Integer exprProfMagistCoord;
    @Column(name = "regime_trab_coord")
    private Integer regimeTrabCoord;
    @Column(name = "carga_horaria")
    private Integer cargaHoraria;
    @Column(name = "tit_corpo_docente")
    private Integer titCorpoDocente;
    @Column(name = "perc_doutores")
    private Integer percDoutores;
    @Column(name = "regime_trab_docente")
    private Integer regimeTrabDocente;
    @Column(name = "exp_prof_corp_docente")
    private Integer expProfCorpDocente;
    @Column(name = "exp_exerc_docencia_educ")
    private Integer expExercDocenciaEduc;
    @Column(name = "exp_magist_super_corp_docente")
    private Integer expMagistSuperCorpDocente;
    @Column(name = "relac_docente_estudante")
    private Integer relacDocenteEstudante;
    @Column(name = "prod_cien_cult_art_tec")
    private Integer prodCienCultArtTec;
    @Column(name = "exp_corpo_tutores_educ_dist")
    private Integer expCorpoTutoresEducDist;
    @Column(name = "relac_docente_tutor_educ_dist")
    private Integer relacDocenteTutorEducDist;
    @Column(name = "respons_docente_assist_med")
    private Integer responsDocenteAssistMed;
    @Column(name = "nucleo_apoio_exp_docente")
    private Integer nucleoApoioExpDocente;
    @Column(name = "usuario_cadastro")
    private Integer usuarioCadastro;
    @Column(name = "dt_cadastro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCadastro;

    public T200docente() {
    }

    public T200docente(T200docentePK t200docentePK) {
        this.t200docentePK = t200docentePK;
    }

    public T200docente(long id, long idCurso) {
        this.t200docentePK = new T200docentePK(id, idCurso);
    }

    public T200docentePK getT200docentePK() {
        return t200docentePK;
    }

    public void setT200docentePK(T200docentePK t200docentePK) {
        this.t200docentePK = t200docentePK;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getExprCoordCurDist() {
        return exprCoordCurDist;
    }

    public void setExprCoordCurDist(Integer exprCoordCurDist) {
        this.exprCoordCurDist = exprCoordCurDist;
    }

    public Integer getExprProfMagistCoord() {
        return exprProfMagistCoord;
    }

    public void setExprProfMagistCoord(Integer exprProfMagistCoord) {
        this.exprProfMagistCoord = exprProfMagistCoord;
    }

    public Integer getRegimeTrabCoord() {
        return regimeTrabCoord;
    }

    public void setRegimeTrabCoord(Integer regimeTrabCoord) {
        this.regimeTrabCoord = regimeTrabCoord;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Integer getTitCorpoDocente() {
        return titCorpoDocente;
    }

    public void setTitCorpoDocente(Integer titCorpoDocente) {
        this.titCorpoDocente = titCorpoDocente;
    }

    public Integer getPercDoutores() {
        return percDoutores;
    }

    public void setPercDoutores(Integer percDoutores) {
        this.percDoutores = percDoutores;
    }

    public Integer getRegimeTrabDocente() {
        return regimeTrabDocente;
    }

    public void setRegimeTrabDocente(Integer regimeTrabDocente) {
        this.regimeTrabDocente = regimeTrabDocente;
    }

    public Integer getExpProfCorpDocente() {
        return expProfCorpDocente;
    }

    public void setExpProfCorpDocente(Integer expProfCorpDocente) {
        this.expProfCorpDocente = expProfCorpDocente;
    }

    public Integer getExpExercDocenciaEduc() {
        return expExercDocenciaEduc;
    }

    public void setExpExercDocenciaEduc(Integer expExercDocenciaEduc) {
        this.expExercDocenciaEduc = expExercDocenciaEduc;
    }

    public Integer getExpMagistSuperCorpDocente() {
        return expMagistSuperCorpDocente;
    }

    public void setExpMagistSuperCorpDocente(Integer expMagistSuperCorpDocente) {
        this.expMagistSuperCorpDocente = expMagistSuperCorpDocente;
    }

    public Integer getRelacDocenteEstudante() {
        return relacDocenteEstudante;
    }

    public void setRelacDocenteEstudante(Integer relacDocenteEstudante) {
        this.relacDocenteEstudante = relacDocenteEstudante;
    }

    public Integer getProdCienCultArtTec() {
        return prodCienCultArtTec;
    }

    public void setProdCienCultArtTec(Integer prodCienCultArtTec) {
        this.prodCienCultArtTec = prodCienCultArtTec;
    }

    public Integer getExpCorpoTutoresEducDist() {
        return expCorpoTutoresEducDist;
    }

    public void setExpCorpoTutoresEducDist(Integer expCorpoTutoresEducDist) {
        this.expCorpoTutoresEducDist = expCorpoTutoresEducDist;
    }

    public Integer getRelacDocenteTutorEducDist() {
        return relacDocenteTutorEducDist;
    }

    public void setRelacDocenteTutorEducDist(Integer relacDocenteTutorEducDist) {
        this.relacDocenteTutorEducDist = relacDocenteTutorEducDist;
    }

    public Integer getResponsDocenteAssistMed() {
        return responsDocenteAssistMed;
    }

    public void setResponsDocenteAssistMed(Integer responsDocenteAssistMed) {
        this.responsDocenteAssistMed = responsDocenteAssistMed;
    }

    public Integer getNucleoApoioExpDocente() {
        return nucleoApoioExpDocente;
    }

    public void setNucleoApoioExpDocente(Integer nucleoApoioExpDocente) {
        this.nucleoApoioExpDocente = nucleoApoioExpDocente;
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
        hash += (t200docentePK != null ? t200docentePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof T200docente)) {
            return false;
        }
        T200docente other = (T200docente) object;
        if ((this.t200docentePK == null && other.t200docentePK != null) || (this.t200docentePK != null && !this.t200docentePK.equals(other.t200docentePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.saaes.modelo.T200docente[ t200docentePK=" + t200docentePK + " ]";
    }
    
}
