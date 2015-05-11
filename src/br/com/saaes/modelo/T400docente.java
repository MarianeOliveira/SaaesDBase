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
    private String artigosPublicadosArea;
    @Column(name = "artigos_publicados_outras_areas")
    private String artigosPublicadosoOutrasAreas;
    @Column(name = "livros_publicados_area")
    private String livrosPublicadosArea;
    @Column(name = "livros_publicados_outras_areas")
    private String livrosPublicadosoOutrasAreas;
    @Column(name = "trabalhos_publicados_anais_completo")
    private String trabalhosPublicadosAnaisCompleto;
    @Column(name = "trabalhos_publicados_anais_resumo")
    private String trabalhosPublicadosoAnaisResumo;
    @Column(name = "traduc_cap_art_publicados")
    private String traducCapArtPublicados;
    @Column(name = "propriedade_intelectual_depositada")
    private String propriedadeIntelectualDepositada;
    @Column(name = "propriedade_intelectual_registrada")
    private String propriedadeIntelectualRegistrada;
    @Column(name = "proj_produc_tec_artisitica_cultural")
    private String projProducTecArtisticaCultural;
    @Column(name = "prod_didatico_pedagogica")
    private String prodDidaticoPedagogica;
    
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

    public String getArtigosPublicadosArea() {
        return artigosPublicadosArea;
    }

    public void setArtigosPublicadosArea(String artigosPublicadosArea) {
        this.artigosPublicadosArea = artigosPublicadosArea;
    }

    public String getArtigosPublicadosoOutrasAreas() {
        return artigosPublicadosoOutrasAreas;
    }

    public void setArtigosPublicadosoOutrasAreas(String artigosPublicadosoOutrasAreas) {
        this.artigosPublicadosoOutrasAreas = artigosPublicadosoOutrasAreas;
    }

    public String getLivrosPublicadosArea() {
        return livrosPublicadosArea;
    }

    public void setLivrosPublicadosArea(String livrosPublicadosArea) {
        this.livrosPublicadosArea = livrosPublicadosArea;
    }

    public String getLivrosPublicadosoOutrasAreas() {
        return livrosPublicadosoOutrasAreas;
    }

    public void setLivrosPublicadosoOutrasAreas(String livrosPublicadosoOutrasAreas) {
        this.livrosPublicadosoOutrasAreas = livrosPublicadosoOutrasAreas;
    }

    public String getTrabalhosPublicadosAnaisCompleto() {
        return trabalhosPublicadosAnaisCompleto;
    }

    public void setTrabalhosPublicadosAnaisCompleto(String trabalhosPublicadosAnaisCompleto) {
        this.trabalhosPublicadosAnaisCompleto = trabalhosPublicadosAnaisCompleto;
    }

    public String getTrabalhosPublicadosoAnaisResumo() {
        return trabalhosPublicadosoAnaisResumo;
    }

    public void setTrabalhosPublicadosoAnaisResumo(String trabalhosPublicadosoAnaisResumo) {
        this.trabalhosPublicadosoAnaisResumo = trabalhosPublicadosoAnaisResumo;
    }

    public String getTraducCapArtPublicados() {
        return traducCapArtPublicados;
    }

    public void setTraducCapArtPublicados(String traducCapArtPublicados) {
        this.traducCapArtPublicados = traducCapArtPublicados;
    }

    public String getPropriedadeIntelectualDepositada() {
        return propriedadeIntelectualDepositada;
    }

    public void setPropriedadeIntelectualDepositada(String propriedadeIntelectualDepositada) {
        this.propriedadeIntelectualDepositada = propriedadeIntelectualDepositada;
    }

    public String getPropriedadeIntelectualRegistrada() {
        return propriedadeIntelectualRegistrada;
    }

    public void setPropriedadeIntelectualRegistrada(String propriedadeIntelectualRegistrada) {
        this.propriedadeIntelectualRegistrada = propriedadeIntelectualRegistrada;
    }

    public String getProjProducTecArtisticaCultural() {
        return projProducTecArtisticaCultural;
    }

    public void setProjProducTecArtisticaCultural(String projProducTecArtisticaCultural) {
        this.projProducTecArtisticaCultural = projProducTecArtisticaCultural;
    }

    public String getProdDidaticoPedagogica() {
        return prodDidaticoPedagogica;
    }

    public void setProdDidaticoPedagogica(String prodDidaticoPedagogica) {
        this.prodDidaticoPedagogica = prodDidaticoPedagogica;
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

    public String getFormacaoCapacitExperPedagogica() {
        return formacaoCapacitExperPedagogica;
    }

    public void setFormacaoCapacitExperPedagogica(String formacaoCapacitExperPedagogica) {
        this.formacaoCapacitExperPedagogica = formacaoCapacitExperPedagogica;
    }

    public T200ies getT200IesId() {
        return t200IesId;
    }

    public void setT200IesId(T200ies t200IesId) {
        this.t200IesId = t200IesId;
    }
}
