import java.util.Calendar;

public class Ex10_5 {
    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();

        date.clear();
        date.set(2020, 7, 31);

        date.roll(Calendar.DATE, 1);
        System.out.println(toString(date));
        date.roll(Calendar.MONTH, -8);
        System.out.println(toString(date));

        date.clear(); // 모든 필드를 초기화
        date.set(2020, 7, 31); // 2020년 8월 31일로 설정

        date.add(Calendar.DATE, 1); // 날짜(DATE)에 1을 더한다. => 9월 1일로 설정됨
        System.out.println(toString(date));
        date.add(Calendar.MONTH, -8); // 월(MONTH)에서 8을 뺀다.
        System.out.println(toString(date));

    }

    public static String toString(Calendar date) {
        return date.get(Calendar.YEAR) + "년 " + date.get(Calendar.MONTH) + "월 " + date.get(Calendar.DATE)+ "일 ";
    }
}
