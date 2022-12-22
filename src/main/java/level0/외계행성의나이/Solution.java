package level0.외계행성의나이;

public class Solution {

    public String solution(int age) {
        StringBuilder answer = new StringBuilder();
        String[] alpha = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};

        while (age > 0) {
            answer.append(alpha[age % 10]);
            age /= 10;
        }

        return answer.reverse().toString();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(564));
    }

}
