package rmi;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface BillingInterface extends Remote {
    String generateInvoice(String itemDetails) throws RemoteException;
}
