package level0.문자열정렬하기1;

import java.util.Arrays;

public class Solution2 {

    public int[] solution(String my_string) {
        return Arrays.stream(my_string.replaceAll("[^0-9]","").split("")).sorted().mapToInt(Integer::parseInt).toArray();
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(Arrays.toString(s.solution("hi12392")));
    }

}
