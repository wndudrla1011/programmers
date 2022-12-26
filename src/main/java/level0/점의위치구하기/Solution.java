package level0.점의위치구하기;

public class Solution {

    public int solution(int[] dot) {
        if (dot[0] > 0 && dot[1] > 0)
            return 1;
        else if (dot[0] < 0 && dot[1] > 0)
            return 2;
        else if (dot[0] < 0 && dot[1] < 0)
            return 3;
        else
            return 4;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{2, 4}));
    }

}
