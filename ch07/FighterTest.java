abstract class Unit2 {
    int x, y;
    abstract void move(int x, int y);
    void stop() {
        System.out.println("멈춥니다.");
    }
}

interface Fightable {
    void move(int x, int y);
    void attack(Fightable f);
}

class Fighter extends Unit2 implements Fightable {
    @Override
    public void move(int x, int y) {
        System.out.println("["+x+", "+y+"]");
    }

    @Override
    public void attack(Fightable f) {
        System.out.println(f+"를 공격");
    }

    Fightable getFightable() {
        return new Fighter();
    }
}


public class FighterTest {
    public static void main(String[] args) {
        Fighter f = new Fighter();
        Fightable f2 = f.getFightable();

        f.attack(f2);
    }
}
