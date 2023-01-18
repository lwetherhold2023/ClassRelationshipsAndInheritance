import java.util.ArrayList;
import java.util.Collections;

class Task implements Priority, Complexity, Comparable {

    // set up variables
    private String task;
    private int priorityLevel;
    private int complexityLevel;

    // set up constructor with default complexity and priority
    public Task(String inTask) {
        this.task = inTask;
        this.priorityLevel = 3;
        this.complexityLevel = 1;
    }

    // set priority level
    @Override
    public void setPriority(int inLevel) {
        this.priorityLevel = inLevel;
    }

    // get priority level
    @Override
    public int getPriority() {
        return this.priorityLevel;
    }

    // set complexity level
    @Override
    public void setComplexity(int inLevel) {
        this.complexityLevel = inLevel;
    }

    // get complexity level
    @Override
    public int getComplexity() {
        return this.complexityLevel;
    }

    // returns true if
    @Override
    public int compareTo(Object o) {
        // cast the Task class onto Object o as inTask
        Task inTask = (Task)o;

        // check level of priority (low integer priority is more important)
        if (this.priorityLevel == inTask.getPriority()) {
            // task1 priority is equal to task2
            return 0;
        } else if (this.priorityLevel < inTask.getPriority()) {
            // task1 priority is less than (higher importance) than task2
            return 1;
        } else {
            // task1 priority is greater than (lower importance) than task2
            return -1;
        }
    }

    // returns the task
    public String getTask() {
        return this.task;
    }

    // returns output of task
    public String toString() {
        return "Task Name: " + this.getTask() + "\nPriority: " + this.getPriority() + "\nComplexity: " + this.getComplexity() + "\n\n";
    }
}

