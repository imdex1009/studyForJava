import java.util.EmptyStackException;
import java.util.Stack;

public class Ex11_3 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage:java Ecx11_3 \"EXPRESSION\"");
            System.out.println("Example: java Ex11_3 \"(2+3)*3\"");
            System.exit(0);
        }


        Stack stack = new Stack();
        String EXPRESSION = args[0];

        System.out.println("expression:" + EXPRESSION);

        try {
            for (int i = 0; i < EXPRESSION.length(); i++) {
                char ch = EXPRESSION.charAt(i);

                if (ch == '(') {
                    stack.push(ch + "");
                } else if (ch == ')') {
                    stack.pop();
                }
            }

            if (stack.isEmpty()) {
                System.out.println("괄호가 일치합니다.");
            } else {
                System.out.println("괄호가 일치하지 않습니다.");
            }
        } catch (EmptyStackException e) {
            System.out.println("괄호가 일치하지 않습니다.");
        }
    }
}
