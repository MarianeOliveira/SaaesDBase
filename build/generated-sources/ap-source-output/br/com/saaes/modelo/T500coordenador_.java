package br.com.saaes.modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(T500coordenador.class)
public abstract class T500coordenador_ {

	public static volatile SingularAttribute<T500coordenador, T902titulacao> t902TitulacaoId;
	public static volatile SingularAttribute<T500coordenador, Long> id;
	public static volatile SingularAttribute<T500coordenador, String> ensDist;
	public static volatile SingularAttribute<T500coordenador, Date> dtCadastro;
	public static volatile SingularAttribute<T500coordenador, Integer> cargaHoraria;
	public static volatile SingularAttribute<T500coordenador, String> ensSuper;
	public static volatile SingularAttribute<T500coordenador, T900Usuario> t900UsuarioId;
	public static volatile SingularAttribute<T500coordenador, T300cursos> t300CursoId;
	public static volatile SingularAttribute<T500coordenador, String> ensTec;
	public static volatile SingularAttribute<T500coordenador, T903regimetrabalho> t903RegimeTrabId;
	public static volatile SingularAttribute<T500coordenador, T400docente> t400DocenteId;
	public static volatile SingularAttribute<T500coordenador, Integer> gestAcademica;

}

