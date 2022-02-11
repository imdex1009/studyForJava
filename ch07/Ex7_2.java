public class Ex7_2 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.c.x = 10;
        c1.c.y = 20;

        System.out.println(c1.c.x);
        System.out.println(c1.c.y);
        System.out.println(c1);
    }
}

class Point {
    int x; int y;
    String getLocation() {
        return "x:" + x + ", y:" +y;
    }
}

class Circle extends Object{
    Point c = new Point(); // 원점
    int r; // 반지름(radius)
}
