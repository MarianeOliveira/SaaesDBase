package br.com.saaes.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

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
    private boolean ativo = true;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "carga_horaria")
    private Integer cargaHoraria;
    @Column(name = "dt_cadastro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCadastro;
    @Size(max = 200)
    @Column(name = "nome")
    private String nome;
    @Size(max = 8)
    @Column(name = "turno")
    private String turno;
    @Column(name = "num_alunos_matriculados")
    private Integer numAlunosMatriculados;
    @Column(name = "num_atual_matriculados_periodo")
    private Integer numAtualMatriculadosPeriodo;
    @Column(name = "num_total_disciplinas")
    private Integer numTotalDisciplinas;
    @Column(name = "num_egressos")
    private Integer numEgressos;
    @Column(name = "num_vagas")
    private Integer numVagas;
    @Column(name = "num_vagas_anuais")
    private Integer numVagasAnuais;
    @Column(name = "carga_horaria_minima")
    private Integer cargaHorariaMinima;
    @Column(name = "carga_horaria_estagio")
    private Integer cargaHorariaEstagio;
    @Column(name = "carga_horaria_tcc")
    private Integer cargaHorariaTcc;
    @Column(name = "carga_horaria_libras")
    private Integer cargaHorariaLibras;
    @Column(name = "duracao_curso")
    private Long duracaoCurso;
    @JoinColumn(name = "t907_tipo_curso_id", referencedColumnName = "id")
    @ManyToOne
    private T907tipocurso t907TipoCursoId;
    @JoinColumn(name = "t906_tipo_ato_id", referencedColumnName = "id")
    @ManyToOne
    private T906tipoato t906TipoAtoId;
    @JoinColumn(name = "t905_modalidade_id", referencedColumnName = "id")
    @ManyToOne
    private T905modalidade t905ModalidadeId;
    @JoinColumn(name = "t200_ies_id", referencedColumnName = "id")
    @ManyToOne
    private T200ies t200IesId;
    @JoinColumn(name = "t900_usuario_id", referencedColumnName = "id")
    @ManyToOne
    private T900Usuario t900UsuarioId;
    
    @JoinColumn(name = "t300_curso_id", referencedColumnName = "ID")
    @OneToOne(fetch = FetchType.EAGER, mappedBy = "t300CursoId")
    private T500coordenador t500coordenador;
    
    @JoinColumn(name = "t300_curso_id", referencedColumnName = "ID")
    @OneToOne(fetch = FetchType.EAGER, mappedBy = "t300CursoId")
    private T600bibliografia t600bibliografica;
    
    @JoinColumn(name = "t300_curso_id", referencedColumnName = "ID")
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<T400t300docentes> t400t300docentesList;

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

    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
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
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumAlunosMatriculados() {
        return numAlunosMatriculados;
    }

    public void setNumAlunosMatriculados(Integer numAlunosMatriculados) {
        this.numAlunosMatriculados = numAlunosMatriculados;
    }

    public Integer getNumTotalDisciplinas() {
        return numTotalDisciplinas;
    }

    public void setNumTotalDisciplinas(Integer numTotalDisciplinas) {
        this.numTotalDisciplinas = numTotalDisciplinas;
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

    public Integer getNumAtualMatriculadosPeriodo() {
        return numAtualMatriculadosPeriodo;
    }

    public void setNumAtualMatriculadosPeriodo(Integer numAtualMatriculadosPeriodo) {
        this.numAtualMatriculadosPeriodo = numAtualMatriculadosPeriodo;
    }

    public Integer getNumVagasAnuais() {
        return numVagasAnuais;
    }

    public void setNumVagasAnuais(Integer numVagasAnuais) {
        this.numVagasAnuais = numVagasAnuais;
    }

    public Integer getCargaHorariaMinima() {
        return cargaHorariaMinima;
    }

    public void setCargaHorariaMinima(Integer cargaHorariaMinima) {
        this.cargaHorariaMinima = cargaHorariaMinima;
    }

    public Integer getCargaHorariaEstagio() {
        return cargaHorariaEstagio;
    }

    public void setCargaHorariaEstagio(Integer cargaHorariaEstagio) {
        this.cargaHorariaEstagio = cargaHorariaEstagio;
    }

    public Integer getCargaHorariaTcc() {
        return cargaHorariaTcc;
    }

    public void setCargaHorariaTcc(Integer cargaHorariaTcc) {
        this.cargaHorariaTcc = cargaHorariaTcc;
    }

    public Integer getCargaHorariaLibras() {
        return cargaHorariaLibras;
    }

    public void setCargaHorariaLibras(Integer cargaHorariaLibras) {
        this.cargaHorariaLibras = cargaHorariaLibras;
    }

    public Long getDuracaoCurso() {
        return duracaoCurso;
    }

    public void setDuracaoCurso(Long duracaoCurso) {
        this.duracaoCurso = duracaoCurso;
    }

    public List<T400t300docentes> getT400t300docentesList() {
        return t400t300docentesList;
    }

    public void setT400t300docentesList(List<T400t300docentes> t400t300docentesList) {
        this.t400t300docentesList = t400t300docentesList;
    }

    public T500coordenador getT500coordenador() {
        return t500coordenador;
    }

    public void setT500coordenador(T500coordenador t500coordenador) {
        this.t500coordenador = t500coordenador;
    }

    public T600bibliografia getT600bibliografica() {
        return t600bibliografica;
    }

    public void setT600bibliografica(T600bibliografia t600bibliografica) {
        this.t600bibliografica = t600bibliografica;
    }

    
}
