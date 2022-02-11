class Point3D extends Point {
    int z;

    Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    String getLocation() {
        return "x:" + x + ", y:" + y + ", z:" + z;
    }
}

public class Ex7_3 {
    public static void main(String[] args) {
        Point3D p = new Point3D(3, 5, 7);


        System.out.println(p.getLocation());
    }
}

