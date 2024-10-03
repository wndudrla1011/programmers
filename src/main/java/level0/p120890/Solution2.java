package level0.p120890;

import java.util.Arrays;

public class Solution2 {

    public int solution(int[] array, int n) {
        int answer;
        Arrays.sort(array);

        for (int i = 1; i < array.length; i++) {
            if (Math.abs(n - array[0]) > Math.abs(n - array[i])) {
                array[0] = array[i];
            }
        }

        answer = array[0];

        return answer;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution(new int[]{3, 10, 12, 28}, 20));
    }

}
