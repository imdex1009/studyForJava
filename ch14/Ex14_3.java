public class Ex14_3 {
    static void execute(MyFunction2 f) {
        f.run();
    }

    static MyFunction2 getMyFunction() {
        MyFunction2 f = () -> System.out.println("f3.run()");
        return f;
    }

    static MyFunction2 getMyFunction(MyFunction2 f) {
        return f;
    }


    public static void main(String[] args) {
        MyFunction2 f1 = () -> System.out.println("f1.run()");

        MyFunction2 f2 = new MyFunction2() {
            @Override
            public void run() {
                System.out.println("f2.run()");
            }
        };

        MyFunction2 f3 = getMyFunction();

        MyFunction2 f4 = getMyFunction((() -> System.out.println("f4.run()")));

        f1.run();
        f2.run();
        f3.run();
        f4.run();

        execute(f1);
        execute(() -> System.out.println("run()"));
    }
}

@FunctionalInterface
interface MyFunction2 {
    void run();
}