package level1.최소직사각형;

import java.util.Arrays;

public class Solution2 {

    public int solution(int[][] sizes) {
        return Arrays.stream(sizes).reduce((a, b) -> new int[]{
                Math.max(Math.max(a[0], a[1]), Math.max(b[0], b[1])), Math.max(Math.min(a[0], a[1]), Math.min(b[0], b[1]))
        }).map(it -> it[0] * it[1]).get();
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}}));
    }

}
