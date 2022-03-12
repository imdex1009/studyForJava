import java.util.ArrayList;

class Tv4 {
    String value;

    public Tv4(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Tv4{" +
                "value='" + value + '\'' +
                '}';
    }
};
class Audio {};




public class Ex12_3 {
    public static void main(String[] args) {
        ArrayList<Tv4> list;
        list = new ArrayList<>();
        list.add(new Tv4("첫번째 Tv"));

        Tv4 t = list.get(0);

        System.out.println(t);

    }
}
