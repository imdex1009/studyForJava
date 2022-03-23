public class pr13_3 {
    public static void main(String[] args) {
        Thread2 r = new Thread2();
        Thread th = new Thread(r);

        th.start();

        for (int i =0; i < 10; i++) {
            System.out.print("s");
            System.out.print(i);
        }
    }
}

class Thread2 implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.print(i);
        }
    }
}