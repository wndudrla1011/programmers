package level1.p13349;

public class Solution {

    public int solution(String[] babbling) {
        int answer = 0;
        String[] babyWord = {"aya", "ye", "woo", "ma"};
        String[] duplicatedBab = {"ayaaya", "yeye", "woowoo", "mama"};

        for (String bab : babbling) {
            for (String dup : duplicatedBab) {
                bab = bab.replace(dup, "X");
            }
            for (String oBab : babyWord) {
                bab = bab.replace(oBab, "?");
            }

            int sign = 0;
            for (int i = 0; i < bab.length(); i++) {
                if (!bab.subSequence(i, i + 1).equals("?")) {
                    sign = 1;
                    break;
                }
            }
            if (sign == 0)
                answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new String[]{"wayaoayao", "yeyeyeye", "wooaya", "maa"}));
    }

}
