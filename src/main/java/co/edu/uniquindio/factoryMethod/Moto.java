package co.edu.uniquindio.factoryMethod;

public class Moto implements Transporte {
    @Override
    public void mover() {
        System.out.println("La moto se está moviendo 🏍️");
    }
}