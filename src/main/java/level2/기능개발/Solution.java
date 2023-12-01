package level2.기능개발;

import java.util.*;

public class Solution {

    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer;
        List<Integer> list = new ArrayList<>();
        int lt = 0, rt = 0;

        for (int i = 0; i < progresses.length; i++) {
            progresses[i] = 100 - progresses[i];
            if (progresses[i] % speeds[i] > 0)
                progresses[i] = progresses[i] / speeds[i] + 1;
            else progresses[i] = progresses[i] / speeds[i];
        }

        int cnt = 0;
        while (rt < progresses.length) {
            if (progresses[lt] >= progresses[rt]) {
                cnt++; rt++;
            }
            else {
                list.add(cnt);
                cnt = 0;
                lt = rt;
            }
        }

        if (cnt > 0) list.add(cnt);

        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[]{93, 30, 55}, new int[]{1, 30, 5})));
    }

}
