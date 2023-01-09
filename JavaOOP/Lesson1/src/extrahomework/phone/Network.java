package extrahomework.phone;

public class Network {

    private static final String[] listOfClientsNumbers = new String[100];
    private static final Phone[] listOfClientsPhones = new Phone[100];
    private static final boolean[] listOfClientsInUse = new boolean[100];
    private static int listOfClientsPtr = 0;

    public Network() {

    }

    public static boolean tryToRegister(String number, Phone phone) {
        System.out.println("The " + phone + " with number " + number + " is registered.");
        addRegisteredNumbers(number, phone);
        return true;
    }

    private static void addRegisteredNumbers(String number, Phone phone) {
        listOfClientsNumbers[listOfClientsPtr] = number;
        listOfClientsPhones[listOfClientsPtr] = phone;
        listOfClientsPtr++;
    }

    private static Phone getRegisteredPhone(String number) {
        for (int i = 0; i < listOfClientsNumbers.length; i++) {
            if (number.equals(listOfClientsNumbers[i])) {
                return listOfClientsPhones[i];
            }
        }
        return null;
    }

    private static String getRegisteredNumber(Phone outPhone) {
        for (int i = 0; i < listOfClientsPhones.length; i++) {
            if (outPhone.equals(listOfClientsPhones[i])) {
                return listOfClientsNumbers[i];
            }
        }
        return null;
    }

    private static boolean getRegisteredInUse(String inNumber) {
        for (int i = 0; i < listOfClientsNumbers.length; i++) {
            if (inNumber.equals(listOfClientsNumbers[i])) {
                return listOfClientsInUse[i];
            }
        }
        return false;
    }

    public static void setRegisteredInUse(String inNumber, boolean status) {
        for (int i = 0; i < listOfClientsNumbers.length; i++) {
            if (inNumber.equals(listOfClientsNumbers[i])) {
                listOfClientsInUse[i] = status;
            }
        }
    }

    public static boolean isRegistered(String number) {
        for (String num : listOfClientsNumbers) {
            if (number.equals(num)) return true;
        }
        return false;
    }

    public static String tryToCall(String inNumber, Phone outPhone) {
        Phone inPhone = getRegisteredPhone(inNumber);
        String outNumber = getRegisteredNumber(outPhone);
        setRegisteredInUse(outNumber, true);
        if (isRegistered(inNumber)) {
            if (getRegisteredInUse(inNumber)) {
                return "The " + inNumber + " is busy (outgoing call from " + outPhone + ")";
            } else {

                inPhone.inboundCall(outNumber);
                setRegisteredInUse(inNumber, true);
                return "Beeeeeeep, Beeeeeeep... (outgoing call from " + outPhone + ")";
            }


        } else {
            return "The phone " + inNumber + " is offline or out of area (outgoing call from " + outPhone + ")";
        }
    }


}

