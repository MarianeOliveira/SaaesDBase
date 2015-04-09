package br.com.saaes.modelo;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(T201coordenador.class)
public abstract class T201coordenador_ {

	public static volatile SingularAttribute<T201coordenador, T201coordenadorPK> t201coordenadorPK;
	public static volatile SingularAttribute<T201coordenador, Integer> ensDist;
	public static volatile SingularAttribute<T201coordenador, Date> dtCadastro;
	public static volatile SingularAttribute<T201coordenador, Integer> regimeTrab;
	public static volatile SingularAttribute<T201coordenador, BigInteger> cargaHoraria;
	public static volatile SingularAttribute<T201coordenador, Integer> ensSuper;
	public static volatile SingularAttribute<T201coordenador, Integer> usuarioCadastro;
	public static volatile SingularAttribute<T201coordenador, String> nome;
	public static volatile SingularAttribute<T201coordenador, Integer> ensTec;
	public static volatile SingularAttribute<T201coordenador, String> atuacaoCoord;
	public static volatile SingularAttribute<T201coordenador, Integer> gestAcademica;
	public static volatile SingularAttribute<T201coordenador, Integer> titulacao;

}

