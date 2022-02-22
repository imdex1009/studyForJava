import java.util.Objects;

class Card1 {
    String kind;
    int number;


    Card1() {
        this("SPADE", 1);
    }

    Card1(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Card1))
            return false;
        if (this == o) return true;
        Card1 card1 = (Card1) o;
        return number == card1.number && kind.equals(card1.kind);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind, number);
    }

    @Override
    public String toString() {
        return "Card1{" +
                "kind='" + kind + '\'' +
                ", number=" + number +
                '}';
    }
}


class ch9_3 {
    public static void main(String[] args) {
        Card1 c1 = new Card1();
        Card1 c2 = new Card1();

        System.out.println(c1.equals(c2));

        System.out.println(c1.toString());
        System.out.println(c2.toString());

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

    }
}
