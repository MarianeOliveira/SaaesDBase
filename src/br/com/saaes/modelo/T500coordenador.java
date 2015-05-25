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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tefi
 */
@Entity
@Table(name = "t500coordenador")
@XmlRootElement
@NamedQueries({
    
@NamedQuery(name = T500coordenador.FIND_ALL, query = "SELECT t FROM T500coordenador t")})
public class T500coordenador implements Serializable {
    private static final long serialVersionUID = 1L;
    public static final String FIND_ALL = "T500coordenador.findAll";
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "carga_horaria")
    private Integer cargaHoraria;
    @Column(name = "dt_cadastro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCadastro;
    @Column(name = "ens_dist")
    private String ensDist;
    @Column(name = "ens_super")
    private String ensSuper;
    @Column(name = "ens_tec")
    private String ensTec;
    @Column(name = "gest_academica")
    private Integer gestAcademica;
    @JoinColumn(name = "t400_docente_id", referencedColumnName = "id")
    @OneToOne
    private T400docente t400DocenteId;
    @JoinColumn(name = "t901_conceito_id", referencedColumnName = "id")
    @OneToOne
    private T901conceitos t901Atuacao;
    @JoinColumn(name = "t300_curso_id", referencedColumnName = "id")
    @OneToOne
    private T300cursos t300CursoId;
    @JoinColumn(name = "t902_titulacao_id", referencedColumnName = "id")
    @ManyToOne
    private T902titulacao t902TitulacaoId;
    @JoinColumn(name = "t903_regime_trab_id", referencedColumnName = "id")
    @ManyToOne
    private T903regimetrabalho t903RegimeTrabId;
    @JoinColumn(name = "t900_usuario_id", referencedColumnName = "id")
    @ManyToOne
    private T900Usuario t900UsuarioId;

    public T500coordenador() {
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Date getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(Date dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    public String getEnsDist() {
        return ensDist;
    }

    public void setEnsDist(String ensDist) {
        this.ensDist = ensDist;
    }

    public String getEnsSuper() {
        return ensSuper;
    }

    public void setEnsSuper(String ensSuper) {
        this.ensSuper = ensSuper;
    }

    public String getEnsTec() {
        return ensTec;
    }

    public void setEnsTec(String ensTec) {
        this.ensTec = ensTec;
    }

    public Integer getGestAcademica() {
        return gestAcademica;
    }

    public void setGestAcademica(Integer gestAcademica) {
        this.gestAcademica = gestAcademica;
    }

    public T902titulacao getT902TitulacaoId() {
        return t902TitulacaoId;
    }

    public void setT902TitulacaoId(T902titulacao t902TitulacaoId) {
        this.t902TitulacaoId = t902TitulacaoId;
    }

    public T903regimetrabalho getT903RegimeTrabId() {
        return t903RegimeTrabId;
    }

    public void setT903RegimeTrabId(T903regimetrabalho t903RegimeTrabId) {
        this.t903RegimeTrabId = t903RegimeTrabId;
    }

    public T900Usuario getT900UsuarioId() {
        return t900UsuarioId;
    }

    public void setT900UsuarioId(T900Usuario t900UsuarioId) {
        this.t900UsuarioId = t900UsuarioId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.id);
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
        final T500coordenador other = (T500coordenador) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "T500coordenador{" + "id=" + id + '}';
    }

    public T400docente getT400DocenteId() {
        return t400DocenteId;
    }

    public void setT400DocenteId(T400docente t400DocenteId) {
        this.t400DocenteId = t400DocenteId;
    }

    public T300cursos getT300CursoId() {
        return t300CursoId;
    }

    public void setT300CursoId(T300cursos t300CursoId) {
        this.t300CursoId = t300CursoId;
    }

    public T901conceitos getT901Atuacao() {
        return t901Atuacao;
    }

    public void setT901Atuacao(T901conceitos t901Atuacao) {
        this.t901Atuacao = t901Atuacao;
    }



    
}
