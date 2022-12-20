package level0.문자열정렬하기1;

import java.util.Arrays;

public class Solution {

    public int[] solution(String my_string) {
        return my_string.chars().sorted().filter(Character::isDigit).map(ch -> (int) ch - 48).toArray();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution("hi12392")));
    }

}
