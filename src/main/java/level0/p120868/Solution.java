package level0.p120868;

public class Solution {

    public int solution(int[] sides) {
        return (sides[0] + sides[1]) - Math.abs(sides[0] - sides[1]) - 1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{1, 2}));
    }

}
