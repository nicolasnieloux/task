import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskListTest {

    @Test
    public void test_add_task() {

        TaskList test = new TaskList();

        test.add(1, "test", false);
        test.add(1, "test", false);

        Assertions.assertEquals(2, test.getTaskList().size());
    }

    @Test
    public void test_check_task_added(){
        TaskList test = new TaskList();
        test.add(1, "test", false);

        Task task_added = test.getTaskList().get(0);
        Assertions.assertEquals(1, task_added.getId());
        Assertions.assertEquals("test", task_added.getContent());
        Assertions.assertEquals(false, task_added.isState());
    }

}
