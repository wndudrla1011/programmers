package level0.가위바위보;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {

    public String solution(String rsp) {
        StringBuilder answer = new StringBuilder();

        for (String r : rsp.split("")) {
            if (r.equals("2"))
                answer.append("0");
            else if (r.equals("0"))
                answer.append("5");
            else
                answer.append("2");
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("205"));
    }

}
