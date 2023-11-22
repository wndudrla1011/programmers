package level2.카펫;

import java.util.Arrays;

public class Solution {

    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int width_y = 0, height_y = 1; //yellow 블럭의 가로, 세로 길이

        while (true) { //yellow 블럭의 모양 찾기
            if (yellow % height_y == 0) {
                width_y = yellow / height_y;
                int sample = (width_y * 2) + 4 + (height_y * 2); //brown 블럭 개수
                if (sample == brown) break; //brown 블럭의 모양 찾음
            }
            height_y++;
        }

        answer[0] = width_y + 2;
        answer[1] = height_y + 2;

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(8, 1)));
    }

}
