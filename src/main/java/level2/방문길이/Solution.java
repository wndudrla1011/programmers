package level2.방문길이;

import java.util.ArrayList;

public class Solution {

    static Point cur = new Point(5, 5);
    static ArrayList<Point>[][] ch = new ArrayList[11][11];
    static int answer;

    public int solution(String dirs) {
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                ch[i][j] = new ArrayList<>();
            }
        }

        for (char dir : dirs.toCharArray()) {
            moves(dir);
        }

        return answer;
    }

    static void moves(char dir) {
        boolean flag = false;
        switch (dir) {
            case 'U':
                if (cur.y + 1 < 11) {
                    for (Point point : ch[cur.y][cur.x]) {
                        if (point.y == cur.y + 1 && point.x == cur.x) {
                            flag = true;
                            break;
                        }
                    }
                    if (!flag) {
                        ch[cur.y][cur.x].add(new Point(cur.y + 1, cur.x));
                        ch[cur.y + 1][cur.x].add(new Point(cur.y, cur.x));
                        answer++;
                    }
                    cur.y = cur.y + 1;
                }
                break;
            case 'D':
                if (cur.y - 1 >= 0) {
                    for (Point point : ch[cur.y][cur.x]) {
                        if (point.y == cur.y - 1 && point.x == cur.x) {
                            flag = true;
                            break;
                        }
                    }
                    if (!flag) {
                        ch[cur.y][cur.x].add(new Point(cur.y - 1, cur.x));
                        ch[cur.y - 1][cur.x].add(new Point(cur.y, cur.x));
                        answer++;
                    }
                    cur.y = cur.y - 1;
                }
                break;
            case 'L':
                if (cur.x - 1 >= 0) {
                    for (Point point : ch[cur.y][cur.x]) {
                        if (point.y == cur.y && point.x == cur.x - 1) {
                            flag = true;
                            break;
                        }
                    }
                    if (!flag) {
                        ch[cur.y][cur.x].add(new Point(cur.y, cur.x - 1));
                        ch[cur.y][cur.x - 1].add(new Point(cur.y, cur.x));
                        answer++;
                    }
                    cur.x = cur.x - 1;
                }
                break;
            case 'R':
                if (cur.x + 1 < 11) {
                    for (Point point : ch[cur.y][cur.x]) {
                        if (point.y == cur.y && point.x == cur.x + 1) {
                            flag = true;
                            break;
                        }
                    }
                    if (!flag) {
                        ch[cur.y][cur.x].add(new Point(cur.y, cur.x + 1));
                        ch[cur.y][cur.x + 1].add(new Point(cur.y, cur.x));
                        answer++;
                    }
                    cur.x = cur.x + 1;
                }
                break;
        }
    }

    static class Point {
        int y;
        int x;

        public Point(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("ULURRDLLU"));
    }

}
