package notepad;

import java.util.ArrayList;

public class Notepad {
    private ArrayList<Note> notepad;

    public Notepad(){
        notepad = new ArrayList<Note>();
    }
    // create
    public void addNote(Note note) {
        this.notepad.add(note);
    }
    // read
    public Note getNote(int index){
        return notepad.get(index);
    }

    // remove
    public Note deleteNote(int index){
        return contains(index) ? notepad.remove(index) : null;
    }

    private boolean contains(int index){
        return notepad != null
                && notepad.size() > index;
    }
    public int count(){
        return this.notepad.size();
    }

    public void editNote(int index, Note note){
        notepad.set(index, note);
    }

    public String toString(){
        String string = "Список записей:\n";
        for (int i = 0; i < this.notepad.size(); i++){
            string += i + 1 + ". " + this.notepad.get(i) + "\n";
        }
        return string;
    }
}
