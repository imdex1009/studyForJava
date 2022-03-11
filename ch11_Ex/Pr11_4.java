import java.util.*;

public class Pr11_4 {
    public static void main(String[] args) {
        Set set = new HashSet();
        int[][] board = new int[5][5];

        for (int i = 0; set.size() < 25 ; i++) {
            String addon = (int)(Math.random() * 30) + 1 + "";
            set.add(addon);
        }

        ArrayList list = new ArrayList(set);
        Collections.shuffle(list);

        Iterator it = list.iterator();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = Integer.parseInt((String) it.next());
                System.out.print((board[i][j] < 10 ? " 0" : " ") + board[i][j]);
            }
            System.out.println();
        }
    }
}
