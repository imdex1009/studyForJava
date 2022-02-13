package pkg1;

public class MyParent {
    private     int prv;
                int dft;
    protected   int prt;
    public      int pub;

    public void printMembers() {
        System.out.println(prv);
        System.out.println(dft);
        System.out.println(prt);
        System.out.println(pub);
    }
}
