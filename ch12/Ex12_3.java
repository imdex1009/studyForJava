import java.util.ArrayList;
import java.util.List;


class Product3 {};
class Tv4 extends Product3{};
class Audio extends Product3{};





public class Ex12_3 {
    public static void main(String[] args) {
        ArrayList<Product3> productList = new ArrayList<Product3>();
//        ArrayList<Tv4> tvList = new ArrayList<Tv4>();
//        ArrayList<Product3> tvList = new ArrayList<Tv4>(); // 에러
        List<Tv4> tvList = new ArrayList<Tv4>(); // ok

        productList.add(new Tv4());
        productList.add(new Audio());

        tvList.add(new Tv4());
        tvList.add(new Tv4());

        printAll(productList);
//        printAll(tvList); // 컴파일 에러 발생


    }

    public static void printAll (List<Product3> list) {
        for (Product3 p : list)
            System.out.println(p);
    }
}
