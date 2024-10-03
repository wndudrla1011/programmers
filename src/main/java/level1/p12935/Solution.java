package level1.p12935;

import java.util.Arrays;

public class Solution {

    public int[] solution(int[] arr) {
        if (arr.length == 1)
            return new int[]{-1};

        int[] answer = new int[arr.length - 1];
        int min = arr[0], idx = 0;

        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min)
                continue;
            answer[idx++] = arr[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[]{4, 3, 2, 1})));
    }

}
