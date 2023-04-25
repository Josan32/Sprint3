package N3EX1;

public class Vehicle {
    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public void accelerate(){
        System.out.println("The "+ name+" is accelerating");
    }

    public void breake(){
        System.out.println("The "+ name+" is breaking");
    }

    public void start(){
        System.out.println("The "+ name+" is starting");
    }
}
