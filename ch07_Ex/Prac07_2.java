class MyTv2 {
    private int channel;
    private int prevChannel;

    final int MAX_CHANNEL = 999;
    final int MIN_CHANNEL = 0;

    public void setChannel(int channel) {
        if (channel >= MIN_CHANNEL && channel <= MAX_CHANNEL) {
            setPrevChannel(this.channel);
            this.channel = channel;
        }
    }

    public int getChannel() {
        return this.channel;
    }

    private void setPrevChannel(int prevChannel) {
        this.prevChannel = prevChannel;
    }

    public void gotoPrevChannel() {
        int temp = this.channel;
        this.channel = this.prevChannel;
        this.prevChannel = temp;
    }
}



public class Prac07_2 {
    public static void main(String[] args) {
        MyTv2 t = new MyTv2();

        checkChannel(t);

        t.setChannel(10);
        checkChannel(t);

        t.setChannel(20);
        checkChannel(t);

        t.gotoPrevChannel();
        checkChannel(t);

        t.gotoPrevChannel();
        checkChannel(t);

    }

    static public void checkChannel(MyTv2 t) {
        System.out.println("CH: " + t.getChannel());
    }
}
