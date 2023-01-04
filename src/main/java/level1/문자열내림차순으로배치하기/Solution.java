package level1.문자열내림차순으로배치하기;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public String solution(String s) {
        return Arrays.stream(s.split("")).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("Zbcdefg"));
    }

}
