package br.com.saaes.modelo;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(T900Usuario.class)
public abstract class T900Usuario_ {

	public static volatile CollectionAttribute<T900Usuario, T200ies> t200iesCollection;
	public static volatile SingularAttribute<T900Usuario, String> cpfCnpj;
	public static volatile SingularAttribute<T900Usuario, Date> dtInc;
	public static volatile SingularAttribute<T900Usuario, Date> dtFim;
	public static volatile SingularAttribute<T900Usuario, String> usuario;
	public static volatile SingularAttribute<T900Usuario, String> nomeReduzido;
	public static volatile CollectionAttribute<T900Usuario, T300cursos> t300cursosCollection;
	public static volatile SingularAttribute<T900Usuario, String> senha;
	public static volatile SingularAttribute<T900Usuario, String> cdUsuReg;
	public static volatile SingularAttribute<T900Usuario, Long> id;
	public static volatile CollectionAttribute<T900Usuario, T700avaliacao> t700avaliacaoCollection;
	public static volatile SingularAttribute<T900Usuario, String> email;
	public static volatile SingularAttribute<T900Usuario, Boolean> ativo;
	public static volatile SingularAttribute<T900Usuario, BigDecimal> telefone;
	public static volatile SingularAttribute<T900Usuario, String> nome;

}

