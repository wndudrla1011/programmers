package level_0;

import java.util.Arrays;

public class Babbling {

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

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        Babbling babbling = new Babbling();
        String[] input = {"aya", "yee", "u", "maa", "wyeoo"};
        babbling.solution(input);
    }

}