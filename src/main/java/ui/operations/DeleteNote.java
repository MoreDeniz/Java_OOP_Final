package ui.operations;

import ui.ConsoleUI;

public class DeleteNote extends Options{
    public DeleteNote(ConsoleUI consoleUI) {
        super(consoleUI);
    }

    @Override
    public String optionName() {
        return "Удалить запись";
    }

    @Override
    public void run() {
        getConsoleUI().deleteNote();
    }
}
