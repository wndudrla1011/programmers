package level0.외계행성의나이;

import java.util.stream.Collectors;

public class Solution2 {

    public String solution(int age) {
        return String.valueOf(age).chars().mapToObj(operand -> String.valueOf((char) (49+operand))).collect(Collectors.joining());
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution(564));
    }

}
