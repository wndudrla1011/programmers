package level2.메뉴리뉴얼;

import java.util.*;

public class Solution {

    static Map<String, Integer> map; //<조합, 개수>

    public List<String> solution(String[] orders, int[] course) {
        List<String> answer = new ArrayList<>();

        //각 문자열을 오름차순 정렬
        for (int i = 0; i < orders.length; i++) {
            char[] charArr = orders[i].toCharArray();
            Arrays.sort(charArr);
            orders[i] = String.valueOf(charArr);
        }

        for (int i = 0; i < course.length; i++) {
            map = new HashMap<>();
            int max = Integer.MIN_VALUE; //가장 많이 등장한 조합

            for (int j = 0; j < orders.length; j++) {
                StringBuilder sb = new StringBuilder();
                if (orders[j].length() >= course[i]) { //조합할 개수 이상의 주문을 가져야 함
                    Combination(0, 0, sb, orders[j], course[i]); //조합 탐색
                }
            }

            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                max = Math.max(max, entry.getValue());
            }

            //가장 많이 등장했고 2명 이상 주문한 조합
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (max >= 2 && max == entry.getValue()) answer.add(entry.getKey());
            }
        }

        Collections.sort(answer); //각 조합 오름차순

        return answer;
    }

    /*
    * L: 현재 길이
    * idx: 시작 인덱스
    * sb: 현재 조합 상태
    * order: 현재 주문
    * len: 조합할 개수
    * */
    static void Combination(int L, int idx, StringBuilder sb, String order, int len) {
        if (L == len) {
            map.put(sb.toString(), map.getOrDefault(sb.toString(), 0) + 1);
            return;
        }
        for (int i = idx; i < order.length(); i++) {
            sb.append(order.charAt(i));
            Combination(L + 1, i + 1, sb, order, len);
            sb.delete(L, L + 1);
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new String[]{"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"}, new int[]{2, 3, 4}));
    }

}
