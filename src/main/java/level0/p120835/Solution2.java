package level0.p120835;

import java.util.*;
import java.util.stream.Collectors;

public class Solution2 {

    public int[] solution(int[] e) {
        return Arrays.stream(e)
                .map(i -> Arrays.stream(e).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).indexOf(i) + 1)
                .toArray();
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(Arrays.toString(s.solution(new int[]{3, 76, 24})));
    }

}
