package ui;

import presenter.Presenter;

import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleUI implements View{
    private Presenter presenter;
    private Scanner scanner;
    private Menu menu;
    private Boolean Flag;

    private Validator validator = new Validator();

    public ConsoleUI() {
        this.menu = new Menu(this);
        this.scanner = new Scanner(System.in);
        this.Flag = true;
    }

    @Override
    public void setPresenter(Presenter presenter){
        this.presenter = presenter;
    }

    @Override
    public void start() {
        while (this.Flag){
            System.out.println(menu.showMenu());
            String key = userChoice();
            menu.run(key);
        }
    }

    private String userChoice(){
        while (!scanner.hasNext()) {
            scanner.next();
        }
        return scanner.nextLine();
    }
    public void end(){
        this.Flag = false;
    }

    public void addNote(){
        ArrayList<String> newNote = new ArrayList<>();
        System.out.println("\nВведите заголовок: ");
        String titleNote = scanner.nextLine();
        newNote.add(titleNote);

        System.out.println("\nВведите текст: ");
        String textNote = scanner.nextLine();
        newNote.add(textNote);
        presenter.addNote(newNote);
    }

    public void editNote(){
        System.out.println("\nВведите номер записи: ");
        int index = scanner.nextInt();

        if (validator.userInput(index, presenter.getNotepadSize())){
            ArrayList<String> editions = new ArrayList<String>();
            System.out.println("Введите новый заголовок: ");
            scanner.nextLine();
            String newTitle = scanner.nextLine();
            editions.add(newTitle);

            System.out.println("Введите новый текст: ");
            String newText = scanner.nextLine();
            editions.add(newText);

            presenter.editNote(index - 1, editions);
            System.out.println("Запись изменена");
        } else {
            System.out.println("Записи с таким номером нет!");
        }
        System.out.println();
    }

    public void deleteNote(){
        System.out.println("\nВведите номер записи: ");
        int index = scanner.nextInt();
        if (validator.userInput(index, presenter.getNotepadSize())){
            presenter.deleteNote(index-1);
            System.out.println("Запись удалена");
        } else {
            System.out.println("Записи с таким номером нет!");
        }
        System.out.println();
    }

   public ArrayList<String> getNote(int index){
        ArrayList<String> myNote = presenter.getNote(index);
        return myNote;
   }
    public void allNotes(){
        if (presenter.getNotepadSize() == 0){
            System.out.println("Список пуст!");
        } else {
            System.out.println(presenter.allNotes());
        }
    }
}
