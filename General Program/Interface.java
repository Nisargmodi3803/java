class CellPhone
{
    void incoming_call(String num)
    {
        System.out.println("Incoming Call : "+num);
    }

    void outgoing_call()
    {
        System.out.println("Outgoing Call");
    }
}

interface Bluetooth
{
    void Connect(String device);
    void Disconnect(String device);
}

interface Internet
{
    void ON();
    void OFF();
}


class SmartPhone extends CellPhone implements Bluetooth,Internet 
{
    public void Connect(String device)
    {
        System.out.println(device+" is connected via Bluetooth...");
    }

    public void Disconnect(String device)
    {
        System.out.println(device+" is Disconnected via Bluetooth");
    }

    public void ON()
    {
        System.out.println("Internet is ON");
    }

    public void OFF()
    {
        System.out.println("Internet is OFF");
    }
}

class Interface
{
    public static void main(String args[])
    {
        //This will Run Properly...
        CellPhone P1 = new CellPhone();
        P1.incoming_call("9979873783");
        P1.outgoing_call();

        System.out.println();
        //This will Run Properly...
        SmartPhone S1 = new SmartPhone();
        S1.incoming_call("9429284751");
        S1.outgoing_call();
        S1.ON();
        S1.OFF();
        S1.Connect("Airdopes");
        S1.Disconnect("Airdopes");


        System.out.println();
        //First two calling statement will run properly...
        CellPhone P2 = new SmartPhone();
        P2.incoming_call("9712971148");
        P2.outgoing_call();

        //Below statement will through error because we create object of smartphone by taking reference of cellphone class...
        // P2.ON();
        // P2.OFF();
        // P2.Connect("SmartWatch");
        // P2.Disconnect("SmartWatch");
        
    }
}