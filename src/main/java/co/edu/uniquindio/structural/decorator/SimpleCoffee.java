package co.edu.uniquindio.structural.decorator;

// Componente base
class SimpleCoffee implements Coffee {
    public double cost() {
        return 5.0;
    }

    public String description() {
        return "Café simple";
    }
}