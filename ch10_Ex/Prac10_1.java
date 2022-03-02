import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Prac10_1 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.clear();

        for (int i = 0; i < 12; i++) {
            cal.set(2020, i, 1);
            while (true) {
                if (cal.get(Calendar.DAY_OF_WEEK) == 1 && cal.get(Calendar.DAY_OF_WEEK_IN_MONTH) == 2) {
                    Date d = new Date(cal.getTimeInMillis());

                    DateFormat df = new SimpleDateFormat("yyyy-MM-dd은 F번째 일요일입니다.");
                    String result = df.format(d);
                    System.out.println(result);
                    break;
                }

                cal.add(Calendar.DATE, 1);
            }
        }
    }
}
