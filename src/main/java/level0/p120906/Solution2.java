package level0.p120906;

import java.util.Arrays;

public class Solution2 {

    public int solution(int n) {
        return Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sum();
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        int result = s.solution(1234);
        System.out.println(result);
    }

}
