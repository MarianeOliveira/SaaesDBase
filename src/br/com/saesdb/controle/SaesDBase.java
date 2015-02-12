
package br.com.saesdb.controle;

import br.com.saesdb.util.JPAUtil;
import br.com.saesdb.util.Usuario;
import javax.persistence.EntityManager;

/**
 *
 * @author f4679646
 */
public class SaesDBase {

  
    public static void main(String[] args) {
       EntityManager em = JPAUtil.getEm();
        Usuario usuario = new Usuario();
        usuario.setLogin(" jean ");
        em.getTransaction().begin();
        em.persist(usuario);
        Usuario find = em.find(Usuario.class, 1L);
        em.getTransaction().commit();
    }
    
}
