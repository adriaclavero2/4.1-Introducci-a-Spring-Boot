import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UndoTest {

    @BeforeEach
    public void setup() {
        Undo undo = Undo.getInstance();
        while (!undo.showHistory().isEmpty()) {
            undo.undoCommand();
        }
    }

    @Test
    public void testSingleton(){
        Undo.getInstance();
        Undo instance1 = Undo.getInstance();
        Undo instance2 = Undo.getInstance();
        assertSame(instance1,instance2);
    }

    @Test
    public void testAddCommand(){
        Undo undo = Undo.getInstance();
        undo.addCommand("Jump");

        List<String> historial = undo.showHistory();

        assertTrue(historial.contains("Jump"));
    }

    @Test
    public void testUndoCommand(){
        Undo undo = Undo.getInstance();
        List<String> list = undo.showHistory();
        undo.addCommand("Jump");
        assertTrue(list.contains("Jump"));
    }
}
