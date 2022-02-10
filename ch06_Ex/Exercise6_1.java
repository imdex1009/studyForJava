public class Exercise6_1 {
    public static void main(String[] args) {
        System.out.println("hi");
    }
}

class Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    Student(){}

    Student(String name, int ban, int no, int kor, int eng, int math){
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    String info() {
        int total = kor + eng + math;
        float average = (float)Math.round((total / 3.0)*10)/10;

        String result;
        result = name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + total + "," + average;
        return result;
    }

    int getTotal() {return kor + eng + math;}
    float getAverage() {return  (int)(getTotal() / 3f * 10) / 10f;}
}