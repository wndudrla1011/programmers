package level0.p120895;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution2 {

    public String solution(String my_string, int num1, int num2) {
        List<String> list = Arrays.stream(my_string.split("")).collect(Collectors.toList());

        Collections.swap(list, num1, num2);

        return String.join("", list);
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution("hello", 1, 2));
    }

}
