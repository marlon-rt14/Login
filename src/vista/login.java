
package vista;
import java.util.Scanner;
import modelo.entidades.Usuario;
import modelo.facade;

public class login {
    
    public static void main(String[] args) {
        facade fac = new facade();
        boolean login = false;
        Scanner dato = new Scanner(System.in);
        System.out.print("Ingrese su usuario: ");
        String usuario = dato.next();
        System.out.print("Ingrese su clave: ");
        String clave = dato.next();
        System.out.println("");
        for (Usuario usuario1 : fac.getUsuario()) {
            if (usuario1.getUsuario().equals(usuario) && usuario1.getClave().equals(clave)) {
                System.out.println("\nHaz ingresado con éxito.!!");
                login = true;
            }
        }
        if (!login) {
            System.out.println("\nEl usuario ingresado no existe.!!");
        }
        
    }
    
}
