package level0.p120864;

import java.util.Arrays;

public class Solution {

    public int solution(String my_string) {
        int answer = 0;

        String[] masking = Arrays.stream(my_string.split("")).map(s -> s.replaceAll("[^0-9]", "*")).toArray(String[]::new);
        String temp = "";

        for (String s : masking) {
            if (!s.equals("*")) {
                temp += s;
            } else if (!temp.equals("")) {
                answer += Integer.parseInt(temp);
                temp = "";
            }
        }

        if (temp.length() > 0)
            answer += Integer.parseInt(temp);

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("11111"));
    }

}
