package level0.p120885;

public class Solution {

    public String solution(String bin1, String bin2) {
        StringBuilder answer = new StringBuilder();
        int binSum = 0;

        int i = 1;
        for (String bin : bin1.split("")) {
            binSum += Integer.parseInt(bin) * (int) Math.pow(2, bin1.length() - i++);
        }

        int j = 1;
        for (String bin : bin2.split("")) {
            binSum += Integer.parseInt(bin) * (int) Math.pow(2, bin2.length() - j++);
        }

        while (binSum > 0) {
            answer.append(binSum % 2);
            binSum /= 2;
        }

        return answer.length() != 0 ? answer.reverse().toString() : "0";
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("10", "11"));
    }

}
