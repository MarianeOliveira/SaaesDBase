package br.com.saesdb.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class JPAUtil {
    
   /* MeTA-INF/persistence.xml  persistence-unit name="SaesDBasePU" */
   protected final static EntityManagerFactory emf = Persistence.createEntityManagerFactory("SaaesDBasePU");

    public static  final EntityManager getEm() {
        return emf.createEntityManager();
    }
   
   
    
}
