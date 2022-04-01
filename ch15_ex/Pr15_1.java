import java.io.*;

public class Pr15_1 {
    public static void main(String[] args) {
        try {

            if (args.length != 2) {
                printUsageAndExit();
            }

            int lines = Integer.parseInt(args[0]);
            String fileName = args[1];

            File file = new File(fileName);


            if (file.isDirectory() || !file.exists()) {
                System.out.println(fileName + "은/는 디렉토리이거나, 존재하지 않는 파일입니다.");
                System.exit(0);
            }

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            for (int i = 1; i <= lines; i++) {
                String line = br.readLine();
                System.out.printf("%2d:%s\n", i, line);
            }

        } catch (IOException e) {e.printStackTrace();
        } catch (NumberFormatException e) {
            printUsageAndExit();
            e.printStackTrace();
        }

    }

    private static void printUsageAndExit() {
        System.out.println("USAGE : java FileHead 10 FILENAME");
        System.exit(0);
    }


}
