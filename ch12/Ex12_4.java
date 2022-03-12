import java.util.ArrayList;
import java.util.Iterator;

public class Ex12_4 {
    public static void main(String[] args) {
        ArrayList<Student3> list = new ArrayList<Student3>();
        list.add(new Student3("자바왕", 1, 1));
        list.add(new Student3("자바짱", 1, 2));
        list.add(new Student3("홍길동", 2, 1));

        Iterator<Student3> it = list.iterator();
        while (it.hasNext()) {
//            Student3 next = (Student3)it.next();
            Student3 next =  it.next();
            System.out.println(next.name);

        }

    }
}

class Student3 {
    String name = "";
    int ban;
    int no;

    public Student3(String name, int ban, int no) {
        this.name = name;
        this.ban = ban;
        this.no = no;
    }
}