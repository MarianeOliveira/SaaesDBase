package br.com.saaes.modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(T400docente.class)
public abstract class T400docente_ {

	public static volatile SingularAttribute<T400docente, Integer> qntAlunos;
	public static volatile SingularAttribute<T400docente, Integer> qntMediaDisciplinasDoisAnos;
	public static volatile SingularAttribute<T400docente, String> formacaoCapacitExperPedagogica;
	public static volatile SingularAttribute<T400docente, T900Usuario> t900UsuarioId;
	public static volatile SingularAttribute<T400docente, String> pertenceNde;
	public static volatile SingularAttribute<T400docente, Integer> prodDidaticoPedagogica;
	public static volatile SingularAttribute<T400docente, Boolean> supervisaoAssMedica;
	public static volatile SingularAttribute<T400docente, Long> id;
	public static volatile SingularAttribute<T400docente, Integer> cargaHorariaOutrosCursos;
	public static volatile SingularAttribute<T400docente, Integer> tempoForaMagist;
	public static volatile SingularAttribute<T400docente, Integer> traducCapArtPublicados;
	public static volatile SingularAttribute<T400docente, Integer> qntDisciplinas;
	public static volatile SingularAttribute<T400docente, Integer> cargaHorariaSemanal;
	public static volatile SingularAttribute<T400docente, Integer> cargaHorariaEmAula;
	public static volatile SingularAttribute<T400docente, Integer> projProducTecArtisticaCultural;
	public static volatile SingularAttribute<T400docente, Integer> trabalhosPublicadosoAnaisResumo;
	public static volatile SingularAttribute<T400docente, T903regimetrabalho> t903RegimeTrabId;
	public static volatile SingularAttribute<T400docente, Boolean> servicoClinico;
	public static volatile SingularAttribute<T400docente, Date> dtAdmissao;
	public static volatile SingularAttribute<T400docente, T200ies> t200IesId;
	public static volatile SingularAttribute<T400docente, T902titulacao> t902TitulacaoMaximaId;
	public static volatile SingularAttribute<T400docente, Integer> propriedadeIntelectualRegistrada;
	public static volatile SingularAttribute<T400docente, Date> dtCadastro;
	public static volatile SingularAttribute<T400docente, T904vinculoempregaticio> t904VinculoEmpregaticioId;
	public static volatile SingularAttribute<T400docente, Integer> livrosPublicadosoOutrasAreas;
	public static volatile ListAttribute<T400docente, T400t300docentes> t400t300docentesList;
	public static volatile SingularAttribute<T400docente, Integer> cargaHorariaAtivComplementar;
	public static volatile SingularAttribute<T400docente, Integer> livrosPublicadosArea;
	public static volatile SingularAttribute<T400docente, Integer> trabalhosPublicadosAnaisCompleto;
	public static volatile SingularAttribute<T400docente, Integer> tempoMagistExpEducacao;
	public static volatile SingularAttribute<T400docente, String> nome;
	public static volatile SingularAttribute<T400docente, Integer> artigosPublicadosoOutrasAreas;
	public static volatile SingularAttribute<T400docente, Integer> propriedadeIntelectualDepositada;
	public static volatile SingularAttribute<T400docente, Integer> artigosPublicadosArea;

}

