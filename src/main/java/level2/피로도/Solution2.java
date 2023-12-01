package level2.피로도;

public class Solution2 {

    static int[] ch;
    static int answer, DUNGEONS_CNT;

    public int solution(int k, int[][] dungeons) {
        DUNGEONS_CNT = dungeons.length;
        ch = new int[DUNGEONS_CNT];

        DFS(k, dungeons, 0);

        return answer;
    }

    static void DFS(int tired, int[][] dungeons, int cnt) {
        for (int i = 0; i < DUNGEONS_CNT; i++) {
            if (ch[i] == 0 && tired >= dungeons[i][0]) {
                ch[i] = 1;
                DFS(tired - dungeons[i][1], dungeons, cnt + 1);
                ch[i] = 0;
            }
        }
        answer = Math.max(answer, cnt);
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution(80, new int[][]{{80, 20}, {50, 40}, {30, 10}}));
    }

}
