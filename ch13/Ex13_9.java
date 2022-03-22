public class Ex13_9 {
    public static void main(String[] args) {
        ThreadEx8_1 th1 = new ThreadEx8_1();
        ThreadEx8_2 th2 = new ThreadEx8_2();
        th1.start();
        th2.start();

        try {
//            th1.sleep(2000)  // th1을 재우는 것이 아니라 main을 재우게 된다.
            Thread.sleep(2000);
        } catch (InterruptedException e) {}

        System.out.print("<<main end>>");
    }
}

class ThreadEx8_1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("-");
        }
        System.out.print("<<th1 end>>");
    }
}

class ThreadEx8_2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("|");
        }
        System.out.print("<<th2 end>>");
    }
}