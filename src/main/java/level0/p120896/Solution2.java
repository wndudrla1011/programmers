package level0.p120896;

import java.util.*;
import java.util.stream.Collectors;

public class Solution2 {

    public String solution(String s) {
        return Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(s1 -> s1))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue().size() <= 1)
                .map(Map.Entry::getKey)
                .sorted()
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution("dcba"));
    }

}
