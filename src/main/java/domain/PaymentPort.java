package domain;

public interface PaymentPort {
    boolean processPayment(double amount);
}
