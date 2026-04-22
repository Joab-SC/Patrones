package co.edu.uniquindio.structural.adapter;

public class MainAdapter {
    public static void main(String[] args) {

        OldPaymentSystem oldSystem = new OldPaymentSystem();

        PaymentProcessor processor = new PaymentAdapter(oldSystem);

        processor.pay(100.0);
    }
}