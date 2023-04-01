// Модуль для создания записи в нужном формате: дата

package notepad;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Note {
    private LocalDate date;
    private String title;
    private String note;


    public Note(LocalDate date, String title, String note){
        this.date = date;
        this.title = title;
        this.note = note;
    }

    public Note() {
        this.date = date;
        this.title = title;
        this.note = note;
    }

    // Получение записи
    public String getNote(){
        return this.note;
    }
    public String getTitle(){
        return this.title;
    }

    // Запись в строковом представлении
    @Override
    public String toString(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String formatDate = this.date.format(formatter);
        return String.format("\t%s г.\n\t%s\n%s", formatDate, title, note);
    }
}
