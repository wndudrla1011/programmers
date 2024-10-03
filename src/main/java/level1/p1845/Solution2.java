package level1.p1845;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution2 {

    public int solution(int[] nums) {
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.collectingAndThen(Collectors.toSet(),
                        phonekemons -> Integer.min(phonekemons.size(), nums.length / 2)));
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution(new int[]{3, 3, 3, 2, 2, 4}));
    }

}
