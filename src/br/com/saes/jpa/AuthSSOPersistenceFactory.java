package br.com.saes.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Carlos Cariello F1765038
 */
public class AuthSSOPersistenceFactory {
    private static EntityManagerFactory emf;
    private static Hook hook;
    
    private EntityManager em;
    
    private AuthSSOPersistenceFactory() {
    }
    public static AuthSSOPersistenceFactory getInstance(){
        return new AuthSSOPersistenceFactory();
    }
    
    public static EntityManagerFactory getEMF (){
        if (emf == null || !emf.isOpen()){
            emf = Persistence.createEntityManagerFactory("AuthSSOPU", new java.util.HashMap<>() );
            hook = new Hook();
            Runtime.getRuntime().addShutdownHook(hook);
        }
       return emf;
    }

    public EntityManager getEm() {
        if ( em == null || !em.isOpen() ){
            em = AuthSSOPersistenceFactory.getEMF().createEntityManager();
        }
        return em;
    }
    
    public void closeEm(){
        if ( em != null && em.isOpen() ){
            em.close();
        }
    }
    
    public static void closeEMF(){
        if ( emf != null && emf.isOpen() ){
            emf.close();
        }
    }

    
    private static class Hook extends Thread{
        @Override
        public void run(){
            AuthSSOPersistenceFactory.closeEMF();
        }
    }

    
}
