package oopconcepts;

interface Payment {
    void makePayment();
}

class CreditCardPayment implements Payment {
    public void makePayment() {
        System.out.println("Payment done via Credit Card");
    }
}

class UPIPayment implements Payment {
    public void makePayment() {
        System.out.println("Payment done via UPI");
    }
}

public class PaymentInterface {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        Payment p2 = new UPIPayment();

        p1.makePayment();
        p2.makePayment();
    }
}