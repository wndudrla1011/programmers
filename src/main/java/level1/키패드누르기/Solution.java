package level1.키패드누르기;

public class Solution {

    String answer = "";
    int[][] keypad = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {-1, 0, -2}};
    int[] left = {3, 0}, right = {3, 2};
    String hand;

    public String solution(int[] numbers, String hand) {
        this.hand = (hand.equals("right")) ? "R" : "L";
        for (int n : numbers) {
            keyMethod(n);
        }

        return answer;
    }

    private String keyMethod(int n) {
        for (int i = 0; i < keypad.length; i++) {
            for (int j = 0; j < keypad[0].length; j++) {
                if (keypad[i][j] == n) {
                    if (j == 0) {
                        moveHand(left, i, j);
                        return answer += "L";
                    } else if (j == 2) {
                        moveHand(right, i, j);
                        return answer += "R";
                    } else {
                        if (getDist(left, i, j) < getDist(right, i, j)) {
                            moveHand(left, i, j);
                            return answer += "L";
                        } else if (getDist(left, i, j) > getDist(right, i, j)) {
                            moveHand(right, i, j);
                            return answer += "R";
                        } else {
                            if (hand.equals("L")) {
                                moveHand(left, i, j);
                            } else {
                                moveHand(right, i, j);
                            }
                            return answer += hand;
                        }
                    }
                }
            }
        }
        return "";
    }

    private void moveHand(int[] hand, int pos1, int pos2) {
        hand[0] = pos1;
        hand[1] = pos2;
    }

    private int getDist(int[] pos, int pos1, int pos2) {
        return Math.abs(pos[0] - pos1) + Math.abs(pos[1] - pos2);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left"));
    }

}
