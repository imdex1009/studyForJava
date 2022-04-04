import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class UdpServer {
    public static void main(String[] args) {
        try {
            new UdpServer().start();
        } catch (IOException e) {e.printStackTrace();}
    }

    public void start() throws IOException {
        DatagramSocket socket = new DatagramSocket(7777);
        DatagramPacket inPacket, outPacket;

        byte[] inMsg = new byte[10];
        byte[] outMsg;

        while(true) {
            // 데이터를 수신하기 위한 패킷을 생성한다.
            inPacket = new DatagramPacket(inMsg, inMsg.length);
            socket.receive(inPacket);

            // 수신한 패킷으로부터 client의 IP주소와 Port를 얻는다.
            InetAddress address = inPacket.getAddress();
            int Port = inPacket.getPort();

            // 서버의 현재 시간을 시분초 형태([hh:mm:ss])로 반환한다.
            SimpleDateFormat sdf = new SimpleDateFormat("[hh:mm:ss]");
            String time = sdf.format(new Date());
            outMsg = time.getBytes();
            System.out.println(new String(outMsg));

            // 패킷을 생성해서 client에게 전송(send)한다.
            outPacket = new DatagramPacket(outMsg, outMsg.length, address, Port);
            socket.send(outPacket);
        }

    }
}
