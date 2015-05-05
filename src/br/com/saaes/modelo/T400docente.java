package br.com.saaes.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tefi
 */
@Entity
@Table(name = "t400docente")
@XmlRootElement

@NamedQueries({
    @NamedQuery(name = T400docente.FIND_ALL, query = "SELECT t FROM T400docente t")})
public class T400docente implements Serializable {

    private static final long serialVersionUID = 1L;
    public static final String FIND_ALL = "T400docente.findAl";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Size(max = 100)
    @Column(name = "nome")
    private String nome;
    @Column(name = "carga_horaria")
    private Integer cargaHoraria;
    @Column(name = "dt_admissao")
    @Temporal(TemporalType.DATE)
    private Date dtAdmissao;
    @Column(name = "dt_cadastro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCadastro;
    @Column(name = "exp_corpo_tutores_educ_dist")
    private Integer expCorpoTutoresEducDist;
    @Column(name = "exp_exerc_docencia_educ")
    private Integer expExercDocenciaEduc;
    @Column(name = "exp_magist_super_corp_docente")
    private Integer expMagistSuperCorpDocente;
    @Size(max = 255)
    @Column(name = "exp_prof_corp_docente")
    private String expProfCorpDocente;
    @Column(name = "expr_coord_cur_dist")
    private Integer exprCoordCurDist;
    @Column(name = "expr_prof_magist_coord")
    private Integer exprProfMagistCoord;
    @Column(name = "nucleo_apoio_exp_docente")
    private Integer nucleoApoioExpDocente;
    @Column(name = "perc_doutores")
    private Integer percDoutores;
    @Column(name = "prod_cien_cult_art_tec")
    private Integer prodCienCultArtTec;
    @Column(name = "relac_docente_estudante")
    private Integer relacDocenteEstudante;
    @Column(name = "relac_docente_tutor_educ_dist")
    private Integer relacDocenteTutorEducDist;
    @Column(name = "respons_docente_assist_med")
    private Integer responsDocenteAssistMed;

    @JoinColumn(name = "t300_curso_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private T300cursos t300CursoId;
    @JoinColumn(name = "t902_tit_corpo_docente_id", referencedColumnName = "id")
    @ManyToOne
    private T902titulacao t902TitCorpoDocenteId;
    @JoinColumn(name = "t903_regime_trab_coord_id", referencedColumnName = "id")
    @ManyToOne
    private T903regimetrabalho t903RegimeTrabCoordId;

    @JoinColumn(name = "t900_usuario_id", referencedColumnName = "id")
    @ManyToOne
    private T900Usuario t900UsuarioId;
    @JoinColumn(name = "t904_vinculo_trabalho_id", referencedColumnName = "id")
    @ManyToOne
    private T904vinculoempregaticio t904VinculoTrabalhoId;
    @JoinColumn(name = "t903_regime_trab_docente_id", referencedColumnName = "id")
    @ManyToOne
    private T903regimetrabalho t903RegimeTrabDocenteId;
    
    @Transient            
    private Long tempoVinculo;

    public T400docente() {
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Date getDtAdmissao() {
        return dtAdmissao;
    }

    public void setDtAdmissao(Date dtAdmissao) {
        this.dtAdmissao = dtAdmissao;
    }

    public Date getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(Date dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    public Integer getExpCorpoTutoresEducDist() {
        return expCorpoTutoresEducDist;
    }

    public void setExpCorpoTutoresEducDist(Integer expCorpoTutoresEducDist) {
        this.expCorpoTutoresEducDist = expCorpoTutoresEducDist;
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

    public String getExpProfCorpDocente() {
        return expProfCorpDocente;
    }

    public void setExpProfCorpDocente(String expProfCorpDocente) {
        this.expProfCorpDocente = expProfCorpDocente;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNucleoApoioExpDocente() {
        return nucleoApoioExpDocente;
    }

    public void setNucleoApoioExpDocente(Integer nucleoApoioExpDocente) {
        this.nucleoApoioExpDocente = nucleoApoioExpDocente;
    }

    public Integer getPercDoutores() {
        return percDoutores;
    }

    public void setPercDoutores(Integer percDoutores) {
        this.percDoutores = percDoutores;
    }

    public Integer getProdCienCultArtTec() {
        return prodCienCultArtTec;
    }

    public void setProdCienCultArtTec(Integer prodCienCultArtTec) {
        this.prodCienCultArtTec = prodCienCultArtTec;
    }

    public Integer getRelacDocenteEstudante() {
        return relacDocenteEstudante;
    }

    public void setRelacDocenteEstudante(Integer relacDocenteEstudante) {
        this.relacDocenteEstudante = relacDocenteEstudante;
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

    public T902titulacao getT902TitCorpoDocenteId() {
        return t902TitCorpoDocenteId;
    }

    public void setT902TitCorpoDocenteId(T902titulacao t902TitCorpoDocenteId) {
        this.t902TitCorpoDocenteId = t902TitCorpoDocenteId;
    }

    public T903regimetrabalho getT903RegimeTrabCoordId() {
        return t903RegimeTrabCoordId;
    }

    public void setT903RegimeTrabCoordId(T903regimetrabalho t903RegimeTrabCoordId) {
        this.t903RegimeTrabCoordId = t903RegimeTrabCoordId;
    }

    public T900Usuario getT900UsuarioId() {
        return t900UsuarioId;
    }

    public void setT900UsuarioId(T900Usuario t900UsuarioId) {
        this.t900UsuarioId = t900UsuarioId;
    }

    public T904vinculoempregaticio getT904VinculoTrabalhoId() {
        return t904VinculoTrabalhoId;
    }

    public void setT904VinculoTrabalhoId(T904vinculoempregaticio t904VinculoTrabalhoId) {
        this.t904VinculoTrabalhoId = t904VinculoTrabalhoId;
    }

    public T903regimetrabalho getT903RegimeTrabDocenteId() {
        return t903RegimeTrabDocenteId;
    }

    public void setT903RegimeTrabDocenteId(T903regimetrabalho t903RegimeTrabDocenteId) {
        this.t903RegimeTrabDocenteId = t903RegimeTrabDocenteId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public T300cursos getT300CursoId() {
        return t300CursoId;
    }

    public void setT300CursoId(T300cursos t300CursoId) {
        this.t300CursoId = t300CursoId;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final T400docente other = (T400docente) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "T400docente{" + "id=" + id + '}';
    }

    public Long getTempoVinculo() {
        return tempoVinculo;
    }

    public void setTempoVinculo(Long tempoVinculo) {
        this.tempoVinculo = tempoVinculo;
    }
}
