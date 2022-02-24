public class ch9_7 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("sbc");
        System.out.println(sb);
        System.out.println(sb.capacity());


        char[] chArr = new char[30];
        for(int i = 0; i < chArr.length; i++) {
            chArr[i] = (char)(i+65);
        }


        sb.append(chArr);
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println();

        StringBuffer sb2 = new StringBuffer("abc");
        boolean br = true;
        sb2.append(br);
        System.out.println("sb2");
        System.out.println(sb2); // abctrue

    }
}
