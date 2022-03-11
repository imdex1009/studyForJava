import java.util.*;

class SutdaCard2 {
    int num;
    boolean isKwang;

    SutdaCard2(){
        this(1, true);
    }


    public SutdaCard2(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public boolean equals(Object o) {
        if (o instanceof SutdaCard2) {
            SutdaCard2 c = (SutdaCard2) o;
            return num == c.num && isKwang == c.isKwang;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return num + (isKwang ? "K" : "");
    }

    @Override
    public int hashCode() {
        return Objects.hash(toString());
    }
}



public class Pr11_3 {
    public static void main(String[] args) {
        SutdaCard2 c1 = new SutdaCard2(3, true);
        SutdaCard2 c2 = new SutdaCard2(3, true);
        SutdaCard2 c3 = new SutdaCard2(1, true);

        HashSet set = new HashSet();
        set.add(c1);
        set.add(c2);
        set.add(c3);

        System.out.println(set);

    }
}
