package level1.시저암호;

public class Solution {

    public String solution(String s, int n) {
        String answer = "";

        for (char alpha : s.toCharArray()) {
            int convert = 0;
            if (String.valueOf(alpha).equals(" ")) {
                answer += " ";
                continue;
            }
            else {
                if (String.valueOf(alpha).matches("[A-Z]")) {
                    if (alpha + n > 90)
                        convert = alpha + n - 26;
                    else
                        convert = alpha + n;
                } else {
                    if (alpha + n > 122)
                        convert = alpha + n - 26;
                    else
                        convert = alpha + n;
                }
                answer += String.valueOf((char) convert);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("zXz", 25));
    }

}
