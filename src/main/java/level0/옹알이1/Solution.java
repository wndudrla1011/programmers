package level0.옹알이1;

public class Solution {

    public int solution(String[] babbling) {
        int answer = 0;

        String[] bab = {"aya", "ye", "woo", "ma"};
        String[] duplicatedBab = {"ayaaya", "yeye", "woowoo", "mama"};

        for (String oBab : babbling) {
            for (String dBab : duplicatedBab) {
                oBab = oBab.replace(dBab, "X");
            }

            for (String b : bab) {
                oBab = oBab.replace(b, "?");
            }

            int signal = 0;
            for (int i = 0; i < oBab.length(); i++) {
                if (!oBab.subSequence(i, i + 1).equals("?")) {
                    signal = 1;
                    break;
                }
            }

            if (signal == 0) {
                answer++;
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String[] input = {"aya", "yee", "u", "maa", "wyeoo"};
        int result = s.solution(input);
        System.out.println(result);
    }

}