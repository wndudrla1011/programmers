package level0.p120880;

import java.util.*;

public class Solution3 {

    public int[] solution(int[] numlist, int n) {
        int size = numlist.length;
        for (int i = 0; i < size; i++) {
            for (int k = i + 1; k < size; k++) {
                int a = Math.abs(numlist[i] - n);
                int b = Math.abs(numlist[k] - n);
                if (a > b || (a == b && numlist[i] < numlist[k])) {
                    int temp = numlist[i];
                    numlist[i] = numlist[k];
                    numlist[k] = temp;
                }
            }
        }

        return numlist;
    }

    public static void main(String[] args) {
        Solution3 s = new Solution3();
        System.out.println(Arrays.toString(s.solution(new int[]{10000, 20, 36, 47, 40, 6, 10, 7000}, 30)));
    }

}
