package level2.전력망을둘로나누기;

public class Solution {

    static int[] UF; //union-find 배열

    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;

        for(int i = 0; i < wires.length; i++) {
            UF = new int[n + 1];//초기화
            for(int j = 0; j <= n; j++) UF[j] = j;

            for(int k = 0; k < wires.length; k++) {
                if(i == k) continue; //선하나 끊어보기

                union(wires[k][0], wires[k][1]); //트리 합치기
            }

            //두 트리의 차이값 확인
            int diff = checkTree(n);

            answer = Math.min(answer, diff);
        }

        return answer;
    }

    static int checkTree(int n) {
        int a = 0, b = 0;

        for (int i = 1; i <= n; i++) {
            //i번째 노드의 대표 노드가 1이면 a 증가
            if (find(UF[i]) == 1) a++;
        }

        b = n - a; //전체 노드 - 1을 대표로 하는 노드
        return Math.abs(a - b);
    }

    static void union(int a, int b) {
        int pa = find(a);
        int pb = find(b);
        if (pa < pb) UF[pb] = pa;
        else UF[pa] = pb;
    }

    static int find(int a) {
        if (a == UF[a]) return a;
        else return UF[a] = find(UF[a]);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(9, new int[][]{{1, 3}, {2, 3}, {3, 4}, {4, 5}, {4, 6}, {4, 7}, {7, 8}, {7, 9}}));
    }

}
