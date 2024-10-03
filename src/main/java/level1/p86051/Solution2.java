package level1.p86051;

public class Solution2 {

    public int solution(int[] numbers) {
        int sum = 45;

        for (int num : numbers) {
            sum -= num;
        }

        return sum;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution(new int[]{1, 2, 3, 4, 6, 7, 8, 0}));
    }

}
