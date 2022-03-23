import java.util.ArrayList;

public class Ex13_14 {
    public static void main(String[] args) {
        ArrayList<Integer> newList = new ArrayList<>(800);
        newList.add(12);
        TestMo2 tm = new TestMo2(newList);
        System.out.println(tm.toString());

        MyThread_11 th1 = new MyThread_11(newList);
        MyThread_22 th2 = new MyThread_22(newList);
        th2.setPriority(10);
        th1.start();
        th2.start();

        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e) {}

        System.out.println(tm.toString());

    }
}

class TestMo2 {
    ArrayList list;

    public TestMo2(ArrayList list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "TestMo2{" +
                "list=" + list +
                '}';
    }
}

class MyThread_11 extends Thread {
    ArrayList<Integer> list;

    public MyThread_11(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        System.out.println("start");
        for (int i = 1; i <= 300; i++) {
            list.add(i);
        }
    }
}
class MyThread_22 extends Thread {
    ArrayList<Integer> list;

    public MyThread_22(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 301; i <= 600; i++) {
            list.add(i);
        }
    }
}

