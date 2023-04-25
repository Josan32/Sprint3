package N3EX1;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    private List<Operation> operations = new ArrayList<>();

    public void receiveOperations (Operation operation){
        operations.add(operation);
    }

    public void executeOperations(){
        operations.forEach(x -> x.execute());
        operations.clear();

    }
}
