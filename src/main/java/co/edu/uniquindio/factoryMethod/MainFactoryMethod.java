package co.edu.uniquindio.factoryMethod;

public class MainFactoryMethod {
    public static void main(String[] args) {

        Transporte t1 = TransporteFactory.crearTransporte("carro");
        Transporte t2 = TransporteFactory.crearTransporte("moto");

        t1.mover();
        t2.mover();
    }
}