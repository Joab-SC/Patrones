package co.edu.uniquindio.creational.singleton;

// MainSingleton.java
public class MainSingleton {

    public static void main(String[] args) {

        Usuario usuario = new Usuario("VENDEDOR", "Laura Gómez");
        Sesion.getInstancia().iniciar(usuario);

        System.out.println("Usuario: " + Sesion.getInstancia().getUsuarioActual().getNombre());
        System.out.println("Rol:     " + Sesion.getInstancia().getUsuarioActual().getRol());
        System.out.println("Activa:  " + Sesion.getInstancia().estaActiva());


        Sesion s1 = Sesion.getInstancia();
        Sesion s2 = Sesion.getInstancia();
        System.out.println("Misma instancia: " + (s1 == s2));


        Sesion.getInstancia().cerrar();
        System.out.println("Activa: " + Sesion.getInstancia().estaActiva()); // false
    }
}
