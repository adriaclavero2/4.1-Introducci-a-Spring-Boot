import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UndoTest {

    @Test
    public void testSingleton(){
        Undo.getInstance();
        Undo instance1 = Undo.getInstance();
        Undo instance2 = Undo.getInstance();
        assertSame(instance1,instance2);
    }

    @Test
    public void testAddCommand(){
        ByteArrayOutputStream test = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(test));
        Undo undo = Undo.getInstance();
        undo.undoCommand();
        undo.addCommand("Jump");
        undo.showHistory();
        System.setOut(originalOut);
        String output = test.toString();
        assertTrue(output.contains("Jump"));

    }

    @Test
    public void testUndoCommand(){
        ByteArrayOutputStream test = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(test));
        Undo undo = Undo.getInstance();
        undo.undoCommand();
        undo.addCommand("Jump");
        undo.undoCommand();
        System.setOut(originalOut);
        String output =test.toString();
        assertTrue(output.contains("Undo: Jump"));
    }
}
