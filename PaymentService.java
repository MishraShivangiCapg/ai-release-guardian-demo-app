public class PaymentService {

    public boolean processPayment(double amount) {

        connectToGateway();
        validateTransaction();

        if(amount <= 0){
            return false;
        }

        return true;
    }

    private void connectToGateway() {
        System.out.println("Connecting to payment gateway");
    }

    private void validateTransaction() {
        System.out.println("Validating transaction");
    }
}
