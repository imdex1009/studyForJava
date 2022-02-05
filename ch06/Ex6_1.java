public class Ex6_1 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();

        t1.channel = 7;
        t2.channel = t1.channel;
        t2.channelUp();

        System.out.println("t1 channel is " + t1.channel);
        System.out.println("t2 channel is " + t2.channel);


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