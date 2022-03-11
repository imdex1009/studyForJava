import java.util.*;

class Student2 implements Comparable{
    String name;
    int ban;
    int no;
    int kor, eng, math;

    public Student2(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal() {
        return kor + eng + math;
    }

    float getAverage() {
        return (int) ((getTotal()/3f)*10+0.5)/10f;
    }

    @Override
    public String toString() {
        return "Strudent2{" +
                "name='" + name + '\'' +
                ", ban=" + ban +
                ", no=" + no +
                ", kor=" + kor +
                ", eng=" + eng +
                ", math=" + math +
                ", total=" + getTotal() +
                ", average=" + getAverage() +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Student2) {
            Student2 tmp = (Student2) o;
            return this.name.compareTo(tmp.name);
        } else
            return -1;
    }
}


class BanNoAscending implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if (!(o1 instanceof Student2 && o2 instanceof Student2)) {return -1;}
        Student2 st1 = (Student2) o1;
        Student2 st2 = (Student2) o2;

        if (st1.ban != st2.ban) return st1.ban - st2.ban;
        else {
            return (st1.no < st2.no) ? -1 : 1;
        }

    }
}





public class Pr11_2 {
    public static void main(String[] args) {
        ArrayList<Student2> list = new ArrayList();
        list.add(new Student2("이자바", 2, 1, 70 ,90,70));
        list.add(new Student2("안자바", 2, 2, 60,100,80));
        list.add(new Student2("홍길동", 1, 3, 100,100,100));
        list.add(new Student2("남궁성", 1, 1, 90,70,80));
        list.add(new Student2("김자바", 1, 2, 80,80,90));


        Collections.sort(list, new BanNoAscending());
        Iterator it = list.iterator();

        while (it.hasNext())
            System.out.println(it.next());

    }
}

