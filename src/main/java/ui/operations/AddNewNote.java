package ui.operations;

import ui.ConsoleUI;

public class AddNewNote extends Options{

    public AddNewNote(ConsoleUI consoleUI) {
        super(consoleUI);
    }

    @Override
    public String optionName() {
        return "Добавить запись";
    }

    @Override
    public void run() {
        getConsoleUI().addNote();
    }
}
