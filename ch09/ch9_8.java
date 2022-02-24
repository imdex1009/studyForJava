public class ch9_8 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("0123456");
        sb.insert(4, ".");

        System.out.println(sb);
        double num = Double.valueOf(sb.toString());
        System.out.println(num);
    }
}
