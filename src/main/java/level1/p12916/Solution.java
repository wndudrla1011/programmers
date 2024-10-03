package level1.p12916;

import java.util.Arrays;

public class Solution {

    boolean solution(String s) {
        long pCount = Arrays.stream(s.split("")).filter(a -> a.equals("p") || a.equals("P")).count();
        long yCount = Arrays.stream(s.split("")).filter(a -> a.equals("y") || a.equals("Y")).count();

        return pCount == yCount;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("pPoooyY"));
    }

}
