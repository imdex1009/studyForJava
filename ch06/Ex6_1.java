public class Ex6_1 {
    public static void main(String[] args) {
        Tv t = new Tv();
        t.channel = 7;
        t.channelUp();
        System.out.printf("현재 채널은 %d 입니다", t.channel);

    }
}

class Tv {
    String color;
    boolean power;
    int channel;

    void power() {power = !power;}
    void channelUp() {channel++;}
    void channelDown() {channel--;}
}