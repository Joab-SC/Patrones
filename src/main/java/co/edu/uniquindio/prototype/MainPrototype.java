package co.edu.uniquindio.prototype;

public class MainPrototype {
    public static void main(String[] args) {

        // objeto original
        Guerrero original = new Guerrero("Thor", 90);

        // clonamos
        Guerrero copia1 = (Guerrero) original.clonar();
        Guerrero copia2 = (Guerrero) original.clonar();

        // mostramos
        original.mostrar();
        copia1.mostrar();
        copia2.mostrar();
    }
}