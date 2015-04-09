/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saaes.modelo;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
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
import javax.validation.constraints.Size;

/**
 *
 * @author f4679646
 */
@Entity
@Table(name = "t400cursos")
@NamedQueries({
    @NamedQuery(name = T400cursos.FIND_ALL, query = "SELECT t FROM T400cursos t"),
    @NamedQuery(name = T400cursos.FIND_USUARIO, query = "SELECT t FROM T400cursos t WHERE t.usuarioCadastro = ?1 "),
    @NamedQuery(name = T400cursos.FIND_IES, query = "SELECT t FROM T400cursos t WHERE t.idIes = ?1 ")

})
public class T400cursos implements Serializable {
    private static final long serialVersionUID = 1L;
    public static final String FIND_ALL = "T400cursos.findAll";
    public static final String FIND_USUARIO = "T400cursos.findUsuario";
    public static final String FIND_IES = "T400cursos.findIes";
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Size(max = 100)
    @Column(name = "nome")
    private String nome;
    @Column(name = "carga_horaria")
    private BigInteger cargaHoraria;
    @Column(name = "duracao_curso")
    private BigInteger duracaoCurso;
    @Column(name = "num_alunos")
    private Integer numAlunos;
    @Column(name = "num_disciplinas")
    private Integer numDisciplinas;
    @Column(name = "num_egressos")
    private Integer numEgressos;
    @Column(name = "num_vagas")
    private Integer numVagas;
    @Size(max = 8)
    @Column(name = "turno")
    private String turno;
    @Column(name = "dt_cadastro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCadastro;
    @Column(name = "usuario_cadastro")
    private Integer usuarioCadastro;
    @Column(name = "ativo")
    private Short ativo;
    @JoinColumn(name = "id_ies", referencedColumnName = "id")
    @ManyToOne
    private T300ies idIes;

    public T400cursos() {
    }

    public T400cursos(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigInteger getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(BigInteger cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public BigInteger getDuracaoCurso() {
        return duracaoCurso;
    }

    public void setDuracaoCurso(BigInteger duracaoCurso) {
        this.duracaoCurso = duracaoCurso;
    }

    public Integer getNumAlunos() {
        return numAlunos;
    }

    public void setNumAlunos(Integer numAlunos) {
        this.numAlunos = numAlunos;
    }

    public Integer getNumDisciplinas() {
        return numDisciplinas;
    }

    public void setNumDisciplinas(Integer numDisciplinas) {
        this.numDisciplinas = numDisciplinas;
    }

    public Integer getNumEgressos() {
        return numEgressos;
    }

    public void setNumEgressos(Integer numEgressos) {
        this.numEgressos = numEgressos;
    }

    public Integer getNumVagas() {
        return numVagas;
    }

    public void setNumVagas(Integer numVagas) {
        this.numVagas = numVagas;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Date getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(Date dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    public Integer getUsuarioCadastro() {
        return usuarioCadastro;
    }

    public void setUsuarioCadastro(Integer usuarioCadastro) {
        this.usuarioCadastro = usuarioCadastro;
    }

    public Short getAtivo() {
        return ativo;
    }

    public void setAtivo(Short ativo) {
        this.ativo = ativo;
    }

    public T300ies getIdIes() {
        return idIes;
    }

    public void setIdIes(T300ies idIes) {
        this.idIes = idIes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof T400cursos)) {
            return false;
        }
        T400cursos other = (T400cursos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.saaes.modelo.T400cursos[ id=" + id + " ]";
    }
    
}
