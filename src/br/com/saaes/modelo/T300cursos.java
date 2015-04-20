package br.com.saaes.modelo;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "t300cursos")
@NamedQueries({
    @NamedQuery(name = T300cursos.FIND_ALL, query = "SELECT t FROM T300cursos t"),
    @NamedQuery(name = T300cursos.FIND_USUARIO, query = "SELECT t FROM T300cursos t WHERE t.t900Usuario = ?1 ")

})
public class T300cursos implements Serializable {
    @OneToMany(mappedBy = "idCurso")
    private static final long serialVersionUID = 1L;
    public static final String FIND_ALL = "T300cursos.findAll";
    public static final String FIND_USUARIO = "T300cursos.findUsuario";
    public static final String FIND_IES = "T300cursos.findIes";
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Size(max = 100)
    @Column(name = "nome")
    private String nome = "";
    @Column(name = "carga_horaria")
    private BigInteger cargaHoraria;
    @Column(name = "duracao_curso")
    private BigInteger duracaoCurso;
    @Column(name = "num_alunos")
    private Integer numAlunos;
    @Column(name = "tipo_ato")
    private Integer tipoAto;
    @Column(name = "modalidade")
    private Integer modalidade;
    @Column(name = "tipo_curso")
    private Integer tipoCurso;
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
    @Column(name = "ativo")
    private Short ativo;
   
    @JoinColumn(name = "id_ies", referencedColumnName = "id")
    @ManyToOne
    private T200ies t200ies;
    @JoinColumn(name = "id_t900_usuario", referencedColumnName = "id")
    @ManyToOne
    private T900Usuario t900Usuario;
    
    public T300cursos() {
    }

    public T300cursos(Long id) {
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

    public Short getAtivo() {
        return ativo;
    }

    public void setAtivo(Short ativo) {
        this.ativo = ativo;
    }
    public T200ies getT200ies() {
        return t200ies;
    }

    public void setT200ies(T200ies t200ies) {
        this.t200ies = t200ies;
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
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof T300cursos)) {
            return false;
        }
        T300cursos other = (T300cursos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.saaes.modelo.T300cursos[ id=" + id + " ]";
    }

    public Integer getTipoAto() {
        return tipoAto;
    }

    public void setTipoAto(Integer tipoAto) {
        this.tipoAto = tipoAto;
    }

    public Integer getModalidade() {
        return modalidade;
    }

    public void setModalidade(Integer modalidade) {
        this.modalidade = modalidade;
    }

    public Integer getTipoCurso() {
        return tipoCurso;
    }

    public void setTipoCurso(Integer tipoCurso) {
        this.tipoCurso = tipoCurso;
    }

    
}
