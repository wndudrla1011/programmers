package level1.키패드누르기;

public class Solution2 {

    //        0부터 9까지 좌표 {y,x}
    int[][] numpadPos = {
            {3,1}, //0
            {0,0}, //1
            {0,1}, //2
            {0,2}, //3
            {1,0}, //4
            {1,1}, //5
            {1,2}, //6
            {2,0}, //7
            {2,1}, //8
            {2,2}  //9
    };

    //초기 위치
    int[] leftPos = {3, 0}, rightPos = {3, 2};
    String hand;

    public String solution(int[] numbers, String hand) {
        this.hand = (hand.equals("right")) ? "R" : "L";

        String answer = "";
        for (int n : numbers) {
            String result = pushNumber(n);
            answer += result;

            if (result.equals("L")) { leftPos = numpadPos[n]; continue; }
            if (result.equals("R")) { rightPos = numpadPos[n]; continue; }
        }

        return answer;
    }

    //n 버튼을 누를 때 어디 손을 사용하는가
    private String pushNumber(int n) {
        if (n == 1 || n == 4 || n == 7) return "L";
        if (n == 3 || n == 6 || n == 9) return "R";

        // 2,5,8,0 일때 어디 손가락이 가까운가
        if (getDist(leftPos, n) > getDist(rightPos, n)) return "R";
        if (getDist(leftPos, n) < getDist(rightPos, n)) return "L";

        //같으면 손잡이
        return this.hand;
    }

    private int getDist(int[] pos, int num) {
        return Math.abs(pos[0] - numpadPos[num][0]) + Math.abs(pos[1] - numpadPos[num][1]);
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution(new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left"));
    }

}
