package pkg2;

import pkg1.MyParent;

class MyChild extends MyParent {
    // MyParent의 접근자가 defuault이므로 마음대로 클래스를 가져오기가 어렵다
    public void printMembers() {
//        System.out.println(prv); // 에러
//        System.out.println(dft); // 에러
        System.out.println(prt);
        System.out.println(pub);
    }
}






public class MyParentTest2 {
    public static void main(String[] args) {
        MyParent p = new MyParent();

//        System.out.println(p.prv); // 에러
//        System.out.println(p.dft); // 에러
//        System.out.println(p.prt); // 에러
        System.out.println(p.pub);
    }
}
