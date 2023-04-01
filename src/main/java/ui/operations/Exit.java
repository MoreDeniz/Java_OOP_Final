package ui.operations;

import ui.ConsoleUI;

public class Exit extends Options{

    public Exit(ConsoleUI consoleUI) {
        super(consoleUI);
    }

    @Override
    public String optionName() {
        return "Выход";
    }

    @Override
    public void run() {
        getConsoleUI().end();
    }
}
