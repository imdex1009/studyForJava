public class pr13_2 {
    public static void main(String[] args) {
        Thread1 r = new Thread1();
        Thread th1 = new Thread(r, "te!");
        th1.start();
    }
}

class Thread1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print('-');
        }
        System.out.println(Thread.currentThread().getName() + "종료!");
    }
}
