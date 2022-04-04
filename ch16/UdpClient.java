import java.io.*;
import java.net.*;
import java.util.Arrays;

public class UdpClient {
    public static void main(String[] args) {
        try {
            new UdpClient().start();
        } catch (Exception e) {e.printStackTrace();}
    }

    public void start() throws IOException, UnknownHostException {
        DatagramSocket datagramSocket = new DatagramSocket();
        InetAddress serverAddress = InetAddress.getByName("127.0.0.1");

        // 데이터가 저장될 공간으로 byte배열을 생성한다.
        byte[] msg = new byte[100];

        DatagramPacket outPacket = new DatagramPacket(msg, 1, serverAddress, 7777);
        DatagramPacket inPacket = new DatagramPacket(msg, msg.length);

        datagramSocket.send(outPacket);
        datagramSocket.receive(inPacket);

        String result = new String(inPacket.getData());


//        String test = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
//
//        System.out.println(test);
//
//        String[] s = test.split("");
//        System.out.println(result.length());
//        System.out.println(s.length);

        System.out.println("current server time :" + result.trim());

        datagramSocket.close();
    }
}
