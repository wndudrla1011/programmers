package level2.주차요금계산;

import java.util.*;

public class Solution2 {

    public int timeToInt(String time) {
        String[] temp = time.split(":");
        return Integer.parseInt(temp[0]) * 60 + Integer.parseInt(temp[1]);
    }

    public int[] solution(int[] fees, String[] records) {
        TreeMap<String, Integer> map = new TreeMap<>(); //<차량 번호, 시간>

        //우선순위 큐 <- 파싱
        for (String r : records) {
            String[] info = r.split(" ");
            int time = info[2].equals("IN") ? -1 : 1;
            time *= timeToInt(info[0]);
            map.put(info[1], map.getOrDefault(info[1], 0) + time);
        }

        int idx = 0;
        int[] ans = new int[map.size()];

        for (int time : map.values()) {
            if (time < 1) time += 1439; //출차 기록x
            time -= fees[0]; //기본 시간
            int cost = fees[1]; //기본 요금
            if (time > 0) //요금 계산
                cost += (time % fees[2] == 0 ? time / fees[2] : time / fees[2] + 1) * fees[3]; //올림 처리
            ans[idx++] = cost;
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(Arrays.toString(s.solution(new int[]{120, 0, 60, 591}
                , new String[]{"16:00 3961 IN", "16:00 0202 IN", "18:00 3961 OUT", "18:00 0202 OUT", "23:58 3961 IN"})));
    }

}
