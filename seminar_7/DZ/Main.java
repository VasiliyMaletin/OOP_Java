package DZ;

public class Main {
    public static void main(String[] args) {
        DatabaseManager databaseManager = new DatabaseManager();
        Operation operation = new SQLOperation(databaseManager);
        Notes notes = new Notes(operation);
        Console console = new Console(notes);
   }
}
