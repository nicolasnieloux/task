import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private Task task;
    private List<Task> taskList;

    public TaskList() {
        taskList = new ArrayList<Task>();
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public void add(int id, String content, boolean state) {
        Task task = new Task(id, content, state);
        taskList.add(task);

    }

    public void remove(int id) {
        for (Task task : getTaskList()
        ) {
            if (task.getId() == id) {
                taskList.remove(task);
            }
        }

    }
}