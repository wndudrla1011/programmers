package level1.신고결과받기;

import java.util.*;
import java.util.stream.Collectors;

public class Solution2 {

    public int[] solution(String[] id_list, String[] report, int k) {
        List<String> list = Arrays.stream(report).distinct().collect(Collectors.toList()); //중복된 신고 내역 제거
        HashMap<String, Integer> map = new HashMap<>(); //누적 신고 계산
        for (String s : list) {
            String target = s.split(" ")[1];
            map.put(target, map.getOrDefault(target, 0) + 1);
        }

        //id_list에 맞게 신고자 기준 카운팅
        return Arrays.stream(id_list).map(_user -> {
            final String user = _user;
            List<String> reportList = list.stream().filter(s -> s.startsWith(user + " ")).collect(Collectors.toList());
            return reportList.stream().filter(s -> map.getOrDefault(s.split(" ")[1], 0) >= k).count();
        }).mapToInt(Long::intValue).toArray();
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(Arrays.toString(s.solution(new String[]{"muzi", "frodo", "apeach", "neo"},
                new String[]{"muzi frodo","muzi frodo","frodo neo","muzi neo","apeach muzi"}, 2)));
    }

}
