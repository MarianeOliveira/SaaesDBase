import br.com.saaes.modelo.T900Usuario;
import br.com.saesdb.util.JPAUtil;
import javax.persistence.EntityManager;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author f4679646
 */
public class SaesDBase {

    private EntityManager em = JPAUtil.getEm();
  
 @Test
  public void cadastraUsuario(){
      
      T900Usuario usuario = new  T900Usuario();
      usuario.setNome("jean");
      usuario.setAtivo(true);
      usuario.setCpfCnpj("111111");
      
      T900Usuario u = em.find(T900Usuario.class,8L);
      
      Assert.assertNotNull(u);
      em.getTransaction().begin();
      em.persist(usuario);
      em.getTransaction().commit();
  }
    
}
