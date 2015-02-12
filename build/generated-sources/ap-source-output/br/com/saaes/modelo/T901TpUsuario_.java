package br.com.saaes.modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(T901TpUsuario.class)
public abstract class T901TpUsuario_ {

	public static volatile SingularAttribute<T901TpUsuario, Integer> ativo;
	public static volatile SingularAttribute<T901TpUsuario, Long> id;
	public static volatile CollectionAttribute<T901TpUsuario, T900Usuario> t900UsuarioCollection;
	public static volatile SingularAttribute<T901TpUsuario, String> descricao;

}

