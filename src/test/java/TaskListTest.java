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


    @Test
    public void test_remove_task(){

        TaskList test = new TaskList();

        test.add(1, "test", false); // index 0
        test.add(2, "test", false); // index 1
        test.add(3, "test", false); // index 2

        //Je remove à l'id
        test.remove(2);
        Assertions.assertEquals(2, test.getTaskList().size());

        Assertions.assertEquals(1, test.getTaskList().get(0).getId());
        Assertions.assertEquals(3, test.getTaskList().get(1).getId());
        
    }

}
