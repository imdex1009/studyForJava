import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Ex11_17 {
    public static void main(String[] args) {
        Set set = new TreeSet();

        for(int i=0; set.size() < 6; i++) {
            int num = (int)(Math.random()*45) + 1;
            set.add(new Test(num));
        }

//        TreeSet이므로 정렬할 필요성이 없음
        System.out.println(set);
    }
}

class Test implements Comparable{

    int number;

    public Test(int number) {
        this.number = number;
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Test)) {
            return 0;
        } else if (this.number < ((Test) o).number) {
            return -1;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return String.valueOf(this.number);
    }
}