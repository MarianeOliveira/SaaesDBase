package br.com.saaes.modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(T902Cursos.class)
public abstract class T902Cursos_ {

	public static volatile SingularAttribute<T902Cursos, Integer> numEgressos;
	public static volatile SingularAttribute<T902Cursos, Long> id;
	public static volatile SingularAttribute<T902Cursos, Integer> qntAlunos;
	public static volatile SingularAttribute<T902Cursos, Integer> duracao;
	public static volatile SingularAttribute<T902Cursos, Date> dtInc;
	public static volatile SingularAttribute<T902Cursos, Integer> numDisciplina;
	public static volatile SingularAttribute<T902Cursos, Integer> cargaHoraria;
	public static volatile SingularAttribute<T902Cursos, Boolean> ativo;
	public static volatile SingularAttribute<T902Cursos, String> nomeCurso;
	public static volatile SingularAttribute<T902Cursos, Integer> numVagas;

}

