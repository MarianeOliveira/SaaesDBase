package br.com.saaes.modelo;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(T500coordenador.class)
public abstract class T500coordenador_ {

	public static volatile SingularAttribute<T500coordenador, Integer> ensDist;
	public static volatile SingularAttribute<T500coordenador, Date> dtCadastro;
	public static volatile SingularAttribute<T500coordenador, T300cursos> t300cursos;
	public static volatile SingularAttribute<T500coordenador, Integer> ensSuper;
	public static volatile SingularAttribute<T500coordenador, String> atuacaoCoord;
	public static volatile SingularAttribute<T500coordenador, Integer> ensTec;
	public static volatile SingularAttribute<T500coordenador, Integer> titulacao;
	public static volatile SingularAttribute<T500coordenador, T900Usuario> t900Usuario;
	public static volatile SingularAttribute<T500coordenador, Integer> regimeTrab;
	public static volatile SingularAttribute<T500coordenador, BigInteger> cargaHoraria;
	public static volatile SingularAttribute<T500coordenador, String> nome;
	public static volatile SingularAttribute<T500coordenador, T500coordenadorPK> t500coordenadorPK;
	public static volatile SingularAttribute<T500coordenador, Integer> gestAcademica;

}

