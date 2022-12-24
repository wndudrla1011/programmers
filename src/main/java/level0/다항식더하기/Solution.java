package level0.다항식더하기;

import java.util.*;

public class Solution {

    public String solution(String polynomial) {
        String answer = "";
        String[] p = polynomial.split(" ");
        List<Integer> operandX = new ArrayList<>();
        int operandNum = 0;

//        if (p.length == 1)
//            return p[0];

        for (String operand : p) {
            if (operand.endsWith("x")) {
                if (operand.equals("x")) {
                    operandX.add(1);
                    continue;
                }
                String param = operand.replace("x", "");
                operandX.add(Integer.parseInt(param));
            } else if (!(operand.contains("x") || operand.equals("+"))) {
                operandNum += Integer.parseInt(operand);
            }
        }

        StringJoiner expression = new StringJoiner(" ");
        int sumX = operandX.stream().mapToInt(Integer::intValue).sum();

        if (sumX == 1)
            expression.add("x");
        else if (sumX != 0)
            expression.add(sumX + "x");

        if (operandNum != 0) {
            if (expression.length() > 0)
                expression.add("+");
            expression.add(String.valueOf(operandNum));
        }

        return expression.toString();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("x"));
    }

}
