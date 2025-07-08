package rmi;
import java.rmi.Naming;

public class BillingClient {
    public static void main(String[] args) {
        try {
            BillingInterface billing = (BillingInterface) Naming.lookup("rmi://localhost/BillingService");
            String invoice = billing.generateInvoice("RMI ItemA - Qty: 10");
            System.out.println("Received Invoice: " + invoice);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}