class Dexing {
    public Dexing(Kind kind, Value value) {
        this.kind = kind;
        this.value = value;
    }



    enum Kind {CLOVER, HEART, DIAMOND, SPADE}
    enum Value {TWO, THREE, FOUR}

    final Kind kind;
    final Value value;


    @Override
    public String toString() {
        return "Dexing{" +
                "kind=" + kind +
                ", value=" + value +
                '}';
    }
}




public class Ex12_10 {
    public static void main(String[] args) {
        Dexing dx = new Dexing(Dexing.Kind.DIAMOND, Dexing.Value.TWO);
        System.out.println(dx);
    }
}
