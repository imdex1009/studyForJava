import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Ex12_5 {
    public static void main(String[] args) {
        HashMap<String, Student5> map = new HashMap<>(); // 1.7부터 생성자에 타입지정 생략가능
        map.put("자바왕", new Student5("자바왕", 1, 1, 100, 100, 100));

        Student5 s = map.get("자바왕");


        System.out.println(s.name);

    }
}

class Student5 {
    String name = "";
    int ban;
    int no;
    int kor;
    int eng;
    int math;


    public Student5(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
}