package logic.tutorials;

public class ThreadExtendsThreadEx extends Thread {

    @Override
    public void run() {
        for(int i =0; i<=1200000 ;i++) {
            System.out.println("extending Thread class...");
        }
    }
}
