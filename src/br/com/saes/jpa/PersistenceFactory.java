package br.com.saes.jpa;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Carlos Cariello F1765038
 * @author Jean
 */
public class PersistenceFactory {

    /**
     * Nome da Unidade de Persistência
     */
    public static final String PERSISTENCE_UNIT = "SaesDBasePU";
    public static final String PROPS_PRODUCAO = "producao.properties";
    public static final String PROPS_DESENVOLVIMENTO = "desenvolvimento.properties";
    private static EntityManagerFactory emf;
    private static Hook hook;

    private PersistenceFactory() {
    }

    public static EntityManagerFactory getEntityManagerFactory(Boolean emProducao) throws FileNotFoundException {
        if (emf == null || !emf.isOpen()) {
            hook = new PersistenceFactory.Hook();
            Runtime.getRuntime().addShutdownHook(hook);
            Map<String, String> dbProps = new HashMap<>();

            InputStream is = PersistenceFactory.class.getClassLoader().getResourceAsStream("META-INF/" + (emProducao ? PROPS_PRODUCAO : PROPS_DESENVOLVIMENTO) );
            Properties props = new Properties();
            try {
                props.load(is);
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            for (Enumeration<?> elms = props.propertyNames(); elms.hasMoreElements();) {
                String chave = (String) elms.nextElement();
                dbProps.put(chave, props.getProperty(chave));
            }

            emf = Persistence.createEntityManagerFactory(PersistenceFactory.PERSISTENCE_UNIT, dbProps);
        }
        return emf;
    }

    public static void closeEMF() {
        if (emf != null && emf.isOpen()) {
            emf.close();
        }
    }

    private static class Hook extends Thread {

        @Override
        public void run() {
            PersistenceFactory.closeEMF();
        }
    }
}
