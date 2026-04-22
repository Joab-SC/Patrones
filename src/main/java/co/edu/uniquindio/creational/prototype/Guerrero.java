package co.edu.uniquindio.creational.prototype;

public class Guerrero implements Personaje {

    private String nombre;
    private int fuerza;

    public Guerrero(String nombre, int fuerza) {
        this.nombre = nombre;
        this.fuerza = fuerza;
    }

    // constructor de copia (opcional pero útil)
    public Guerrero(Guerrero otro) {
        this.nombre = otro.nombre;
        this.fuerza = otro.fuerza;
    }

    @Override
    public Personaje clonar() {
        return new Guerrero(this);// clon
    }

    @Override
    public void mostrar() {
        System.out.println("Guerrero: " + nombre + " | fuerza: " + fuerza);
    }
}