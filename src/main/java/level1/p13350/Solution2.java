package level1.p13350;

public class Solution2 {

    public int solution(int[] ingredient) {
        int sp = 0, answer = 0;
        int[] stack = new int[ingredient.length];

        for (int i : ingredient) {
            stack[sp++] = i;
            if (sp >= 4 && stack[sp - 4] == 1
                        && stack[sp - 3] == 2
                        && stack[sp - 2] == 3
                        && stack[sp - 1] == 1) {
                    answer++;
                }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution(new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1}));
    }

}
