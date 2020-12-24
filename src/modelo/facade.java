
package modelo;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.entidades.Usuario;
import modelo.dao.UsuarioJpaController;

public class facade {
    
    public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("loginPruebaPU");
    public static UsuarioJpaController daoUsuario = new UsuarioJpaController(emf);
    
    //SELECT
    public static List<Usuario> getUsuario(){
        return daoUsuario.findUsuarioEntities();
    }
    
}
