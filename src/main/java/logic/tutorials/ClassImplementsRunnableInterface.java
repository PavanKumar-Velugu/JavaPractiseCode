package logic.tutorials;

public class ClassImplementsRunnableInterface implements Runnable {
    @Override
    public void run() {
        for(int i=0; i<=345678; i++) {
            System.out.println("Implementing Runnable Interface...");
        }
    }
}
