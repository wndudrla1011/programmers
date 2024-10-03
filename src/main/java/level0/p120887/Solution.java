package level0.p120887;

import java.util.Arrays;

public class Solution {

    public int solution(int i, int j, int k) {
        StringBuilder check = new StringBuilder();

        for (int init = i; init <= j; init++) {
            check.append(init);
        }

        return (int) Arrays.stream(check.toString().split("")).filter(e -> e.equals("" + k)).count();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(1, 13, 1));
    }

}
