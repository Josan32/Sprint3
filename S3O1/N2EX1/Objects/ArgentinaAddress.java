package N2EX1.Objects;

import N2EX1.Interfaces.Address;

public class ArgentinaAddress implements Address {

    private String country;
    private String zip;

    public ArgentinaAddress() {
        this.country = "Argentina";
        this.zip = "7600";
    }


    @Override
    public String formatAddress() {
        return country + " " + "(" +  zip + ")" ;
    }
}
