package level2.방문길이;

import java.util.*;

public class Solution2 {

    public int solution(String dirs) {
        Map<String, int[]> map = new HashMap<>(); //각 방향에 대한 이동 거리
        map.put("U", new int[]{0, 1});
        map.put("D", new int[]{0, -1});
        map.put("R", new int[]{1, 0});
        map.put("L", new int[]{-1, 0});

        String[] arr = dirs.split("");

        Set<String> set = new HashSet<>(); //"출발도착", "도착출발"
        int cx = 0; //현재 x 좌표
        int cy = 0; //현재 y 좌표

        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];

            int x = map.get(s)[0];
            int y = map.get(s)[1];

            cx += x;
            cy += y;

            if (cx < -5 || cx > 5) {
                cx -= x;
                continue;
            }

            if (cy < -5 || cy > 5) {
                cy -= y;
                continue;
            }

            set.add("" + (cx - x) + "" + (cy - y) + "" + (cx) + "" + cy);
            set.add("" + cx + "" + cy + "" + (cx - x) + "" + (cy - y));
        }

        return set.size() / 2;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution("ULURRDLLU"));
    }

}
