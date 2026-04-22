package co.edu.uniquindio.structural.adapter;

// Adapter
class PaymentAdapter implements PaymentProcessor {

    private OldPaymentSystem oldSystem;

    public PaymentAdapter(OldPaymentSystem oldSystem) {
        this.oldSystem = oldSystem;
    }

    public void pay(double amount) {
        oldSystem.makePayment(amount);
    }
}