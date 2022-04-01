import java.io.File;
import java.util.Scanner;

public class Exercise15_4 {
    static String[] argArr;
    static File curDir;

    static {
        try {
            curDir = new File(System.getProperty("user.dir"));
        } catch (Exception e) {}
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);

        while(true) {
            try {
                String prompt = curDir.getCanonicalPath() + ">>";
                System.out.println(prompt);

                String input = s.nextLine();

                input = input.trim();
                argArr = input.split(" +");

                String command = argArr[0].trim();

                if ("".equals(command)) continue;

                command = command.toLowerCase();

                if (command.equals("q")) {
                    System.exit(0);
                } else if (command.equals("cd")) {
                    cd();
                } else {
                    for (int i = 0; i < argArr.length; i++) {
                        System.out.println(argArr[i]);
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("입력오류입니다.");
            }
        }


    }

    public static void cd() {
        if (argArr.length == 1) {
            System.out.println(curDir);
            return;
        } else if (argArr.length > 2) {
            System.out.println("USAGE : cd directory");
            return;
        }

        String subDir = argArr[1];

        if (subDir.equals("..")) {
            curDir = new File(curDir.getParent());
        } else if (subDir.equals(".")) {
            System.out.println(curDir);
        } else {
            File newDir = new File(curDir, subDir);
            if(newDir.exists() && newDir.isDirectory()) {
                curDir = newDir;
            } else {
                System.out.println("유효하지 않은 Directory입니다.");
            }

        }


    }
}
