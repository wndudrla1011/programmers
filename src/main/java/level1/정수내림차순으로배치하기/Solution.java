package level1.정수내림차순으로배치하기;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public long solution(long n) {
        String result = Arrays.stream(String.valueOf(n).split(""))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining());

        return Long.parseLong(result);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(118372));
    }

}
