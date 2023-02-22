package DZ;

public interface Operation {

    void editNote(Note note, int id);
    void deleteNote(int id);
    void createNote(Note note);
    Object getNotes();
}
