package level1.같은숫자는싫어;

import java.util.*;

public class Solution2 {

    public int[] solution(int []arr) {
        ArrayList<Integer> tempList = new ArrayList<>();
        int preNum = 10;

        for (int a : arr) {
            if (preNum != a) {
                tempList.add(a);
            }
            preNum = a;
        }

        int[] answer = new int[tempList.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = tempList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(Arrays.toString(s.solution(new int[]{1, 1, 3, 3, 0, 1, 1})));
    }

}
