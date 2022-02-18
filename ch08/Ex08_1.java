public class Ex08_1 {
    public static void main(String[] args) {
        System.out.println(1);
//        System.out.println(0/0);
        try {
            System.out.println(0/0);
        } catch (Exception e1) {
            System.out.println(3);
        }
        System.out.println(4);
    }
}
