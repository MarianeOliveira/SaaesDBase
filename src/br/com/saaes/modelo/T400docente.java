package br.com.saaes.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;
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
import javax.persistence.OrderBy;
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
    @NamedQuery(name = T400docente.FIND_ALL, query = "SELECT t FROM T400docente t"),
@NamedQuery(name = T400docente.FIND_IES, query = "SELECT t FROM T400docente t where t.t200IesId = ?1")})
public class T400docente implements Serializable {
    private static final long serialVersionUID = 1L;
    public static final String FIND_ALL = "T400docente.findAll";
    public static final String FIND_IES = "T400docente.findIes";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Size(max = 100)
    @Column(name = "nome")
    private String nome;
    @Column(name = "dt_cadastro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCadastro;
    @JoinColumn(name = "t900_usuario_id", referencedColumnName = "id")
    @ManyToOne
    private T900Usuario t900UsuarioId;
    @JoinColumn(name = "t200_ies_id", referencedColumnName = "id")
    @ManyToOne
    private T200ies t200IesId;

    @JoinColumn(name = "t902_titulacao_maxima_id", referencedColumnName = "id")
    @ManyToOne
    private T902titulacao t902TitulacaoMaximaId;
    @JoinColumn(name = "t903_regime_trab_id", referencedColumnName = "id")
    @ManyToOne
    private T903regimetrabalho t903RegimeTrabId;
    @JoinColumn(name = "t904_vinculo_empregaticio_id", referencedColumnName = "id")
    @ManyToOne
    private T904vinculoempregaticio t904VinculoEmpregaticioId;
    @Column(name = "dt_admissao")
    @Temporal(TemporalType.DATE)
    private Date dtAdmissao;
    @Column(name = "supervisao_ass_medica")
    private boolean supervisaoAssMedica;
    @Column(name = "servico_clinico")
    private boolean servicoClinico;
    @Column(name = "tempo_magist_exp_educacao")
    private Integer tempoMagistExpEducacao;
    @Column(name = "tempo_fora_magist")
    private Integer tempoForaMagist;
    @Column(name = "carga_horaria_semanal")
    private Integer cargaHorariaSemanal;
    @Column(name = "carga_horaria_em_aula")
    private Integer cargaHorariaEmAula;
    @Column(name = "carga_horaria_ativ_complementar")
    private Integer cargaHorariaAtivComplementar;
    @Column(name = "carga_horaria_outros_cursos")
    private Integer cargaHorariaOutrosCursos;
    @Column(name = "qnt_alunos")
    private Integer qntAlunos;
    @Column(name = "qnt_discliplinas")
    private Integer qntDisciplinas;
    @Column(name = "qnt_media_disciplinas_dois_anos")
    private Integer qntMediaDisciplinasDoisAnos;
    @Column(name = "formacao_capacit_exper_pedagogica")
    private String formacaoCapacitExperPedagogica;
    @Column(name = "artigos_publicados_area")
    private Integer artigosPublicadosArea;
    @Column(name = "artigos_publicados_outras_areas")
    private Integer artigosPublicadosoOutrasAreas;
    @Column(name = "livros_publicados_area")
    private Integer livrosPublicadosArea;
    @Column(name = "livros_publicados_outras_areas")
    private Integer livrosPublicadosoOutrasAreas;
    @Column(name = "trabalhos_publicados_anais_completo")
    private Integer trabalhosPublicadosAnaisCompleto;
    @Column(name = "trabalhos_publicados_anais_resumo")
    private Integer trabalhosPublicadosoAnaisResumo;
    @Column(name = "traduc_cap_art_publicados")
    private Integer traducCapArtPublicados;
    @Column(name = "propriedade_intelectual_depositada")
    private Integer propriedadeIntelectualDepositada;
    @Column(name = "propriedade_intelectual_registrada")
    private Integer propriedadeIntelectualRegistrada;
    @Column(name = "proj_produc_tec_artisitica_cultural")
    private Integer projProducTecArtisticaCultural;
    @Column(name = "prod_didatico_pedagogica")
    private Integer prodDidaticoPedagogica;
    @Column(name = "pertence_nde")
    private String pertenceNde;
    
    @JoinColumn(name = "t400_docente_id", referencedColumnName = "ID")
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<T400t300docentes> t400t300docentesList;

    
    @Transient            
    private Long tempoVinculo;

    public T400docente() {
    }

    public Long getTempoVinculo() {
        return tempoVinculo;
    }

    public void setTempoVinculo(Long tempoVinculo) {
        this.tempoVinculo = tempoVinculo;
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

    public Date getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(Date dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    public T900Usuario getT900UsuarioId() {
        return t900UsuarioId;
    }

    public void setT900UsuarioId(T900Usuario t900UsuarioId) {
        this.t900UsuarioId = t900UsuarioId;
    }
    public T902titulacao getT902TitulacaoMaximaId() {
        return t902TitulacaoMaximaId;
    }

    public void setT902TitulacaoMaximaId(T902titulacao t902TitulacaoMaximaId) {
        this.t902TitulacaoMaximaId = t902TitulacaoMaximaId;
    }

    public T903regimetrabalho getT903RegimeTrabId() {
        return t903RegimeTrabId;
    }

    public void setT903RegimeTrabId(T903regimetrabalho t903RegimeTrabId) {
        this.t903RegimeTrabId = t903RegimeTrabId;
    }

    public T904vinculoempregaticio getT904VinculoEmpregaticioId() {
        return t904VinculoEmpregaticioId;
    }

    public void setT904VinculoEmpregaticioId(T904vinculoempregaticio t904VinculoEmpregaticioId) {
        this.t904VinculoEmpregaticioId = t904VinculoEmpregaticioId;
    }

    public Date getDtAdmissao() {
        return dtAdmissao;
    }

    public void setDtAdmissao(Date dtAdmissao) {
        this.dtAdmissao = dtAdmissao;
    }

    public Integer getTempoMagistExpEducacao() {
        return tempoMagistExpEducacao;
    }

    public void setTempoMagistExpEducacao(Integer tempoMagistExpEducacao) {
        this.tempoMagistExpEducacao = tempoMagistExpEducacao;
    }

    public Integer getTempoForaMagist() {
        return tempoForaMagist;
    }

    public void setTempoForaMagist(Integer tempoForaMagist) {
        this.tempoForaMagist = tempoForaMagist;
    }

    public Integer getCargaHorariaSemanal() {
        return cargaHorariaSemanal;
    }

    public void setCargaHorariaSemanal(Integer cargaHorariaSemanal) {
        this.cargaHorariaSemanal = cargaHorariaSemanal;
    }

    public Integer getCargaHorariaEmAula() {
        return cargaHorariaEmAula;
    }

    public void setCargaHorariaEmAula(Integer cargaHorariaEmAula) {
        this.cargaHorariaEmAula = cargaHorariaEmAula;
    }

    public Integer getCargaHorariaOutrosCursos() {
        return cargaHorariaOutrosCursos;
    }

    public void setCargaHorariaOutrosCursos(Integer cargaHorariaOutrosCursos) {
        this.cargaHorariaOutrosCursos = cargaHorariaOutrosCursos;
    }

    public Integer getQntAlunos() {
        return qntAlunos;
    }

    public void setQntAlunos(Integer qntAlunos) {
        this.qntAlunos = qntAlunos;
    }

    public Integer getQntDisciplinas() {
        return qntDisciplinas;
    }

    public void setQntDisciplinas(Integer qntDisciplinas) {
        this.qntDisciplinas = qntDisciplinas;
    }

    public Integer getQntMediaDisciplinasDoisAnos() {
        return qntMediaDisciplinasDoisAnos;
    }

    public void setQntMediaDisciplinasDoisAnos(Integer qntMediaDisciplinasDoisAnos) {
        this.qntMediaDisciplinasDoisAnos = qntMediaDisciplinasDoisAnos;
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

    public Integer getCargaHorariaAtivComplementar() {
        return cargaHorariaAtivComplementar;
    }

    public void setCargaHorariaAtivComplementar(Integer cargaHorariaAtivComplementar) {
        this.cargaHorariaAtivComplementar = cargaHorariaAtivComplementar;
    }

    public T200ies getT200IesId() {
        return t200IesId;
    }

    public void setT200IesId(T200ies t200IesId) {
        this.t200IesId = t200IesId;
    }

    public String getFormacaoCapacitExperPedagogica() {
        return formacaoCapacitExperPedagogica;
    }

    public void setFormacaoCapacitExperPedagogica(String formacaoCapacitExperPedagogica) {
        this.formacaoCapacitExperPedagogica = formacaoCapacitExperPedagogica;
    }

    public Integer getArtigosPublicadosArea() {
        return artigosPublicadosArea;
    }

    public void setArtigosPublicadosArea(Integer artigosPublicadosArea) {
        this.artigosPublicadosArea = artigosPublicadosArea;
    }

    public Integer getArtigosPublicadosoOutrasAreas() {
        return artigosPublicadosoOutrasAreas;
    }

    public void setArtigosPublicadosoOutrasAreas(Integer artigosPublicadosoOutrasAreas) {
        this.artigosPublicadosoOutrasAreas = artigosPublicadosoOutrasAreas;
    }

    public Integer getLivrosPublicadosArea() {
        return livrosPublicadosArea;
    }

    public void setLivrosPublicadosArea(Integer livrosPublicadosArea) {
        this.livrosPublicadosArea = livrosPublicadosArea;
    }

    public Integer getLivrosPublicadosoOutrasAreas() {
        return livrosPublicadosoOutrasAreas;
    }

    public void setLivrosPublicadosoOutrasAreas(Integer livrosPublicadosoOutrasAreas) {
        this.livrosPublicadosoOutrasAreas = livrosPublicadosoOutrasAreas;
    }

    public Integer getTrabalhosPublicadosAnaisCompleto() {
        return trabalhosPublicadosAnaisCompleto;
    }

    public void setTrabalhosPublicadosAnaisCompleto(Integer trabalhosPublicadosAnaisCompleto) {
        this.trabalhosPublicadosAnaisCompleto = trabalhosPublicadosAnaisCompleto;
    }

    public Integer getTrabalhosPublicadosoAnaisResumo() {
        return trabalhosPublicadosoAnaisResumo;
    }

    public void setTrabalhosPublicadosoAnaisResumo(Integer trabalhosPublicadosoAnaisResumo) {
        this.trabalhosPublicadosoAnaisResumo = trabalhosPublicadosoAnaisResumo;
    }

    public Integer getTraducCapArtPublicados() {
        return traducCapArtPublicados;
    }

    public void setTraducCapArtPublicados(Integer traducCapArtPublicados) {
        this.traducCapArtPublicados = traducCapArtPublicados;
    }

    public Integer getPropriedadeIntelectualDepositada() {
        return propriedadeIntelectualDepositada;
    }

    public void setPropriedadeIntelectualDepositada(Integer propriedadeIntelectualDepositada) {
        this.propriedadeIntelectualDepositada = propriedadeIntelectualDepositada;
    }

    public Integer getPropriedadeIntelectualRegistrada() {
        return propriedadeIntelectualRegistrada;
    }

    public void setPropriedadeIntelectualRegistrada(Integer propriedadeIntelectualRegistrada) {
        this.propriedadeIntelectualRegistrada = propriedadeIntelectualRegistrada;
    }

    public Integer getProjProducTecArtisticaCultural() {
        return projProducTecArtisticaCultural;
    }

    public void setProjProducTecArtisticaCultural(Integer projProducTecArtisticaCultural) {
        this.projProducTecArtisticaCultural = projProducTecArtisticaCultural;
    }

    public Integer getProdDidaticoPedagogica() {
        return prodDidaticoPedagogica;
    }

    public void setProdDidaticoPedagogica(Integer prodDidaticoPedagogica) {
        this.prodDidaticoPedagogica = prodDidaticoPedagogica;
    }

    public String getPertenceNde() {
        return pertenceNde;
    }

    public void setPertenceNde(String pertenceNde) {
        this.pertenceNde = pertenceNde;
    }

    public List<T400t300docentes> getT400t300docentesList() {
        return t400t300docentesList;
    }

    public void setT400t300docentesList(List<T400t300docentes> t400t300docentesList) {
        this.t400t300docentesList = t400t300docentesList;
    }

    public boolean getSupervisaoAssMedica() {
        return supervisaoAssMedica;
    }

    public void setSupervisaoAssMedica(boolean supervisaoAssMedica) {
        this.supervisaoAssMedica = supervisaoAssMedica;
    }

    public boolean getServicoClinico() {
        return servicoClinico;
    }

    public void setServicoClinico(boolean servicoClinico) {
        this.servicoClinico = servicoClinico;
    }
}
