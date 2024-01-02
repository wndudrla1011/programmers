package level2.롤케이크자르기;

public class Solution2 {

    public int solution(int[] topping) {
        int answer = 0;
        int[] left = new int[10001], right = new int[10001];
        int ls = 0, rs = 0; //종류 수

        for (int i : topping) right[i]++;
        for (int i : right) rs += i > 0 ? 1 : 0;
        for (int i : topping) {
            right[i]--;
            if (right[i] == 0) rs--; //해당 토핑 소진
            if (left[i] == 0) ls++; //해당 토핑 등장
            left[i]++;
            if (ls == rs) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution(new int[]{1, 2, 1, 3, 1, 4, 1, 2}));
    }

}
