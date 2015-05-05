package br.com.saaes.modelo;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(T300cursos.class)
public abstract class T300cursos_ {

	public static volatile SingularAttribute<T300cursos, Integer> numEgressos;
	public static volatile SingularAttribute<T300cursos, T200ies> t200IesId;
	public static volatile SingularAttribute<T300cursos, Date> dtCadastro;
	public static volatile SingularAttribute<T300cursos, T907tipocurso> t907TipoCursoId;
	public static volatile SingularAttribute<T300cursos, Integer> numDisciplinas;
	public static volatile SingularAttribute<T300cursos, T900Usuario> t900UsuarioId;
	public static volatile SingularAttribute<T300cursos, String> turno;
	public static volatile SingularAttribute<T300cursos, Integer> numAlunos;
	public static volatile SingularAttribute<T300cursos, Integer> numVagas;
	public static volatile SingularAttribute<T300cursos, BigDecimal> duracaoCurso;
	public static volatile SingularAttribute<T300cursos, Long> id;
	public static volatile SingularAttribute<T300cursos, T905modalidade> t905ModalidadeId;
	public static volatile SingularAttribute<T300cursos, T906tipoato> t906TipoAtoId;
	public static volatile SingularAttribute<T300cursos, BigDecimal> cargaHoraria;
	public static volatile SingularAttribute<T300cursos, Short> ativo;
	public static volatile SingularAttribute<T300cursos, String> nome;

}

