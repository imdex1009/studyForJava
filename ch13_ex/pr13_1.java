import java.text.SimpleDateFormat;
import java.util.*;


public class pr13_1 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MyLog.printLog("안녕하세요");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}

class MyLog {

    static SimpleDateFormat df = new SimpleDateFormat("kk:mm:ss:SSS");

    public static void printLog() {
        Date time = new Date();
        System.out.println(df.format(time));
    }

    public static void printLog(String message) {
        Date time = new Date();
        System.out.printf("%s | %s\n", df.format(time), message);
    }
}