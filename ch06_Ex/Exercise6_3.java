public class Exercise6_3 {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "홍길동";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;



        System.out.printf("이름:%s\n", s.name);
        System.out.printf("총점:%d\n", s.getTotal());
        System.out.printf("평균:%.1f\n", s.getAverage());



    }
}
