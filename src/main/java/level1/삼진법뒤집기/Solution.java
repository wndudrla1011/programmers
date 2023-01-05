package level1.삼진법뒤집기;

import java.util.Arrays;

public class Solution {

    public int solution(int n) {
        int answer = 0, idx = 0;

        int i = 0;
        while (n >= Math.pow(3, i)) {
            idx = i++;
        }

        String[] temp = new String[idx + 1];
        Arrays.fill(temp, String.valueOf(0));

        for (int k = idx; k >= 0; k--) {
            int x = 1;
            while (n >= x * Math.pow(3, k)) {
                x++;
            }
            n -= ((x - 1) * Math.pow(3, k));
            temp[k] = String.valueOf(x - 1);
            if (n == 0) break;
        }

        idx = temp.length - 1;
        for (String num : temp) {
            answer += Integer.parseInt(num) * Math.pow(3, idx--);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(1));
    }

}
