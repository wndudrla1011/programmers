package level0.연속된수의합;

import java.util.Arrays;

public class Solution {

    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int start = 1, sum = 0;

        while (true) {

            for (int ctr = 0, i = start; ctr < num; ctr++, i++) {
                sum += i;
                answer[ctr] = i;
            }

            if (sum < total) {
                start++;
                sum = 0;
            } else if (sum > total) {
                start--;
                sum = 0;
            } else {
                break;
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(3, 12);
        System.out.println(Arrays.toString(result));
    }

}
