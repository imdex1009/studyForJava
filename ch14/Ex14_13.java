import java.util.Optional;

public class Ex14_13 {
    public static void main(String[] args) {
//        int[] arr = null;
        int[] arr = new int[5];
        System.out.println("arr.length = " + arr.length);

        Optional<String> opt = Optional.empty();
        System.out.println("opt = " + opt);
//        System.out.println("opt.get = " + opt.get());

        String str = "";

//        try {
//            str = opt.get();
//        } catch (Exception e) {
//            str = "";
//        }


        str = opt.orElse("EMPTY");
        System.out.println("str = " + str);



    }
}
