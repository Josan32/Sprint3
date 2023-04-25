package N2EX1;

import N2EX1.Factories.AbstractFactori;
import N2EX1.Interfaces.AbstractInterface;
import N2EX1.Interfaces.Address;
import N2EX1.Interfaces.Phone;
import N2EX1.Objects.SpainAddress;

public class App {
    public static void main(String[] args) {

        AbstractInterface abstractFactory = AbstractFactori.getFactory("phone");
        Phone phone1 = abstractFactory.getPhone("Spain");

        AbstractInterface abstractFactory1 = AbstractFactori.getFactory("address");
        Address zip = abstractFactory1.getAddress("Spain");

        String name = "Jose Antonio";
        String surname = "Mosqueda";
        String address = "C/San gregorio 24, Burguillos del Cerro";
        String country = "Spain";
        String phone = "670505436";


        System.out.println("Name: "+name +" "+ surname+ "\nAddress: " + address  + "\nZip code: " + zip.formatAddress()
                + " \nPhone: " + phone1.formatPhone() + phone);

    }

}
