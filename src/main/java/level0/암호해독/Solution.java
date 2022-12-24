package level0.암호해독;

import java.util.stream.*;

public class Solution {

    public String solution(String cipher, int code) {
        String[] alpha = cipher.split("");
        return IntStream.range(0, cipher.length())
                .filter(i -> (i+1) % code == 0)
                .mapToObj(i -> alpha[i])
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("pfqallllabwaoclk", 2));
    }

}
