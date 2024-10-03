package level0.p120911;

import java.util.*;
import java.util.stream.Collectors;

public class Solution3 {

    public String solution(String my_string) {
        List<Character> answer = new ArrayList<>();

        for (char c : my_string.toCharArray()) {
            if (Character.isUpperCase(c))
                answer.add(Character.toLowerCase(c));
            else
                answer.add(c);
        }

        answer.sort(Comparator.naturalOrder());

        return answer.stream().map(String::valueOf).collect(Collectors.joining());
    }

    public static void main(String[] args) {
        Solution3 s = new Solution3();
        String result = s.solution("Bcad");
        System.out.println(result);
    }

}
