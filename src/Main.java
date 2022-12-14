public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener onDone = System.out::println;
        OnTaskErrorListener onError = System.out::println;
        Worker worker = new Worker(onDone, onError);
        worker.start();
    }
}