import billingModule.*;
import org.omg.CORBA.*;
import org.omg.CosNaming.*;

public class BillingClient {
    public static void main(String[] args) {
        try {
            ORB orb = ORB.init(args, null);
            NamingContextExt ncRef = NamingContextExtHelper.narrow(orb.resolve_initial_references("NameService"));

            Billing billing = BillingHelper.narrow(ncRef.resolve_str("BillingService"));

            String invoice = billing.generateInvoice("CORBA ItemB - Qty: 5");
            System.out.println("Received: " + invoice);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}