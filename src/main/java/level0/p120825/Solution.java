package level0.p120825;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {

    public String solution(String my_string, int n) {
        return Arrays.stream(my_string.split("")).map(s -> s.repeat(n)).collect(Collectors.joining());
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("hello", 3));
    }

}
