package level0.k의개수;

import java.util.Arrays;

public class Solution2 {

    public int solution(int i, int j, int k) {
        String check = "";

        for (int init = i; init <= j; init++) {
            check += init + "";
        }

        return check.length() - check.replace(k + "", "").length();
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution(1, 13, 1));
    }

}
