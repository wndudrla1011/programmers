package level0.p120822;

public class Solution {

    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();

        answer.append(my_string);

        return answer.reverse().toString();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("jaron"));
    }

}
