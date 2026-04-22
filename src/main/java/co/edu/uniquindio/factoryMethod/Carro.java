package co.edu.uniquindio.factoryMethod;

public class Carro implements Transporte {
    @Override
    public void mover() {
        System.out.println("El carro se está moviendo 🚗");
    }
}