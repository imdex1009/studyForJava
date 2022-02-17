class Outer {
    static class Inner {
        int iv = 100;
    }
}




public class Prac07_3 {
    public static void main(String[] args) {
        Outer.Inner ot = new Outer.Inner();
        System.out.println(ot.iv);

    }
}
