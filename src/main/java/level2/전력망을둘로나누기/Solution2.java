package level2.전력망을둘로나누기;

import java.util.ArrayList;

public class Solution2 {

    static ArrayList<Integer>[] A; //인접리스트

    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE; //최소 차이
        A = new ArrayList[n + 1];

        for (int i = 1; i <= n; i++) {
            A[i] = new ArrayList<>();
        }

        for (int[] wire : wires) {
            int v1 = wire[0];
            int v2 = wire[1];

            A[v1].add(v2);
            A[v2].add(v1);
        }

        for (int[] wire : wires) {
            int v1 = wire[0];
            int v2 = wire[1];

            boolean[] visited = new boolean[n + 1];

            //선 하나 disconnect
            A[v1].remove(Integer.valueOf(v2));
            A[v2].remove(Integer.valueOf(v1));

            //각 트리의 연결 노드 개수
            int a = DFS(1, visited);
            int b = n - a;
            int diff = Math.abs(a - b);

            answer = Math.min(answer, diff);

            //복구
            A[v1].add(v2);
            A[v2].add(v1);
        }

        return answer;
    }

    static int DFS(int v, boolean[] visited) {
        visited[v] = true;
        int cnt = 1;

        for (int next : A[v]) {
            if (!visited[next]) cnt += DFS(next, visited);
        }

        return cnt;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(9, new int[][]{{1, 3}, {2, 3}, {3, 4}, {4, 5}, {4, 6}, {4, 7}, {7, 8}, {7, 9}}));
    }

}
