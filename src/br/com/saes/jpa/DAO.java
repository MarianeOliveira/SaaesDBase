package br.com.saes.jpa;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Order;

/**
 *
 * @author Joelson
 * @author Cariello F1765038
 * @since 2014-07-14
 */
public class DAO implements Serializable{
    private static final long serialVersionUID = 1L;

    /*#########  INICIO - VINCULADOS A TRANSAÇÃO ##############*/
    
    /**
     * Persiste Objeto
     * @param <T>
     * @param t
     * @param em
     * @param transacional
     * @return Objeto atualizado
     * @throws NullPointerException 
     */
    public static <T> T persist( T t, EntityManager em, Boolean transacional) throws NullPointerException{
        if (t != null) {
            try {
                if (!transacional) {
                    em.getTransaction().begin();
                }
                em.persist(t);
                if (!transacional) {
                    if (em.getTransaction().isActive()) {
                        em.getTransaction().commit();
                    }
                }
            } catch (Exception e) {
                if (em.getTransaction().isActive()) {
                    em.getTransaction().rollback();
                }
                throw e;
            }
            return t;
        } else {
            if (transacional) {
                if (em.getTransaction().isActive()) {
                    em.getTransaction().rollback();
                }
            }
            throw new NullPointerException("Entidade é nula");
        }
    }
    
    /**
     * Persiste Lista de Entidades
     * @param <T>
     * @param entidades
     * @param em
     * @param transacional
     * @return
     * @throws NullPointerException 
     */
    public static <T> List<?> persist(List<?> entidades, EntityManager em, Boolean transacional) throws NullPointerException{

        if (entidades != null && entidades.size() > 0) {
            try {
                if (!transacional) {
                    em.getTransaction().begin();
                }
                for (Object o : entidades) {
                    em.persist(o);
                }
                if (!transacional) {
                    if (em.getTransaction().isActive()) {
                        em.getTransaction().commit();
                    }
                }
            } catch (Exception e) {
                if (em.getTransaction().isActive()) {
                    em.getTransaction().rollback();
                }
                throw e;
            }
            return entidades;
        }
        return null;
    }

    /**
     * Salva as alterações da entidade para o banco de dados Se o registro ainda não existe, cria um novo
     * @param <T>
     * @param entidade
     * @param primaryKey
     * @param em
     * @param transacional
     * @return
     * @throws Exception 
     */
    public static <T> T save(T entidade, Object primaryKey, EntityManager em, Boolean transacional) throws Exception {
        if (entidade != null ) {
            if (!transacional) {
                em.getTransaction().begin();
            }
            if (primaryKey == null) {
                persist(entidade, em, Boolean.TRUE);
                if (!transacional) {
                    if (em.getTransaction().isActive()) {
                        em.getTransaction().commit();
                    }
                }
            } else {
                try {
                    Object temp = em.find(entidade.getClass(), primaryKey);
                    if (temp == null) {
                        em.persist(entidade);
                    } else {
                        entidade = em.merge(entidade);
                    }
                    if (!transacional) {
                        if (em.getTransaction().isActive()) {
                            em.getTransaction().commit();
                        }
                    }
                } catch (Exception e) {
                    if (em.getTransaction().isActive() && !transacional) {
                        em.getTransaction().rollback();
                    }
                    throw e;
                }
            }
            return  entidade;
        } else {
            if (transacional) {
                if (em.getTransaction().isActive() && !transacional) {
                    em.getTransaction().rollback();
                }
            }
            return null;
        }
        
    }
    
    public static void update(List<?> entidadeList, EntityManager em, Boolean transacional) throws Exception {
        
            try {
                    if (!transacional) {
                        em.getTransaction().begin();
                    }
                    for ( Object o : entidadeList ){
                        em.merge(o);
                    }
                    if (!transacional) {
                        if (em.getTransaction().isActive()) {
                            em.getTransaction().commit();
                        }
                    }
                    
            } catch (Exception e) {
                    if (em.getTransaction().isActive() && !transacional) {
                        em.getTransaction().rollback();
                    }
                    throw e;
            }
        
    }

    /**
     * 
     * @param t 
     */
    public static void remove(Object t, EntityManager em, Boolean transacional) throws NullPointerException{
        if (t != null ) {
            try {
                if (!transacional) {
                    em.getTransaction().begin();
                }
                em.remove( t );

                if (!transacional) {
                    if (em.getTransaction().isActive()) {
                        em.getTransaction().commit();
                    }
                }
            } catch (Exception e) {
                if (em.getTransaction().isActive() && !transacional) {
                    em.getTransaction().rollback();
                }
                throw e;
            }
        } else {
            if (transacional) {
                if (em.getTransaction().isActive() && !transacional) {
                    em.getTransaction().rollback();
                }
            }
            throw new NullPointerException();
        }
        
    }
    

