package level2.기능개발;

import java.util.*;

public class Solution2 {

    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = new int[100];
        int day = -1;

        for(int i = 0; i < progresses.length; i++) {
            while (progresses[i] + (day * speeds[i]) < 100) {
                day++;
            }
            answer[day]++;
        }

        return Arrays.stream(answer).filter(i -> i!=0).toArray();
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(Arrays.toString(s.solution(new int[]{93, 30, 55}, new int[]{1, 30, 5})));
    }

}
