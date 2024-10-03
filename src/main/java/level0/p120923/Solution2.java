package level0.p120923;

import java.util.Arrays;

public class Solution2 {

    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int check = num * (num + 1) / 2;
        int start = (total - check) / num + 1;

        for (int i = 0; i < answer.length; i++) {
            answer[i] = start + i ;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        int[] result = solution.solution(5, 5);
        System.out.println(Arrays.toString(result));
    }

}
