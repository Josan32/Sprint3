package N2EX1.Factories;

import N2EX1.Interfaces.AbstractInterface;
import N2EX1.Interfaces.Address;
import N2EX1.Interfaces.Phone;
import N2EX1.Objects.ArgentinaAddress;
import N2EX1.Objects.SpainAddress;

import java.util.ArrayList;

public class AddressFacto implements AbstractInterface {
    @Override
    public Phone getPhone(String phone) {
        return null;
    }

    @Override
    public Address getAddress(String address) {
        if (address == null){
            System.out.println("You must enter a phone");
        }
        if(address.equalsIgnoreCase("Argentina")) {
            return new ArgentinaAddress();
        }else if (address.equalsIgnoreCase("Spain")) {
            return new SpainAddress();
        }
        return null;
    }
}
