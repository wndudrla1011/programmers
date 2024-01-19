package level2.큰수만들기;

import java.util.*;

public class Solution {

    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        int len = number.length() - k - 1; //확보해야 하는 길이

        int s = 0, idx = 0;
        while (answer.length() < number.length() - k) {
            int max = Integer.MIN_VALUE;
            for (int i = s; i < number.length() - len; i++) {
                if (max < number.charAt(i) - 48) {
                    max = number.charAt(i) - 48;
                    idx = i;
                }
            }
            answer.append(max);
            len--;
            s = idx + 1;
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("4177252841", 4));
    }

}
