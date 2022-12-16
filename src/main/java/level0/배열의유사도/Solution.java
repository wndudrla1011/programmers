package level0.배열의유사도;

import java.util.Arrays;
import java.util.function.Predicate;

public class Solution {

    public int solution(String[] s1, String[] s2) {
        return (int) Arrays.stream(s1)
                .filter(s -> Arrays.stream(s2).anyMatch(Predicate.isEqual(s)))
                .count();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new String[]{"a", "b", "c"}, new String[]{"com", "b", "d", "p", "c"}));
    }

}
