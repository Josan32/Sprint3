package N2EX1.Objects;

import N2EX1.Interfaces.Phone;

public class SpainPhone implements Phone {

    private String country;
    private String prefix;

    public SpainPhone() {
        this.country = "Spain";
        this.prefix = "+34";
    }

    @Override
    public String formatPhone() {
        return "(" +  prefix + ")" ;
    }
}
