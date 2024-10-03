package level1.p12935;

import java.util.Arrays;

public class Solution2 {

    public int[] solution(int[] arr) {
        if (arr.length == 1)
            return new int[]{-1};

        int min = Arrays.stream(arr).min().getAsInt();

        return Arrays.stream(arr).filter(i -> i != min).toArray();
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(Arrays.toString(s.solution(new int[]{4, 3, 2, 1})));
    }

}
