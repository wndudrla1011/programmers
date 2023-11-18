package level2.JadenCase문자열만들기;

public class Solution {

    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] A = s.split(" ", -1);

        for (String elem : A) {
            if (elem.length() < 1) answer.append(" ");
            else {
                answer.append(elem.substring(0, 1).toUpperCase());
                answer.append(elem.substring(1).toLowerCase()).append(" ");
            }
        }

        return answer.substring(0, answer.length() - 1);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("  for the what 1what  "));
    }

}
