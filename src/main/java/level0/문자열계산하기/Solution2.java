package level0.문자열계산하기;

import java.util.Arrays;

public class Solution2 {

    public int solution(String my_string) {
        return Arrays.stream(my_string.replaceAll("[-] ", "-")
                        .replaceAll("[+] ", "")
                        .split(" ")).mapToInt(Integer::parseInt).sum();
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution("20000 - 4000 + 5000"));
    }

}
