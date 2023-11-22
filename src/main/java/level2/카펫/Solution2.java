package level2.카펫;

import java.util.Arrays;

public class Solution2 {

    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int allNum = brown + yellow; //가로 * 세로
        int height = 0; //세로 길이

        for (int width = 1; width < brown; width++) {
            height = allNum / width;
            if (((width - 2) * (height - 2)) == yellow) {
                answer[0] = width;
                answer[1] = height;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(Arrays.toString(s.solution(24, 24)));
    }

}
