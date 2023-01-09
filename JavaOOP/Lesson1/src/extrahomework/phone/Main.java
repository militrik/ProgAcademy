package extrahomework.phone;

public class Main {
    public static void main(String[] args) {

        Phone phone1 = new Phone("380111111111");
        Phone phone2 = new Phone("380222222222");
        Phone phone3 = new Phone("380333333333");
        Phone phone4 = new Phone("380444444444");

        phone1.registration();
        phone2.registration();
        phone3.registration();
        System.out.println(System.lineSeparator());

        phone1.outboundCall(phone2.getNumber());
        phone3.outboundCall(phone2.getNumber());
        phone3.outboundCall(phone1.getNumber());
        phone1.hangup();
        phone2.hangup();
        phone3.hangup();
        System.out.println(System.lineSeparator());

        phone3.outboundCall(phone1.getNumber());
        System.out.println(System.lineSeparator());

        phone2.outboundCall("380000000000");
        System.out.println(System.lineSeparator());

        phone4.outboundCall("380222222222");
        System.out.println(System.lineSeparator());
    }
}

