package N2EX1.Factories;

import N2EX1.Interfaces.AbstractInterface;

public class AbstractFactori {

    public static AbstractInterface getFactory(String type) {
        if (type.equalsIgnoreCase("phone")) {
            return new PhoneFacto();
        } else if (type.equalsIgnoreCase("address")) {
            return new AddressFacto();
        }
        return null;
    }
}
