package co.edu.uniquindio.creational.builder;

// Usuario.java
public class Usuario {

    private int     id;
    private String  nombre;
    private String  correo;
    private String  rol;
    private boolean activo;
    private int     edad;
    private String  ciudad;


    private Usuario(Builder builder) {
        this.id     = builder.id;
        this.nombre = builder.nombre;
        this.correo = builder.correo;
        this.rol    = builder.rol;
        this.activo = builder.activo;
        this.edad   = builder.edad;
        this.ciudad = builder.ciudad;
    }

    // Getters
    public int     getId()     { return id; }
    public String  getNombre() { return nombre; }
    public String  getCorreo() { return correo; }
    public String  getRol()    { return rol; }
    public boolean isActivo()  { return activo; }
    public int     getEdad()   { return edad; }
    public String  getCiudad() { return ciudad; }

    @Override
    public String toString() {
        return "Usuario{id=" + id +
                ", nombre='"  + nombre + '\'' +
                ", correo='"  + correo + '\'' +
                ", rol='"     + rol    + '\'' +
                ", activo="   + activo +
                ", edad="     + edad   +
                ", ciudad='"  + ciudad + '\'' + '}';
    }


    public static class Builder {

        private int     id;
        private String  nombre;
        private String  correo  = "";       // valor por defecto
        private String  rol     = "CAJERO"; // valor por defecto
        private boolean activo  = true;     // valor por defecto
        private int     edad    = 0;
        private String  ciudad  = "";

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Builder correo(String correo) {
            this.correo = correo;
            return this;
        }

        public Builder rol(String rol) {
            this.rol = rol;
            return this;
        }

        public Builder activo(boolean activo) {
            this.activo = activo;
            return this;
        }

        public Builder edad(int edad) {
            this.edad = edad;
            return this;
        }

        public Builder ciudad(String ciudad) {
            this.ciudad = ciudad;
            return this;
        }

        public Usuario build() {
            if (nombre == null || nombre.isBlank()) {
                throw new IllegalStateException("El nombre es obligatorio");
            }
            return new Usuario(this);
        }
    }
}
