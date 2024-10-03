package level0.p120912;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution2 {

    public int solution(int[] array) {
        return (int) Arrays.stream(
                        Arrays.stream(array)
                                .mapToObj(String::valueOf)
                                .collect(Collectors.joining())
                                .split("")
                )
                .filter(s -> s.equals("7"))
                .count();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int result = s.solution(new int[]{7, 77, 17});
        System.out.println(result);
    }

}
