package level0.대문자와소문자;

import java.util.stream.Collectors;

public class Solution2 {

    public String solution(String my_string) {
        return my_string.chars()
                .mapToObj(o -> String.valueOf((char) (Character.isLowerCase(o) ? Character.toUpperCase(o) : Character.toLowerCase(o))))
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution("cccCCC"));
    }

}
