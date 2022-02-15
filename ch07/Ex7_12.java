abstract class Unit {
    int x, y;
    abstract void move(int x, int y);
    void stop(){}
}

class Marine extends Unit {
    Marine(){}
    void move(int x, int y) {
        System.out.println("Marine[x: " + x + ", y: " + y +"]");
    }
}

class Tank extends Unit {
    Tank(){}
    void move(int x, int y) {
        System.out.println("Tank[x: " + x + ", y: " + y + "]");
    }
}

class Dropship extends Unit {
    Dropship(){}
    void move(int x, int y) {
        System.out.println("Dropship[x: " + x + ", y: " + y + "]");
    }
}


public class Ex7_12 {

    public static void main(String[] args) {
        Unit[] arr = {new Marine(), new Tank(), new Dropship()};

        for(int i = 0; i < arr.length; i++) {
            arr[i].move(100, 200);
        }
    }
}
/*
 *  추상 클래스에 공통적으로 적용될 수 있는 추상 메서드 작성을 통해서
 *  참조 배열의 메서드를 다룰 수 있다!!
 */