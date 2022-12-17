package level0.최빈값구하기;

import java.util.HashMap;

public class Solution2 {

    public int solution(int[] array) {
        int maxCount = 0;
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int number : array) {
            int count = map.getOrDefault(number, 0) + 1;
            if (count > maxCount) {
                maxCount = count;
                answer = number;
            } else if (count == maxCount) {
                answer = -1;
            }
            map.put(number, count);
        }
        
        return answer;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution(new int[]{1, 2, 3, 3, 3, 4}));
    }

}
