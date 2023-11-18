package level2.JadenCase문자열만들기;

public class Solution2 {

    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] A = s.toLowerCase().split("");
        boolean flag = true;

        for (String ss : A) {
            answer.append(flag ? ss.toUpperCase() : ss);
            flag = ss.equals(" ");
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution("  for the what 1what  "));
    }

}
