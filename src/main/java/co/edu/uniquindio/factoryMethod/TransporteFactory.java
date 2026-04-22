package co.edu.uniquindio.factoryMethod;

public class TransporteFactory {

    public static Transporte crearTransporte(String tipo) {
        if (tipo.equalsIgnoreCase("carro")) {
            return new Carro();
        } else if (tipo.equalsIgnoreCase("moto")) {
            return new Moto();
        }
        return null;
    }
}