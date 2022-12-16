package level0.문자열계산하기;

public class Solution {

    public int solution(String my_string) {
        int answer = 0;
        String[] s = my_string.split(" ");

        int sign = 1;
        for (String op : s) {
            if (op.equals("+"))
                sign = 1;
            else if (op.equals("-")) {
                sign = -1;
            } else {
                answer += sign * Integer.parseInt(op);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("20000 - 4000 + 5000"));
    }

}
