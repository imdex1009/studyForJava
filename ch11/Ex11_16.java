import java.util.*;

class Ex11_16 {
    public static void main(String[] args) {
        Set set = new TreeSet();

        for(int i=0; set.size() < 6; i++) {
            int num = (int)(Math.random()*45) + 1;
            set.add(num);
        }

//        TreeSet이므로 정렬할 필요성이 없음
        System.out.println(set);
    }
}