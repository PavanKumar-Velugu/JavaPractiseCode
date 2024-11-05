package logic.tutorials;

public class FirstProgramThreads {
    public static void main(String[] args) {
        //System.out.println("Hello.....");
        System.out.println(Thread.currentThread().getName());

        //Class which extends Thread class
        ThreadExtendsThreadEx thread = new ThreadExtendsThreadEx();
        thread.start();

        //class which implements Runnable Interface
        ClassImplementsRunnableInterface runnbleClass = new ClassImplementsRunnableInterface();
        Thread t1 = new Thread(runnbleClass);
        t1.start();

        for(int i=1; i<=100000 ;i++) {
            System.out.println("Main class...");
        }
    }
}
