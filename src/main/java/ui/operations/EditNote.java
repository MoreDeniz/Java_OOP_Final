package ui.operations;

import ui.ConsoleUI;

public class EditNote extends Options{
    public EditNote(ConsoleUI consoleUI) {
        super(consoleUI);
    }

    @Override
    public String optionName() {
        return "Редактировать запись";
    }

    @Override
    public void run() {
        getConsoleUI().editNote();
    }
}
