package billingModule;


/**
* billingModule/BillingHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from billing.idl
* Monday, 7 July, 2025 12:52:33 PM IST
*/

abstract public class BillingHelper
{
  private static String  _id = "IDL:billingModule/Billing:1.0";

  public static void insert (org.omg.CORBA.Any a, billingModule.Billing that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static billingModule.Billing extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (billingModule.BillingHelper.id (), "Billing");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static billingModule.Billing read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_BillingStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, billingModule.Billing value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static billingModule.Billing narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof billingModule.Billing)
      return (billingModule.Billing)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      billingModule._BillingStub stub = new billingModule._BillingStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static billingModule.Billing unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof billingModule.Billing)
      return (billingModule.Billing)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      billingModule._BillingStub stub = new billingModule._BillingStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
