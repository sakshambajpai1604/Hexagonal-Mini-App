package adapters.payment;

import domain.PaymentPort;

public class StripePaymentAdapter implements PaymentPort {

    @Override
    public boolean processPayment(double amount) {

        System.out.println(
                "Stripe processing payment of ₹" + amount);

        return true;
    }
}