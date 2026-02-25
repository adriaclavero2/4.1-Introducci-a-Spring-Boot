import java.util.List;
import java.util.Stack;

public class Undo {
    private static Undo instance;

    private Stack<String> history = new Stack<>();

    private Undo() {
    }

    public static Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    public void addCommand(String command) {
        history.add(command);
    }

    public String undoCommand() {
        if (history.isEmpty()) {
            return "History is empty.";
        }
        return history.pop();
    }


    public List<String> showHistory() {
        return history;

    }
}


