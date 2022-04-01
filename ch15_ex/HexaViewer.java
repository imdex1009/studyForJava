import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class HexaViewer {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("USAGE : java HexaViewer FILENAME");
            System.exit(0);
        }

        try {
            String fileName = args[0];
            FileReader fr = new FileReader(fileName);
            PrintStream ps = new PrintStream("HexResult.txt");

            int data = 0;
            int i =0;
            while ((data = fr.read()) != -1) {
                ps.printf("%02x ", data);
                if(++i % 16 == 0) {
                    ps.println();
                }
            }

        } catch (IOException e ) {e.printStackTrace();}


    }
}
