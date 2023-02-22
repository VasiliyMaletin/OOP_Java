package DZ;

import java.util.List;

public interface NoteInterface {
    void createNote(String head, String text, String data);
    void deleteNote(int id);
    void editNote(int id, NoteFields noteField, String edit);
    List<Note> getNoteList();
    void loadNote(String head, String text, String data);
    void loadNotes(List<String> stringList);
}
