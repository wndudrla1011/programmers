package level0.잘라서배열로저장하기;

import java.util.Arrays;

public class Solution2 {

    public String[] solution(String my_str, int n) {
        int resultCnt = (my_str.length() + n - 1) / n;
        String[] answer = new String[resultCnt];

        for (int i = 0; i < resultCnt; i++) {
            int start = n * i;
            int end = Math.min(start + n, my_str.length());
            answer[i] = my_str.substring(start, end);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String[] result = s.solution("abcdef12345", 3);
        System.out.println(Arrays.toString(result));
    }

}
