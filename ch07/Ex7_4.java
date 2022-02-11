public class Ex7_4 {
    public static void main(String[] args) {
        Point3D_2 p3 = new Point3D_2(1, 2, 3);
        System.out.println(p3.getLocation());
    }
}

class Point_2 {
    int x; int y;

    Point_2(){
        this(0,0);
    }

    Point_2 (int x, int y) {
        this.x = x;
        this.y = y;
    }

}

class Point3D_2 extends Point_2{
    int z;

    Point3D_2() {
        this(0,0,0);
    }

    Point3D_2(int x, int y, int z) {
        super();
        this.x = x;
        this.y = y;
        this.z = z;
    }

    String getLocation() {
        return "x:" + x + ", y:" + y + ", z:" + z;
    }
}
// asdfsdff