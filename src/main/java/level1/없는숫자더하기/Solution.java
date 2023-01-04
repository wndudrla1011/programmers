package level1.없는숫자더하기;

import java.util.*;

public class Solution {

    public int solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));

        for (int num : numbers) {
            set.remove(num);
        }

        return set.stream().mapToInt(Integer::intValue).sum();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{1, 2, 3, 4, 6, 7, 8, 0}));
    }

}
