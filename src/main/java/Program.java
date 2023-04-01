import presenter.Presenter;
import ui.ConsoleUI;
import notepad.Notepad;
import ui.View;

public class Program {
    public static void main(String[] args) {

        View view = new ConsoleUI();
        Notepad notepad = new Notepad();
        Presenter presenter = new Presenter(view, notepad);

        view.start();
    }
}