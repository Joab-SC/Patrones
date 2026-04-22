package co.edu.uniquindio.structural.decorator;

class CoffeeWithMilk extends CoffeeDecorator {

    public CoffeeWithMilk(Coffee coffee) {
        super(coffee);
    }

    public double cost() {
        return coffee.cost() + 1.5;
    }

    public String description() {
        return coffee.description() + " con leche";
    }
}