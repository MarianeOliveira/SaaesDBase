package br.com.saaes.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author tefi
 */
@Entity
@Table(name = "t300cursos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = T300cursos.FIND_ALL, query = "SELECT t FROM T300cursos t"),
    @NamedQuery(name = T300cursos.FIND_USUARIO, query = "SELECT t FROM T300cursos t WHERE t.t900UsuarioId = ?1 "),
    @NamedQuery(name = T300cursos.FIND_IES, query = "SELECT t FROM T300cursos t WHERE t.t200IesId = ?1 ")

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
    @Column(name = "ativo")
    private Short ativo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "carga_horaria")
    private BigDecimal cargaHoraria;
    @Column(name = "dt_cadastro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCadastro;
    @Column(name = "duracao_curso")
    private BigDecimal duracaoCurso;
    @Size(max = 100)
    @Column(name = "nome")
    private String nome;
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
    
    @JoinColumn(name = "t907_tipo_curso_id", referencedColumnName = "id")
    @ManyToOne
    private T907tipocurso t907TipoCursoId;
    @JoinColumn(name = "t906_tipo_ato_id", referencedColumnName = "id")
    @ManyToOne
    private T906tipoato t906TipoAtoId;
    @JoinColumn(name = "t905_modalidade_id", referencedColumnName = "id")
    @ManyToOne
    private T905modalidade t905ModalidadeId;
    @JoinColumn(name = "t900_usuario_id", referencedColumnName = "id")
    @ManyToOne
    private T900Usuario t900UsuarioId;
    @JoinColumn(name = "t200_ies_id", referencedColumnName = "id")
    @ManyToOne
    private T200ies t200IesId;
    

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

    public Short getAtivo() {
        return ativo;
    }

    public void setAtivo(Short ativo) {
        this.ativo = ativo;
    }

    public BigDecimal getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(BigDecimal cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Date getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(Date dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    public BigDecimal getDuracaoCurso() {
        return duracaoCurso;
    }

    public void setDuracaoCurso(BigDecimal duracaoCurso) {
        this.duracaoCurso = duracaoCurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public T907tipocurso getT907TipoCursoId() {
        return t907TipoCursoId;
    }

    public void setT907TipoCursoId(T907tipocurso t907TipoCursoId) {
        this.t907TipoCursoId = t907TipoCursoId;
    }

    public T906tipoato getT906TipoAtoId() {
        return t906TipoAtoId;
    }

    public void setT906TipoAtoId(T906tipoato t906TipoAtoId) {
        this.t906TipoAtoId = t906TipoAtoId;
    }

    public T905modalidade getT905ModalidadeId() {
        return t905ModalidadeId;
    }

    public void setT905ModalidadeId(T905modalidade t905ModalidadeId) {
        this.t905ModalidadeId = t905ModalidadeId;
    }

    public T900Usuario getT900UsuarioId() {
        return t900UsuarioId;
    }

    public void setT900UsuarioId(T900Usuario t900UsuarioId) {
        this.t900UsuarioId = t900UsuarioId;
    }

    public T200ies getT200IesId() {
        return t200IesId;
    }

    public void setT200IesId(T200ies t200IesId) {
        this.t200IesId = t200IesId;
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
        return (this.id != null || other.id == null) && (this.id == null || this.id.equals(other.id));
    }

    @Override
    public String toString() {
        return "br.com.saaes.modelo.T300cursos[ id=" + id + " ]";
    }
    
}
