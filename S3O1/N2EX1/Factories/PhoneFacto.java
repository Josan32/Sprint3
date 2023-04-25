package N2EX1.Factories;

import N2EX1.Interfaces.AbstractInterface;
import N2EX1.Interfaces.Address;
import N2EX1.Interfaces.Phone;
import N2EX1.Objects.ArgentinaPhone;
import N2EX1.Objects.SpainPhone;

public class PhoneFacto implements AbstractInterface {
    @Override

    public Phone getPhone(String phone) {
        if (phone == null){
            System.out.println("You must enter a phone");
        }
        if(phone.equalsIgnoreCase("Argentina")) {
            return new ArgentinaPhone();
        }else if (phone.equalsIgnoreCase("Spain")) {
            return new SpainPhone();
        }
        return null;
    }

    @Override
    public Address getAddress(String address) {
        return null;
    }
}
