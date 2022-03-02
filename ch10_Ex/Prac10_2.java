import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Prac10_2 {
    public static void main(String[] args) {
        String pattern = "yyyy/MM/dd";
        DateFormat df = new SimpleDateFormat(pattern);
        Scanner scanner = new Scanner(System.in);

        System.out.println("날짜를 yyyy/MM/dd의 형태로 입력해주세요.(입력예:2017/05/11)\n>>");

        Date inDate = null;

        while(scanner.hasNextLine()) {
            try {
                inDate = df.parse(scanner.nextLine());
                break;
            } catch(Exception e) {
                System.out.println("날짜를 " + pattern + "의 형태로 다시 입력해주세요.(입력예:2017/05/11)\n>>");
            }
        }

//        Calendar cal = Calendar.getInstance();
//        cal.setTime(inDate);
        DateFormat df2 = new SimpleDateFormat("E");

        System.out.println(df2.format(inDate));
    }
}
