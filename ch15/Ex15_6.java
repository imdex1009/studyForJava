import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex15_6 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("123.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos, 5);

            for(int i = '1'; i <= '9'; i++) {
                bos.write(i);
            }

//            fos.close(); // 12345까지만 파일에 담긴다.
            bos.close(); // 보조 스트림을 close하기 때문에 나머지 버퍼에 있는 내용물을까지 포함하여 파일에 담긴다.

        } catch (IOException e) {e.printStackTrace();}
    }
}
