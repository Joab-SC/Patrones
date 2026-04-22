package co.edu.uniquindio.creational.singleton;

// Sesion.java
public class Sesion {

    private static Sesion instancia;

    private Usuario usuarioActual;
    private boolean activa = false;

    private Sesion() {}

    public static synchronized Sesion getInstancia() {
        if (instancia == null) {
            instancia = new Sesion();
        }
        return instancia;
    }

    public void iniciar(Usuario usuario) {
        this.usuarioActual = usuario;
        this.activa        = true;
        System.out.println("Sesion iniciada: " + usuario.getNombre());
    }

    public void cerrar() {
        System.out.println("Sesion cerrada: " + usuarioActual.getNombre());
        this.usuarioActual = null;
        this.activa        = false;
    }

    public boolean estaActiva()          { return activa; }
    public Usuario getUsuarioActual()    { return usuarioActual; }

    // Métodos de conveniencia
    public boolean esAdmin()    { return activa && usuarioActual.getRol().equals("ADMIN"); }
    public boolean esVendedor() { return activa && usuarioActual.getRol().equals("VENDEDOR"); }
}