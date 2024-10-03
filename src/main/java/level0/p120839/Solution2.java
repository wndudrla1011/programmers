package level0.p120839;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution2 {

    public String solution(String rsp) {
        return Arrays.stream(rsp.split("")).map(s -> s.equals("2") ? "0" : s.equals("0") ? "5" : "2").collect(Collectors.joining());
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution("205"));
    }

}
