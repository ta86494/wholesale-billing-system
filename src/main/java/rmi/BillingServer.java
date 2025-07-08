package rmi;
import java.rmi.Naming;
import java.rmi.server.UnicastRemoteObject;

public class BillingServer extends UnicastRemoteObject implements BillingInterface {
    protected BillingServer() throws java.rmi.RemoteException { super(); }

    public String generateInvoice(String itemDetails) {
        return "RMI Invoice: " + itemDetails + " [Generated]";
    }

    public static void main(String[] args) {
        try {
            BillingServer server = new BillingServer();
            Naming.rebind("rmi://localhost/BillingService", server);
            System.out.println("Billing Server Ready.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
