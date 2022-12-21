package level0.중복된문자제거;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {

    public String solution(String myStr) {
        return Arrays.stream(myStr.split("")).distinct().collect(Collectors.joining());
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("We are the world"));
    }

}
