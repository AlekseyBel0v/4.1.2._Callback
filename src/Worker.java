public class Worker {
    OnTaskDoneListener onTaskDoneListener;
    OnTaskErrorListener onTaskErrorListener;
    Worker (OnTaskDoneListener onTaskDoneListener, OnTaskErrorListener onTaskErrorListener) {
        this.onTaskDoneListener = onTaskDoneListener;
        this.onTaskErrorListener = onTaskErrorListener;
    }

    void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 32) {
                onTaskErrorListener.onError("Task " + i + " is failed!");
            }
            onTaskDoneListener.onDone("Task " + i + " is done");
        }
    }
}
