package level2.영어끝말잇기;

import java.util.*;

public class Solution {

    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        List<String> dict = new ArrayList<>();

        dict.add(words[0]);
        for (int i = 1; i < words.length; i++) {
            char prev = words[i - 1].charAt(words[i - 1].length() - 1);
            char cur = words[i].charAt(0);
            if (prev != cur || dict.contains(words[i])) {
                answer[0] = i % n + 1;
                answer[1] = (int) Math.ceil((double) (i + 1) / n);
                break;
            }
            dict.add(words[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"})));
    }

}
