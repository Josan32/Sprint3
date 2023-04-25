package N1EX1;
import java.util.ArrayList;
import java.util.List;

public class Undo {

    private static Undo instancia;
    private static List<String> comands = new ArrayList<>();

    private Undo(){

    }

    public static Undo getInstance(){
        if (instancia == null){
            instancia = new Undo();
        }
        return instancia;
    }

    public void addComand(String comand){
        comands.add(comand);
    }

    public void removeComand(String comand){
        if ( comands.contains(comand)){
            comands.remove(comand);
        }
        else{
            System.out.println("'"+comand+"'" + " not find in list of comands");
        }
    }
    public void readList(){
        System.out.println("Your command list is:");
        for(String comand: comands) System.out.println("\t-"+comand);
    }
}
