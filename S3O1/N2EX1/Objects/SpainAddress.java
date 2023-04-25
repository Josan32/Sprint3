package N2EX1.Objects;

import N2EX1.Interfaces.Address;

public class SpainAddress implements Address {

    private String country;
    private String zip;

    public SpainAddress() {
        this.country = "Spain";
        this.zip = "06370";
    }

    @Override
    public String formatAddress() {
        return country + " " + "(" +  zip + ")" ;
    }
}
