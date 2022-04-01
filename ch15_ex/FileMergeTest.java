import java.io.*;
import java.util.Vector;

public class FileMergeTest {
    public static void main(String[] args) {

        try {

            Vector files = new Vector();

            for (int i = 0; i < args.length; i++) {
                files.add(new FileInputStream(args[i]));
            }

            SequenceInputStream in = new SequenceInputStream(files.elements());


            FileWriter fw = new FileWriter("result.txt");

            int data = 0;
            while ((data = in.read()) != -1) {
                fw.write(data);
            }

            in.close();
            fw.close();

        } catch (IOException e) {e.printStackTrace();}


    }
}
