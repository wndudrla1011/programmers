package level0.p120843;

public class Solution2 {

    public int solution(int[] numbers, int k) {
        return (k * 2 - 1) % numbers.length; //번호 규칙1
//        return (k - 1) * 2 % numbers.length + 1; //번호 규칙2
//        return numbers[((1 + (k - 1) * 2) % numbers.length) - 1]; //인덱스 규칙
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution(new int[]{1, 2, 3, 4}, 2));
    }

}
