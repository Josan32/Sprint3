package N3EX1;

public class App {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Car");
        Vehicle vehicle2 = new Vehicle("Plane");
        Vehicle vehicle3 = new Vehicle("Bicicle");
        Vehicle vehicle4 = new Vehicle("Boat");

        Accelerate accelerate = new Accelerate(vehicle1);
        Accelerate accelerate2 = new Accelerate(vehicle4);
        Breake breake = new Breake(vehicle2);
        Start start = new Start(vehicle3);



        TaskManager invoker = new TaskManager();

        invoker.receiveOperations(accelerate);
        invoker.receiveOperations(accelerate2);
        invoker.receiveOperations(breake);
        invoker.receiveOperations(start);

        invoker.executeOperations();

        invoker.receiveOperations(accelerate);
        invoker.receiveOperations(accelerate2);

        invoker.executeOperations();
    }
}
