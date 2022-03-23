import java.util.ArrayList;

// 손님스레드가 계속해서 lock을 쥐고 있어서
// 요리사 스레드가 음식을 만들 수가 없음


public class Ex13_19 {
    public static void main(String[] args) throws Exception{
        Table2 table = new Table2();

        new Thread(new Cook2(table), "COOK").start();
        new Thread(new Customer2(table, "donut"), "CUST1").start();
        new Thread(new Customer2(table, "burger"), "CUST2").start();

        Thread.sleep(5000);
        System.exit(0);

    }
}



class Table2 {
    String[] dishNames = {"donut", "donut", "burger"};
    final int MAX_FOOD = 6;
    private ArrayList<String> dishes = new ArrayList<>();

    public synchronized void add(String dish) {
        while (dishes.size() >= MAX_FOOD) {
            String name = Thread.currentThread().getName();
            MyLog.printLog(name + " is waiting");
            try {
                wait();
                Thread.sleep(500);
            } catch (InterruptedException e) {}

        }
        dishes.add(dish);
        notify();
        System.out.println("Dishes:" + dishes);
    }

    public void remove (String dishName) {
        String name = Thread.currentThread().getName();
        synchronized (this) {
            while(dishes.size()==0) {

                MyLog.printLog(name + " is waiting");
                try {
                    wait();
                    Thread.sleep(500);
                } catch (InterruptedException e) {}
            }

            while(true) {
                for (int i = 0; i < dishes.size(); i++) {
                    if(dishName.equals(dishes.get(i))) {
                        dishes.remove(i);
                        notify();
                        return ;
                    }
                }

                try {

                    MyLog.printLog(name + " is waiting");
                    wait();
                    Thread.sleep(500);
                } catch (InterruptedException e) {}

            }
        }
    }

    public int dishNum() {return dishNames.length;}
}

class Customer2 implements Runnable {
    private Table2 table;
    private String food;

    public Customer2(Table2 table, String food) {
        this.table = table;
        this.food = food;
    }

    public void run() {
        while(true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {}

            String name = Thread.currentThread().getName();

            table.remove(food);
            MyLog.printLog(name + " ate a " + food);
        }

    }
}

class Cook2 implements Runnable {
    private Table2 table;

    Cook2(Table2 table) {this.table = table;}

    @Override
    public void run() {
        while(true) {
            int idx = (int)(Math.random()*table.dishNum());
            table.add(table.dishNames[idx]);
            try {Thread.sleep(10);} catch (InterruptedException e) {}
        }
    }
}