import java.util.ArrayList;
import java.util.Arrays;

public class S_17 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(15324)));

    }
    static int[] solution(int area) {
        ArrayList<Integer> arrayList = new ArrayList<>();


        while (area > 0) {
            double d = Math.sqrt(area);
            int sq = (int) Math.pow((int)d, 2);
            area -= sq;
            arrayList.add(sq);
        }

        int[] answer = new int[arrayList.size()];
        for(int i = 0; i < answer.length;i++)
            answer[i] = arrayList.get(i);

        return answer;

    }
}
