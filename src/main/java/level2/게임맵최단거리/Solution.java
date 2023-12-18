package level2.게임맵최단거리;

import java.util.*;

public class Solution {

    static int[] dy = {-1, 1, 0, 0};
    static int[] dx = {0, 0, -1, 1};
    static Queue<int[]> q = new LinkedList<>();
    static int n, m, answer = Integer.MAX_VALUE;
    static int[][] visited;

    public int solution(int[][] maps) {
        n = maps.length - 1;
        m = maps[0].length - 1;
        visited = new int[n + 1][m + 1];

        visited[0][0] = 1;
        q.offer(new int[]{0, 0});
        BFS(maps);

        return answer != Integer.MAX_VALUE ? answer : -1;
    }

    static void BFS(int[][] A) {
        while (!q.isEmpty()) {
            int[] next = q.poll();
            int y = next[0];
            int x = next[1];
            if (y == n && x == m) answer = Math.min(answer, visited[y][x]);
            for (int i = 0; i < 4; i++) {
                int ny = y + dy[i];
                int nx = x + dx[i];
                if (ny < 0 || ny > n || nx < 0 || nx > m) continue;
                if (A[ny][nx] == 1 && visited[ny][nx] == 0) {
                    visited[ny][nx] = visited[y][x] + 1;
                    q.offer(new int[]{ny, nx});
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[][]{{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}}));
    }

}
