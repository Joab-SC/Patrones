package co.edu.uniquindio.structural.decorator;

public class MainDecorator {
    public static void main(String[] args) {

        Coffee coffee = new SimpleCoffee();

        coffee = new CoffeeWithMilk(coffee);
        coffee = new CoffeeWithSugar(coffee);

        System.out.println(coffee.description() + " -> $" + coffee.cost());
    }
}