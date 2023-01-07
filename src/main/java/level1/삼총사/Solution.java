package level1.삼총사;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {

    static int[] check;
    static int cnt = 0;

    public int solution(int[] number) {
        check = new int[number.length];
        Arrays.fill(check, 0);

        return search(0, number);
    }

    public static int search(int n, int[] num) {
        if (n == num.length) {
            if (IntStream.range(0, num.length).filter(i -> check[i] == 1).count() == 3) {
                int sum = 0 ;
                for (int i = 0; i < num.length; i++) {
                    if (check[i] == 1) {
                        sum += num[i];
                    }
                }
                return sum == 0 ? ++cnt : cnt;
            }
            else return 0;
        }
        if (IntStream.range(0, num.length).filter(i -> check[i] == 1).count() == 3) {
            int sum = 0 ;
            for (int i = 0; i < num.length; i++) {
                if (check[i] == 1) {
                    sum += num[i];
                }
            }
            return sum == 0 ? ++cnt : cnt;
        }
        else {
            check[n] = 1;
            search(n + 1, num);
            check[n] = 0;
            search(n + 1, num);
        }
        return cnt;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{-2, 3, 0, 2, -5}));
    }

}
