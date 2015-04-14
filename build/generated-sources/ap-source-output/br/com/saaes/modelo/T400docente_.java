package br.com.saaes.modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(T400docente.class)
public abstract class T400docente_ {

	public static volatile SingularAttribute<T400docente, Integer> prodCienCultArtTec;
	public static volatile SingularAttribute<T400docente, Integer> relacDocenteEstudante;
	public static volatile SingularAttribute<T400docente, T400docentePK> t400docentePK;
	public static volatile SingularAttribute<T400docente, Integer> regimeTrabDocente;
	public static volatile SingularAttribute<T400docente, Date> dtCadastro;
	public static volatile SingularAttribute<T400docente, T300cursos> t300cursos;
	public static volatile SingularAttribute<T400docente, Integer> responsDocenteAssistMed;
	public static volatile SingularAttribute<T400docente, Integer> expProfCorpDocente;
	public static volatile SingularAttribute<T400docente, Integer> exprCoordCurDist;
	public static volatile SingularAttribute<T400docente, Integer> percDoutores;
	public static volatile SingularAttribute<T400docente, Integer> vinculoTrabalho;
	public static volatile SingularAttribute<T400docente, Integer> expCorpoTutoresEducDist;
	public static volatile SingularAttribute<T400docente, Integer> expMagistSuperCorpDocente;
	public static volatile SingularAttribute<T400docente, T900Usuario> t900Usuario;
	public static volatile SingularAttribute<T400docente, Integer> nucleoApoioExpDocente;
	public static volatile SingularAttribute<T400docente, Integer> expExercDocenciaEduc;
	public static volatile SingularAttribute<T400docente, Integer> regimeTrabCoord;
	public static volatile SingularAttribute<T400docente, Integer> cargaHoraria;
	public static volatile SingularAttribute<T400docente, Integer> relacDocenteTutorEducDist;
	public static volatile SingularAttribute<T400docente, String> nome;
	public static volatile SingularAttribute<T400docente, Integer> exprProfMagistCoord;
	public static volatile SingularAttribute<T400docente, Integer> titCorpoDocente;
	public static volatile SingularAttribute<T400docente, Date> dtAdmissao;

}

