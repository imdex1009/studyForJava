public class S_18 {
    public static void main(String[] args) {
        Box1A<String> newBox1A_A = new Box1A<>("box1_var1", "box1_var2");
        Box1A<String> newBox1A_B = new Box1A<>("box1_var1", "box1_var2");

        Box2A<Box1A<String>> totalBox2A = new Box2A<>(newBox1A_A, newBox1A_B);
        System.out.println(totalBox2A);


    }
}

class Box1A<T> {
    T var1;
    T var2;

    public Box1A(T var1, T var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    public void setVar1(T var1) {
        this.var1 = var1;
    }

    public void setVar2(T var2) {
        this.var2 = var2;
    }

    @Override
    public String toString() {
        return "Box1A{" +
                "var1=" + var1 +
                ", var2=" + var2 +
                '}';
    }
}

class Box2A<T> {
    T var1;
    T var2;

    public Box2A(T var1, T var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    @Override
    public String toString() {
        return "{\n  var1: " + var1 + "\n  var2: " + var2 + "\n}";

    }
}