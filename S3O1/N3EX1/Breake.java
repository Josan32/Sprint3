package N3EX1;

public class Breake implements Operation{

    private Vehicle vehicle;

    public Breake(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.breake();

    }
}
