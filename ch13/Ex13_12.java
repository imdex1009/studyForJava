@SuppressWarnings("depreacation")
public class Ex13_12 {

    public static void main(String[] args) {
        Mythread th1 = new Mythread("*");
        Mythread th2 = new Mythread("**");
        Mythread th3 = new Mythread("***");

        th1.start();
        th2.start();
        th3.start();

        try {
            Thread.sleep(2000);
            th1.suspend();
            Thread.sleep(2000);
            th2.suspend();
            Thread.sleep(3000);
            th1.resume();
            Thread.sleep(3000);
            th1.stop();
            th2.stop();
            Thread.sleep(2000);
            th3.stop();



        } catch (InterruptedException e) {}

    }
}

class Mythread implements Runnable {
    volatile boolean suspended = false; // 쉽게 바뀌는 변수
    volatile boolean stopped = false;

    Thread th;

    Mythread(String name) {
        th = new Thread(this, name);
    }

    void start() { th.start(); }
    void stop() {stopped = true;}
    void suspend() {suspended = true;}
    void resume() {suspended = false;}

    @Override
    public void run() {
        while (!stopped) {
            if (!suspended) {
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {}
            }
        }
    }
}