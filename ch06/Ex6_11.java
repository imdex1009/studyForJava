class Car2 {
    String color;
    String gearType;
    int door;

    Car2() {
        this("white", "auto", 4);
    }

    Car2(String color) {
        this(color, "auto", 4);
    }


    Car2(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}




public class Ex6_11 {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        Car2 c2 = new Car2("blue");

        System.out.printf("c1의 color = %s, gearType = %s, door = %d\n", c1.color, c1.gearType, c1.door);
        System.out.printf("c2의 color = %s, gearType = %s, door = %d\n", c2.color, c2.gearType, c2.door);

    }
}
