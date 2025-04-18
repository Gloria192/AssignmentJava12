public class PaymentProcessor {


        public void processPayment(Bitcoin bitcoin) {
            // BASIC version
            System.out.println("Processing Bitcoin Payment");

            // BONUS version with transaction ID
            // Uncomment this if you're doing the bonus
            // System.out.println("Processing Bitcoin Payment with Transaction ID: " + bitcoin.getTransactionId());
        }

        // BONUS: Add another payment method (e.g., ApplePay)
        public void processPayment(ApplePay applePay) {
            System.out.println("Processing Apple Pay Payment");
        }

        public void processPayment(CreditCard creditCard) {
            System.out.println("Processing Credit Card payment successfully!");
        }

        public void processPayment(PayPal payPal) {
            System.out.println("Processing PayPal payment successfully!");
        }
    }


