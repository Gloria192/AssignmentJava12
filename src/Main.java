

        // Main.java
        public class Main {
            public static void main(String[] args) {
                PaymentProcessor processor = new PaymentProcessor();

                // CreditCard test
                CreditCard creditCard = new CreditCard();
                processor.processPayment(creditCard); // Output: Processing Credit Card Payment

                // PayPal test
                PayPal payPal = new PayPal();
                processor.processPayment(payPal); // Output: Processing PayPal Payment

                // Bitcoin test (basic)
                Bitcoin bitcoin = new Bitcoin(); // Or: new Bitcoin("TXN12345"); for bonus
                processor.processPayment(bitcoin); // Output: Processing Bitcoin Payment

                // BONUS: ApplePay test
                ApplePay applePay = new ApplePay();
                processor.processPayment(applePay); // Output: Processing Apple Pay Payment
            }
        }

    