import java.util.Stack;

public class Undo {
    private static Undo instance;

    private Undo(){
        System.out.println("System start...");
    }

    public static Undo getInstance(){
        if(instance == null){
            instance = new Undo();
        }
        return instance;
    }

    private Stack<String> history = new Stack<>();

    public void addCommand(String command){
        history.add(command);
    }

    public void undoCommand() {
        if (history.isEmpty()) {
            System.out.println("History is empty.");
        } else {
            System.out.println("Undo: " + history.pop());

        }
    }

    public void showHistory(){
        if(history.isEmpty()){
            System.out.println("History is empty.");
        }else{
           System.out.println("History: ");
                for(String command : history){
                    System.out.println("- " + command);
                }
        }
    }
}
