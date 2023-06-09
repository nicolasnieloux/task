import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

        taskList.remove(findTaskById(id));
    }

    public void update(int id) {

        Objects.requireNonNull(findTaskById(id)).setState(!Objects.requireNonNull(findTaskById(id)).isState());

    }

    private Task findTaskById(int id) {

        for (Task task : getTaskList()
        ) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null;
    }

}