package level0;

import java.util.Arrays;

public class TheSumOfConsecutiveNumbers {

    static class Solution {
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

            System.out.println(Arrays.toString(answer));
            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        solution.solution(3, 12);

    }

}
