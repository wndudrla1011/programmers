package level0.모음제거;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {

    public String solution(String my_string) {
        return Arrays.stream(my_string.split(""))
                .map(a -> a.replaceAll("[aeiou]", ""))
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("nice to meet you"));
    }

}
