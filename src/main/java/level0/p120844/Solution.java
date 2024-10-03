package level0.p120844;

import java.util.Arrays;

public class Solution {

    public int[] solution(int[] numbers, String direction) {
        int length = numbers.length;
        int[] answer = new int[length];

        for (int i = 0; i < length; i++) {
            if (direction.equals("right")) {
                answer[(i + 1) % length] = numbers[i];
            } else {
                if (i == 0)
                    answer[i - 1 + length] = numbers[i];
                else
                    answer[i - 1] = numbers[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[]{4, 455, 6, 4, -1, 45, 6}, "left")));
    }

}
