import java.util.ArrayList;


public class Ex12_1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30); // 타입 체크가 강화됨. 제너릭스 덕분에


        System.out.println(list);
    }
}
