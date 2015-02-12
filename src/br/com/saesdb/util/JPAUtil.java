

package br.com.saesdb.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class JPAUtil {
    
   
   protected final static EntityManagerFactory emf = Persistence.createEntityManagerFactory("SaesDBasePU");

    public static  final EntityManager getEm() {
        return emf.createEntityManager();
    }
   
   
    
}
