package level0.p120886;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {

    public int solution(String before, String after) {
        String a = Arrays.stream(before.split("")).sorted().collect(Collectors.joining());
        String b = Arrays.stream(after.split("")).sorted().collect(Collectors.joining());

        return a.equals(b) ? 1 : 0;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("allpe", "apple"));
    }

}
