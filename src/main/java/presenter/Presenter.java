package presenter;

import notepad.Notepad;
import notepad.Note;
import ui.View;

import java.time.LocalDate;
import java.util.ArrayList;

public class Presenter {
    private View view;
    private Notepad notepad;

    public Presenter(View view, Notepad notepad){
        this.view = view;
        this.notepad = notepad;
        view.setPresenter(this);
    }

    // добавить запись
    public void addNote(ArrayList<String> newNote){
        Note addedNote = new Note(LocalDate.now(), newNote.get(0), newNote.get(1));
        notepad.addNote(addedNote);
    }

    // Удалить запись
    public void deleteNote(int index){
        notepad.deleteNote(index);
    }

    // количество записей
    public Integer getNotepadSize(){
        return notepad.count();
    }

    // получить запись
    public ArrayList<String> getNote(Integer index){
        Note note = notepad.getNote(index);
        ArrayList<String> showNote = new ArrayList<>();
        showNote.set(0, note.getTitle());
        showNote.set(1, note.getNote());
        return showNote;
    }

    // изменить запись
    public void editNote(Integer index, ArrayList<String> edition){
        Note editNote = new Note(LocalDate.now(), edition.get(0), edition.get(1));
        notepad.editNote(index, editNote);
    }
    // просмотреть все записи
    public String allNotes(){
        return notepad.toString();
    }
}
