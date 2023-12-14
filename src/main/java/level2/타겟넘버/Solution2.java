package level2.타겟넘버;

public class Solution2 {

    public int solution(int[] numbers, int target) {
        return DFS(0, 0, numbers, target);
    }

    public int DFS(int L, int sum, int[] numbers, int target) {
        if (L == numbers.length) { //N개 조합
            if (sum == target) return 1;
            else return 0;
        }
        return DFS(L + 1, sum + numbers[L], numbers, target) + DFS(L + 1, sum - numbers[L], numbers, target);
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution(new int[]{1, 1, 1, 1, 1}, 3));
    }

}
