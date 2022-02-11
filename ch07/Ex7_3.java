class Point3D extends Point {
    int z;

    String getLocation() {
        return "x:" + x + ", y:" + y + ", z:" + z;
    }
}

public class Ex7_3 {
    public static void main(String[] args) {
        Point3D p = new Point3D();
        p.x = 3;
        p.y = 5;
        p.z = 7;


        System.out.println(p.getLocation());
    }
}

