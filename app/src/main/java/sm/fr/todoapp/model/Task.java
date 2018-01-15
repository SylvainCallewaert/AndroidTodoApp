package sm.fr.todoapp.model;

/**
 * Entité modèlisant une tâche
 */
public class Task {

    private String taskName;
    private Boolean done = false;
    private Long id;
    private String userName;

    public Task() {
    }

    public Task(String taskName, String userName) {
        this.taskName = taskName;
        this.userName= userName;
    }

    public Task(String taskName, String userName, Boolean done) {
        this.taskName = taskName;
        this.userName= userName;
        this.done = done;

    }

    public String getUserName() {
        return userName;
    }
    public String getTaskName() {
        return taskName;
    }

    public Task setuserName(String userName) {
        this.userName = userName;
        return this;
    }

    public Task setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    public Boolean isDone() {
        return done;
    }

    public Task setDone(Boolean done) {
        this.done = done;
        return this;
    }

    public Long getId() {
        return id;
    }

    public Task setId(Long id) {
        this.id = id;
        return this;
    }

    public int getDoneAsInteger(){
        if(this.done){
            return 1;
        } else {
            return 0;
        }
    }
}
