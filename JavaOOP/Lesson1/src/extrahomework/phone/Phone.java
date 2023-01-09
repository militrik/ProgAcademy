package extrahomework.phone;

public class Phone {
    private String number;
    private boolean connected;

    public Phone(String number) {
        this.number = number;
    }

    public Phone() {

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void registration() {
        connected = Network.tryToRegister(this.number, this);
    }

    public void outboundCall(String number) {
        if (!connected)
            System.out.println("Beep... (" + this + " not registered)");
        else
            System.out.println(Network.tryToCall(number, this));
    }

    public void inboundCall(String number) {
        System.out.println("Inbound calling from " + number + " (to my phone " + this + ")");
    }

    public void hangup() {
        Network.setRegisteredInUse(this.number, false);
    }
}

