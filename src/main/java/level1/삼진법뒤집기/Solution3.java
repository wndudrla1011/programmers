package level1.삼진법뒤집기;

public class Solution3 {

    public int solution(int n) {
        int answer = 0;
        String third = Integer.toString(n, 3);
        StringBuilder sb = new StringBuilder(third);
        String reversed = sb.reverse().toString();

        int exp = 0;
        for (int i = reversed.length() - 1; i >= 0; i--) {
            answer += Integer.parseInt(String.valueOf(reversed.charAt(i))) * Math.pow(3, exp);
            exp++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution3 s = new Solution3();
        System.out.println(s.solution(125));
    }

}
