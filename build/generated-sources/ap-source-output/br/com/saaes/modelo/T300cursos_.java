package br.com.saaes.modelo;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(T300cursos.class)
public abstract class T300cursos_ {

	public static volatile SingularAttribute<T300cursos, Integer> numEgressos;
	public static volatile SingularAttribute<T300cursos, T200ies> t200ies;
	public static volatile SingularAttribute<T300cursos, Integer> tipoCurso;
	public static volatile SingularAttribute<T300cursos, Date> dtCadastro;
	public static volatile SingularAttribute<T300cursos, Integer> numDisciplinas;
	public static volatile SingularAttribute<T300cursos, String> turno;
	public static volatile SingularAttribute<T300cursos, Integer> tipoAto;
	public static volatile SingularAttribute<T300cursos, Integer> numAlunos;
	public static volatile SingularAttribute<T300cursos, Integer> numVagas;
	public static volatile SingularAttribute<T300cursos, BigInteger> duracaoCurso;
	public static volatile SingularAttribute<T300cursos, Long> id;
	public static volatile SingularAttribute<T300cursos, T900Usuario> t900Usuario;
	public static volatile SingularAttribute<T300cursos, BigInteger> cargaHoraria;
	public static volatile SingularAttribute<T300cursos, Short> ativo;
	public static volatile SingularAttribute<T300cursos, String> nome;
	public static volatile SingularAttribute<T300cursos, Integer> modalidade;

}

