package N2EX1.Objects;

import N2EX1.Interfaces.Phone;

public class ArgentinaPhone implements Phone {

    private String country;
    private String prefix;

    public ArgentinaPhone() {
        this.country = "Argentina";
        this.prefix = "+54";
    }

    @Override
    public String formatPhone() {
        return "(" +  prefix + ")" ;
    }
}
