package ui.operations;

import ui.ConsoleUI;

public abstract class Options {
    private ConsoleUI consoleUI;

    public Options(ConsoleUI consoleUI){
        this.consoleUI = consoleUI;
    }

    public  ConsoleUI getConsoleUI(){
        return consoleUI;
    }

    public abstract String optionName();
    public abstract void run();
}
