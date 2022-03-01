import java.util.Calendar;

public class Ex10_1 {
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance(); // 현재 날짜와 시간으로 셋팅됨
        int thisYear = cal.get(Calendar.YEAR); // 올해가 몇년인지 알아낸다.
        int lastDayOfMonth = cal.getActualMaximum(Calendar.DATE); // 이 달의 마지막날


        System.out.println(cal);
        System.out.println(thisYear);
        System.out.println(lastDayOfMonth);



    }
}
