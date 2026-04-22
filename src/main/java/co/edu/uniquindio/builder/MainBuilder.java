package co.edu.uniquindio.builder;


public class MainBuilder {

    public static void main(String[] args) {

        // Construir un usuario completo
        Usuario laura = new Usuario.Builder()
                .id(1)
                .nombre("Laura Gómez")
                .correo("laura@mail.com")
                .rol("VENDEDOR")
                .activo(true)
                .edad(25)
                .ciudad("Armenia")
                .build();

        System.out.println(laura);

        // Construir solo con lo esencial
        Usuario invitado = new Usuario.Builder()
                .id(2)
                .nombre("Invitado")
                .rol("CAJERO")
                .build();

        System.out.println(invitado);
    }
}