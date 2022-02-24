public class ch9_5 {
    public static void main(String[] args) {

        String s = new String("Hello");
        System.out.println(s);

        char[] c = {'H', 'e', 'l', 'l', 'o'};
        String s1 = new String(c);
        System.out.println(s1);

        StringBuffer sb = new StringBuffer("Hello");
        String s2 = new String(sb);
        System.out.println(s2);

        String animals = "dog,cat,bear";
        String[] arr = animals.split(",");
        String str = String.join("-", arr);
        System.out.println(str);


    }

}
