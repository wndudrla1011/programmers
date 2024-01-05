package level2.숫자변환하기;

import java.util.*;

public class Solution {

    static Queue<Integer> q = new LinkedList<>();
    static int op;
    static int[] ch = new int[1000001];

    public int solution(int x, int y, int n) {
        op = n;
        q.offer(y);
        ch[y] = 1;
        return BFS(0, x);
    }

    static int BFS(int L, int target) {
        while (!q.isEmpty()) {
            int loop_cnt = q.size();
            while (loop_cnt-- > 0) {
                int nx = q.poll();
                if (nx == target) return L;
                if (nx < target) continue;
                if (nx - op >= 0 && ch[nx - op] == 0) {
                    q.offer(nx - op);
                    ch[nx - op] = 1;
                }
                if (nx % 2 == 0 && ch[nx / 2] == 0) {
                    q.offer(nx / 2);
                    ch[nx / 2] = 1;
                }
                if (nx % 3 == 0 && ch[nx / 3] == 0) {
                    q.offer(nx / 3);
                    ch[nx / 3] = 1;
                }
            }
            L++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(2, 5, 4));
    }

}
