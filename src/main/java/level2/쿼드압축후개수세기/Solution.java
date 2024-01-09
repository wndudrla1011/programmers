package level2.쿼드압축후개수세기;

import java.util.Arrays;

public class Solution {

    static int[] answer = new int[2];

    public int[] solution(int[][] arr) {
        int init_size = arr.length / 2;

        for (int i = 0; i <= init_size; i += init_size) {
            for (int j = 0; j <= init_size; j += init_size) {
                compress(i, j, init_size, arr); //size : 압축 단위
            }
        }

        if (answer[0] == 0) answer[1] = 1;
        if (answer[1] == 0) answer[0] = 1;

        return answer;
    }

    static void compress(int r, int c, int size, int[][] A) {
        if (size == 1) {
            answer[A[r][c]]++;
            return;
        }
        boolean flag = true;
        for (int i = r; i < r + size; i++) {
            for (int j = c; j < c + size; j++) {
                if (A[i][j] != A[r][c]) {
                    flag = false;
                    for (int k = r; k <= r + size / 2; k += size / 2) {
                        for (int s = c; s <= c + size / 2; s += size / 2) {
                            compress(k, s, size / 2, A); //재압축
                        }
                    }
                    break;
                }
            }
            if (!flag) break;
        }
        if (flag) { //압축
            answer[A[r][c]]++;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[][]{{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}})));
//        System.out.println(Arrays.toString(s.solution(new int[][]{{1, 1, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 1}, {1, 1, 1, 1}})));
    }

}
