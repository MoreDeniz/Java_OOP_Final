package ui.operations;

import ui.ConsoleUI;

public class AllNotes extends Options{
    public AllNotes(ConsoleUI consoleUI) {
        super(consoleUI);
    }

    @Override
    public String optionName() {
        return "Вывести весь список";
    }

    @Override
    public void run() {
        getConsoleUI().allNotes();
    }
}
