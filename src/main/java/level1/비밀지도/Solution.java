package level1.비밀지도;

import java.util.Arrays;

public class Solution {

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            String result = Integer.toString(arr1[i] | arr2[i], 2);
            int length = result.length();

            while (n - length > 0) {
                result = "0" + result;
                length++;
            }

            result = result.replaceAll("1", "#").replaceAll("0", " ");

            answer[i] = result;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(6, new int[]{46, 33, 33 ,22, 31, 50}, new int[]{27 ,56, 19, 14, 14, 10})));
    }

}
