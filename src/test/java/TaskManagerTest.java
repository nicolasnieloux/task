import org.example.ApplicationConsole;
import org.example.TaskManager;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class TaskManagerTest {

    @Test
    public void menuTest_exit() {
        ApplicationConsole applicationConsoleMock = mock(ApplicationConsole.class);

        when(applicationConsoleMock.readLine())
                .thenReturn("add")
                .thenReturn("exit");

        TaskManager target = new TaskManager(applicationConsoleMock);
        target.menu();

        verify(applicationConsoleMock, times(2)).showMessage("Enter a command: (add, remove, mark, list, exit)");
    }

    @Test
    public void menuTest_add(){

        ApplicationConsole applicationConsoleMock = mock(ApplicationConsole.class);

        when(applicationConsoleMock.readLine())
                .thenReturn("add")
                .thenReturn("1")
                .thenReturn("toto")
                .thenReturn("list")
                .thenReturn("exit");

        TaskManager target = new TaskManager(applicationConsoleMock);
        target.menu();

        verify(applicationConsoleMock, times(1)).showMessage("1totofalse");
    }
}
