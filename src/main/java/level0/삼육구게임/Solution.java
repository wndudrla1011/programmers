package level0.삼육구게임;

import java.util.Arrays;

public class Solution {

    public int solution(int order) {
        return (int) Arrays.stream(String.valueOf(order).split(""))
                .filter(o -> o.equals("3") || o.equals("6") || o.equals("9"))
                .count();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(29423));
    }

}
