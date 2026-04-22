package co.edu.uniquindio.creational.prototype;

public interface Personaje extends Cloneable {
    Personaje clonar();
    void mostrar();
}