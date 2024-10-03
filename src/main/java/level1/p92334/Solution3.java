package level1.p92334;

import java.util.*;

public class Solution3 {

    public int[] solution(String[] id_list, String[] report, int k) {
        //key : 신고 당한 자, value : 몇 명이 신고했는지
        HashMap<String, Set<String>> map = new HashMap<>();

        for (String rep : report) {
            String[] arr = rep.split(" ");
            Set<String> set = map.getOrDefault(arr[1], new HashSet<>());
            set.add(arr[0]);
            map.put(arr[1], set);
        }

        //key : 알림 받을 사람, value : 몇 번 알림 받을지
        Map<String, Integer> countMap = new LinkedHashMap<>();

        for (String id : id_list) {
            countMap.put(id, 0);
        }

        for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
            if (entry.getValue().size() >= k) {
                for (String value : entry.getValue()) {
                    countMap.put(value, countMap.getOrDefault(value, 0) + 1);
                }
            }
        }

        return countMap.values().stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Solution3 s = new Solution3();
        System.out.println(Arrays.toString(s.solution(new String[]{"muzi", "frodo", "apeach", "neo"},
                new String[]{"muzi frodo","muzi frodo","frodo neo","muzi neo","apeach muzi"}, 2)));
    }

}
