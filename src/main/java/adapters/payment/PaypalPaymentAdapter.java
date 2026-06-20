package adapters.payment;

import domain.PaymentPort;

public class PaypalPaymentAdapter implements PaymentPort {

    @Override
    public boolean processPayment(double amount) {

        System.out.println(
                "PayPal processing payment of ₹" + amount);

        return true;
    }
}