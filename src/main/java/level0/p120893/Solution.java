package level0.p120893;

public class Solution {

    public String solution(String my_string) {
        String answer = "";

        for (String alpha : my_string.split("")) {
            if (alpha.matches("[a-z]"))
                answer += alpha.toUpperCase();
            else
                answer += alpha.toLowerCase();
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("cccCCC"));
    }

}
