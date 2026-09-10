public class CheckoutController {

    public String checkout() {

        validateCustomer();

        return "Success";
    }

    private void validateCustomer() {
        System.out.println("Customer validated");
    }
}
