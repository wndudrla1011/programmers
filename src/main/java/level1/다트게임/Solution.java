package level1.다트게임;

import java.util.Arrays;

public class Solution {

    public int solution(String dartResult) {
        int[] score = new int[3];
        int stage = 0, digit = 0;

        for (String d : dartResult.split("")) {
            if (d.matches("[0-9]")) {
                if (digit == 1) {
                    score[stage - 1] = 10;
                    continue;
                }
                score[stage++] = Integer.parseInt(d);
                digit = 1;
                continue;
            }else{
                digit = 0;
                if (d.equals("D")) {
                    score[stage - 1] = (int) Math.pow(score[stage - 1], 2);
                    continue;
                }
                if (d.equals("T")) {
                    score[stage - 1] = (int) Math.pow(score[stage - 1], 3);
                    continue;
                }
                if (d.equals("*")) {
                    for (int i = stage - 1; i >= stage - 2; i--) {
                        if (i < 0) break;
                        score[i] *= 2;
                    }
                    continue;
                }
                if (d.equals("#")) score[stage - 1] *= -1;
            }

        }

        return Arrays.stream(score).sum();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("1D2S3T*"));
    }

}