    //mesmo que a função acima, exceto que apaga uma lista de elementos de mesma entidade de uma única vez (único commit)
    /**
     * Remove do BD todos os elementos da lista
     * @param cdEntidades 
     * @param em 
     * @param transacional 
     */
    public static void remove(List<?> cdEntidades, EntityManager em, Boolean transacional) {
         if (cdEntidades != null ) {
            try {
                if (!transacional) {
                    em.getTransaction().begin();
                }
                for (Object o : cdEntidades) {
                    em.remove(o);
                }

                if (!transacional) {
                    if (em.getTransaction().isActive()) {
                        em.getTransaction().commit();
                    }
                }
            } catch (Exception e) {
                if (em.getTransaction().isActive() && !transacional) {
                    em.getTransaction().rollback();
                }
                throw e;
            }
        } else {
            if (transacional) {
                if (em.getTransaction().isActive() && !transacional) {
                    em.getTransaction().rollback();
                }
            }
            throw new NullPointerException();
        }
        
    }

    
    /**
     * 
     * @param nativeQuery
     * @param em
     * @param transacional
     * @param args
     * @return 
     */
    public static boolean executeNamedQuery(String nativeQuery, EntityManager em, Boolean transacional, Object... args) {
        try {
            if ( !transacional )
                em.getTransaction().begin();
            Query q = em.createNativeQuery(nativeQuery);
            for (int i = 0; i < args.length; i++) {
                q.setParameter(i + 1, args[i]);
            }
            q.executeUpdate();
            if ( !transacional )
                em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
            return false;
        } 
        return true;
    }

    
    /**
     * 
     * @param nativeQuery
     * @param em
     * @param transacional
     * @param args
     * @return 
     */
    public static boolean executeNativeQuery(String nativeQuery, EntityManager em, Boolean transacional, Object... args) {
        try {
            if ( !transacional )
                em.getTransaction().begin();
            Query q = em.createNativeQuery(nativeQuery);
            for (int i = 0; i < args.length; i++) {
                q.setParameter(i + 1, args[i]);
            }
            q.executeUpdate();
            if ( !transacional )
                em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
            return false;
        } 
        return true;
    }
    
    /*#########  FIM - VINCULADOS A TRANSAÇÃO ##############*/
    
    
    /*######### INICIO -  NAO VINCULADOS A TRANSAÇÃO ##############*/
    
   
    /**
     * 
     * @param <T>
     * @param clazz
     * @param em
     * @return 
     */
    @SuppressWarnings("unchecked")
    public static <T> List<T> findAll(Class<?> clazz, EntityManager em) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<?> cq = cb.createQuery();
        cq.from(clazz);
        Query query = em.createQuery(cq);
        List<T> retorno = query.getResultList();
        return retorno;
    }
    

    /**
     * Retornar valores a partir de uma NamedQuery
     *
     * @param <T>
     * @param namedQuery
     * @param resultClass
     * @param em
     * @param parametros Podem estar em qualquer ordem.
     * @return Lista de Objetos
     */
//    @SuppressWarnings({"unchecked"})
    @SuppressWarnings("unchecked")
    public static <T> List<T> getFromNamedQuery(String namedQuery, Class<T> resultClass, EntityManager em, Object... parametros) {
        List<T> resultado = null;
        try {
            Query q = em.createNamedQuery(namedQuery, resultClass);
            for (int i = 0; i < parametros.length; i++) {
                Object object = parametros[i];
                q.setParameter(i + 1, object);
            }
            return q.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return resultado;
    } // OK

    @SuppressWarnings({"unchecked"})
    public static <T> T getSingleResultFromFromNamedQuery(String namedQuery, Class<T> resultClass, EntityManager em, Object... parametros) {
        try {
            Query q = em.createNamedQuery(namedQuery, resultClass);
            for (int i = 0; i < parametros.length; i++) {
                Object object = parametros[i];
                q.setParameter(i + 1, object);
            }
            return (T) q.getSingleResult();
        } catch (Exception e) {
            //e.printStackTrace();
        } 
        return null;
    }
    
    /**
     * 
     * @param <T>
     * @param Query
     * @param resultClass
     * @param em
     * @return 
     */
    @SuppressWarnings("unchecked")
    public static <T> List<T> getFromQueryNativa(String Query, Class<T> resultClass, EntityManager em) {
        List<T> resultado = null;
        try {
            Query q = em.createNativeQuery(Query, resultClass);
            resultado = q.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return resultado;
    } // OK

    /*######### FIM  NAO VINCULADOS A TRANSAÇÃO ##############*/
 
    
    
    /*#########  AUXILIAR ##############*/

    /**
     * Adiciona o orderBy no final da query a ser utilizada com ordenacoes.
     * @param ordenacoes
     * @return 
     */
    public static String addOrderByHql(Order... ordenacoes) {
        String result = "";
        if (ordenacoes.length > 0) {
            StringBuilder builder = new StringBuilder(" order by ");
            for (int i = 0; i < ordenacoes.length - 1; i++) {
                builder.append(ordenacoes[i].toString());
                builder.append(", ");
            }
            builder.append(ordenacoes[ordenacoes.length - 1]);
            result = builder.toString();
        }

        return result;
    }

    
}
