package level1.p92334;

import java.util.*;

public class Solution {

    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        //중복 내역 제거
        Set<String> newReport = new LinkedHashSet<>(Arrays.asList(report));

        //신고 내역 정리
        Map<String, Integer> map = new HashMap<>();
        for (String s : newReport) {
            String[] r = s.split(" ");
            for (int i = 0; i < id_list.length; i++) {
                if (r[0].equals(id_list[i])) {
                    answer[i]++;
                    break;
                }
            }
            map.put(r[1], map.getOrDefault(r[1], 0) + 1);
        }

        //처리 결과
        List<String> stopped_id = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= k)
                stopped_id.add(entry.getKey());
        }

        //알림 메일 횟수 계산
        for (String s : newReport) {
            String[] r = s.split(" ");
            for (int i = 0; i < id_list.length; i++) {
                if (r[0].equals(id_list[i]) && !stopped_id.contains(r[1]))
                    answer[i]--;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new String[]{"muzi", "frodo", "apeach", "neo"},
                new String[]{"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"}, 2)));
    }

}
