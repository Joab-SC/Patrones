package co.edu.uniquindio.structural.decorator;

class CoffeeWithSugar extends CoffeeDecorator {

    public CoffeeWithSugar(Coffee coffee) {
        super(coffee);
    }

    public double cost() {
        return coffee.cost() + 0.5;
    }

    public String description() {
        return coffee.description() + " con azúcar";
    }
}
