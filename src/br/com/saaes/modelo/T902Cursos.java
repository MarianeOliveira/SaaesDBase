package br.com.saaes.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tefi
 */
@Entity
@Table(name = "t902_cursos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "T902Cursos.findAll", query = "SELECT t FROM T902Cursos t")})
public class T902Cursos implements Serializable{
private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Basic(optional = false)
@Column(name = "id")
private Long id;

@Basic(optional = false)
@NotNull
@Size(min = 1, max = 255)
@Column(name = "nome_Curso")
private String nomeCurso;
        
@Column(name = "dt_inc")
@Temporal(TemporalType.TIMESTAMP)
private Date dtInc;

@Column(name = "carga_horaria")
private int cargaHoraria;

@Column(name = "duracao")
private int duracao;

@Column(name = "qnt_alunos")
private int qntAlunos;

@Column(name = "num_disciplinas")
private int numDisciplina;


@Column(name = "num_vagas")
private int numVagas;

@Column(name = "num_egressos")
private int numEgressos;

@Column(name = "ativo")
private boolean ativo;


//- id_ies

    public T902Cursos() {
    }
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Date getDtInc() {
        return dtInc;
    }

    public void setDtInc(Date dtInc) {
        this.dtInc = dtInc;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getQntAlunos() {
        return qntAlunos;
    }

    public void setQntAlunos(int qntAlunos) {
        this.qntAlunos = qntAlunos;
    }

    public int getNumDisciplina() {
        return numDisciplina;
    }

    public void setNumDisciplina(int numDisciplina) {
        this.numDisciplina = numDisciplina;
    }

    public int getNumVagas() {
        return numVagas;
    }

    public void setNumVagas(int numVagas) {
        this.numVagas = numVagas;
    }

    public int getNumEgressos() {
        return numEgressos;
    }

    public void setNumEgressos(int numEgressos) {
        this.numEgressos = numEgressos;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
