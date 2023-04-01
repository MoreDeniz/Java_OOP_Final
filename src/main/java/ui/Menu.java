package ui;

import ui.operations.*;

import java.util.Map;
import java.util.TreeMap;

public class Menu {
    private TreeMap<String,Options> commands;
    private ConsoleUI consoleUI;

    public Menu(ConsoleUI consoleUI){
        this.consoleUI = consoleUI;
        this.commands = new TreeMap<>();
        this.commands.put("q", new Exit(consoleUI));
        this.commands.put("1", new AddNewNote(consoleUI));
        this.commands.put("2", new AllNotes(consoleUI));
        this.commands.put("3", new EditNote(consoleUI));
        this.commands.put("4", new DeleteNote(consoleUI));
    }


    public void run(String opt){
        if(commands.containsKey(opt)) {
            Options option = commands.get(opt);
            option.run();
        }
        else {
            System.out.println("Неверный ввод!");
        }
    }

    String showMenu(){
        StringBuilder sb = new StringBuilder();
        sb.append("=============================\n")
                .append("Выберите пункт Меню:\n");
        for (Map.Entry<String, Options> item: this.commands.entrySet()) {
            sb.append(item.getKey())
                    .append(" -> ")
                    .append(item.getValue().optionName())
                    .append("\n");
        }
        return sb.toString();
    }
}
