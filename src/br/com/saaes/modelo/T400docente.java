package br.com.saaes.modelo;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author tefi
 */
@Entity
@Table(name = "t400docente")
@NamedQueries({
    @NamedQuery(name = T400docente.FIN_ALL, query = "SELECT t FROM T400docente t")})
public class T400docente implements Serializable {

    private static final long serialVersionUID = 1L;
    public static final String FIN_ALL = "T400docente.findAl";
    @EmbeddedId
    protected T400docentePK t400docentePK;
    @Size(max = 100)
    @Column(name = "nome")
    private String nome = "";
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
    @Column(name = "vinculo_trabalho")
    private Integer vinculoTrabalho;
    @Column(name = "dt_admissao")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtAdmissao;
    
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
    @Column(name = "dt_cadastro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCadastro;
    @JoinColumn(name = "id_t900_usuario", referencedColumnName = "id")
    @ManyToOne
    private T900Usuario t900Usuario;
    @JoinColumn(name = "id_curso", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private T300cursos t300cursos;

    public T400docente() {
    }

    public T400docente(T400docentePK t400docentePK) {
        this.t400docentePK = t400docentePK;
    }

    public T400docente(long id, long idCurso) {
        this.t400docentePK = new T400docentePK(id, idCurso);
    }

    public T400docentePK getT400docentePK() {
        return t400docentePK;
    }

    public void setT400docentePK(T400docentePK t400docentePK) {
        this.t400docentePK = t400docentePK;
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

    public Date getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(Date dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    public T900Usuario getT900Usuario() {
        return t900Usuario;
    }

    public void setT900Usuario(T900Usuario t900Usuario) {
        this.t900Usuario = t900Usuario;
    }

    public T300cursos getT300cursos() {
        return t300cursos;
    }

    public void setT300cursos(T300cursos t300cursos) {
        this.t300cursos = t300cursos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (t400docentePK != null ? t400docentePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof T400docente)) {
            return false;
        }
        T400docente other = (T400docente) object;
        if ((this.t400docentePK == null && other.t400docentePK != null) || (this.t400docentePK != null && !this.t400docentePK.equals(other.t400docentePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.saaes.modelo.T400docente[ t400docentePK=" + t400docentePK + " ]";
    }

    public Integer getVinculoTrabalho() {
        return vinculoTrabalho;
    }

    public void setVinculoTrabalho(Integer vinculoTrabalho) {
        this.vinculoTrabalho = vinculoTrabalho;
    }

    public Date getDtAdmissao() {
        return dtAdmissao;
    }

    public void setDtAdmissao(Date dtAdmissao) {
        this.dtAdmissao = dtAdmissao;
    }
    
}
