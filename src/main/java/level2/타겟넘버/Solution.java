package level2.타겟넘버;

public class Solution {

    static int answer;
    static int N;
    static int[] ch;

    public int solution(int[] numbers, int target) {
        N = numbers.length;
        ch = new int[numbers.length];

        DFS(0, 0, 0, numbers, target);

        return answer;
    }

    public void DFS(int L, int sum, int start, int[] numbers, int target) {
        if (L == N) { //N개 조합
            if (sum == target) answer++;
        }
        else {
            for (int i = start; i < numbers.length; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    DFS(L + 1, sum - numbers[i], i + 1, numbers, target);
                    DFS(L + 1, sum + numbers[i], i + 1, numbers, target);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{1, 1, 1, 1, 1}, 3));
    }

}
