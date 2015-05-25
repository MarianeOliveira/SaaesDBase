package br.com.saaes.modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(T300cursos.class)
public abstract class T300cursos_ {

	public static volatile SingularAttribute<T300cursos, Integer> numEgressos;
	public static volatile SingularAttribute<T300cursos, T200ies> t200IesId;
	public static volatile SingularAttribute<T300cursos, Integer> cargaHorariaLibras;
	public static volatile SingularAttribute<T300cursos, Integer> numAlunosMatriculados;
	public static volatile SingularAttribute<T300cursos, T907tipocurso> t907TipoCursoId;
	public static volatile SingularAttribute<T300cursos, Date> dtCadastro;
	public static volatile SingularAttribute<T300cursos, Integer> cargaHorariaTcc;
	public static volatile SingularAttribute<T300cursos, T900Usuario> t900UsuarioId;
	public static volatile SingularAttribute<T300cursos, String> turno;
	public static volatile SingularAttribute<T300cursos, Integer> numAtualMatriculadosPeriodo;
	public static volatile SingularAttribute<T300cursos, Integer> numVagas;
	public static volatile SingularAttribute<T300cursos, Long> duracaoCurso;
	public static volatile SingularAttribute<T300cursos, Long> id;
	public static volatile SingularAttribute<T300cursos, Integer> numTotalDisciplinas;
	public static volatile SingularAttribute<T300cursos, T905modalidade> t905ModalidadeId;
	public static volatile SingularAttribute<T300cursos, Integer> cargaHorariaMinima;
	public static volatile ListAttribute<T300cursos, T400t300docentes> t400t300docentesList;
	public static volatile SingularAttribute<T300cursos, T906tipoato> t906TipoAtoId;
	public static volatile SingularAttribute<T300cursos, Integer> cargaHoraria;
	public static volatile SingularAttribute<T300cursos, T500coordenador> t500coordenador;
	public static volatile SingularAttribute<T300cursos, Integer> cargaHorariaEstagio;
	public static volatile SingularAttribute<T300cursos, Boolean> ativo;
	public static volatile SingularAttribute<T300cursos, Integer> numVagasAnuais;
	public static volatile SingularAttribute<T300cursos, String> nome;

}

