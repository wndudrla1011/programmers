package level2.피로도;

public class Solution {

    static int[] ch, P;
    static int answer, DUNGEONS_CNT, remains;

    public int solution(int k, int[][] dungeons) {
        DUNGEONS_CNT = dungeons.length;
        remains = k;
        ch = new int[DUNGEONS_CNT];
        P = new int[DUNGEONS_CNT];

        DFS(0, k, dungeons);

        return answer;
    }

    static void DFS(int L, int remains, int[][] dungeons) {
        if (L == DUNGEONS_CNT) {
            int cnt = 0;
            for (int i : P) { //던전 탐색
                if (remains >= dungeons[i][0]) { //탐색 가능
                    remains -= dungeons[i][1]; //피로도 누적
                    cnt++;
                }
                else break;
            }
            answer = Math.max(answer, cnt); //최대 탐색 개수
        }
        else { //순열 구하기
            for (int i = 0; i < DUNGEONS_CNT; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    P[L] = i;
                    DFS(L + 1, remains, dungeons);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(80, new int[][]{{80, 20}, {50, 40}, {30, 10}}));
    }

}
