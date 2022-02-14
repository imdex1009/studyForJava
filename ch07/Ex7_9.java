class Toto {
    int x;

    Toto() {this(0);}

    Toto(int x) {
        this.x = x;
    }

    public String toString() {
        return this.x + "";
    }
}

class Toto2 {
    Toto tt;
    int y;

    Toto2() {this(1);}

    Toto2(int y){
        this.y = y;
        this.tt = new Toto();
    }

    public String toString() {
        return this.y + this.tt.toString();
    }
}

class Toto3 {
    Toto2 ttt;
    int z;

    Toto3() {this(2);}

    Toto3(int z) {
        this.z = z;
        this.ttt = new Toto2();
    }

    public String toString() {
        return this.z + this.ttt.toString();
    }
}


public class Ex7_9 {
    public static void main(String[] args) {
        Toto2 t2 = new Toto2();
        Toto3 t3 = new Toto3();

        System.out.println(t3);
        System.out.println(t3);
    }
}
