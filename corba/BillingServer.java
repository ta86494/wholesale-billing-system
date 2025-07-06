import billingModule.*;
import org.omg.CORBA.*;
import org.omg.PortableServer.*;

public class BillingServer extends BillingPOA {
    public String generateInvoice(String itemDetails) {
        return "CORBA Invoice: " + itemDetails + " [Generated]";
    }

    public static void main(String[] args) {
        try {
            ORB orb = ORB.init(args, null);
            POA rootPOA = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
            rootPOA.the_POAManager().activate();

            BillingServer server = new BillingServer();
            org.omg.CORBA.Object ref = rootPOA.servant_to_reference(server);

            Billing href = BillingHelper.narrow(ref);
            NamingContextExt ncRef = NamingContextExtHelper.narrow(orb.resolve_initial_references("NameService"));
            ncRef.rebind(ncRef.to_name("BillingService"), href);

            System.out.println("CORBA Billing Server ready.");
            orb.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}