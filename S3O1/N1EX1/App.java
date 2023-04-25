package N1EX1;

public class App {
    public static void main(String[] args) {

        Undo u = Undo.getInstance();
        u.addComand("Control c");
        u.addComand("Control v");
        u.addComand("Control z");

        u.removeComand("Control z");
        u.removeComand("r");

        u.readList();

        boolean rptea = u instanceof Undo;
        System.out.println("Is u an undo object? "+ rptea);


    }
}
