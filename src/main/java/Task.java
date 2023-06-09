public class Task {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    private String content;
    private boolean state;

    public Task(int id, String content, boolean state) {
        this.id = id;
        this.content = content;
        this.state = state;
    }
}
