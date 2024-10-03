package level0.p120904;

import java.util.stream.IntStream;

public class Solution {

    public int solution(int num, int k) {
        String[] slice = String.valueOf(num).split("");

        int idx = IntStream.range(0, slice.length)
                    .filter(i -> String.valueOf(k).equals(slice[i]))
                    .findFirst()
                    .orElse(-1);

        return idx != -1 ? idx + 1 : -1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int result = s.solution(232443, 3);
        System.out.println(result);
    }

}
