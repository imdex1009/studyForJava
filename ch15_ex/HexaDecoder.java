import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

public class HexaDecoder {
    public static void main(String[] args) {

        String fileName = "HexResult.txt";

        try {
            FileReader fr = new FileReader(fileName);
            PrintStream out = new PrintStream(System.out);


            int data = 0;
            StringBuilder sb = new StringBuilder();

            while ((data = fr.read()) != -1) {

                char ch = (char)data;
                if (ch == ' ' || ch == '\n') {
                    continue;
                }

                sb.append(ch);
                if (sb.length() == 2) {
                    out.print(getCharFromHexString(sb.toString()));
                    sb.delete(0, 2);
                }
            }

            fr.close();
            out.close();

        } catch (IOException e) {e.printStackTrace();}



    }

    private static char getCharFromHexString(String val) {
        return (char)Integer.parseInt(val, 16);
    }
}
