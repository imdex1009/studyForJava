package pkg1;


public class MyParentTest {
    public static void main(String[] args) {
        MyParent p = new MyParent();

//        System.out.println(p.prv); // 에러
        System.out.println(p.dft);
        System.out.println(p.prt);
        System.out.println(p.pub);

    }
}
