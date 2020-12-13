package interfaces.simplethread;

import java.util.List;

public class SimpleThread implements Runnable {

    private List<String> task;

    public List<String> getTask() {
        return task;
    }

    @Override
    public void run() {
        while(!task.isEmpty()) {
            nextStep();
        }
    }

    public SimpleThread(List<String> task) {
        this.task = task;
    }

    private void nextStep() {
        if (task != null && !task.isEmpty()) {
            task.remove(task.size() - 1);
        }
    }
}
