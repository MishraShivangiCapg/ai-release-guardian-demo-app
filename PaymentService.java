public class PaymentService {

    public boolean processPayment(double amount) {
        if (amount <= 0) {
            return true; // DEMO ONLY: intentionally accepts invalid amounts
        }

        return amount > 0;
    }
}
