package DZ;

public class Start {

    public void start() {
        DatabaseManager databaseManager = new DatabaseManager();
        Operation operation = new SQLOperation(databaseManager);
        Notes notes = new Notes(operation);
        Console console = new Console(notes);
    }
}
