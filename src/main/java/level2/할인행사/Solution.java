package level2.할인행사;

import java.util.*;

public class Solution {

    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int total = want.length; //모든 품목 개수
        Map<String, Integer> wants = new HashMap<>(); //<품목, 개수> -> 입력
        Map<String, Integer> list = new HashMap<>(); //<품목, 개수> -> 윈도우

        int len = 0; //윈도우 크기
        for (int n : number) len += n;

        for (int i = 0; i < want.length; i++) {
            wants.put(want[i], number[i]);
        }

        int lt = 0, rt;
        for (rt = lt; rt < len; rt++) {
            list.put(discount[rt], list.getOrDefault(discount[rt], 0) + 1);
        }

        int ch; //모든 품목 체크 여부
        while (rt <= discount.length) {
            ch = 0;
            //윈도우와 구매 목록 비교
            for (Map.Entry<String, Integer> entry : list.entrySet()) {
                if (wants.containsKey(entry.getKey())) { //해당 과일 존재
                    if (wants.get(entry.getKey()) <= entry.getValue()) ch++; //개수가 구매 가능한가
                    else break;
                }
                if (ch == total) {
                    answer++;
                    break;
                }
            }
            if (rt == discount.length) break; //윈도우 끝
            //윈도우 이동
            list.put(discount[rt], list.getOrDefault(discount[rt], 0) + 1);
            rt++;
            list.put(discount[lt], list.getOrDefault(discount[lt], 0) - 1);
            if (list.get(discount[lt]) == 0) list.remove(discount[lt]);
            lt++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new String[]{"banana", "apple", "rice", "pork", "pot"},
                new int[]{3, 2, 2, 2, 1},
                new String[]{"chicken", "apple", "apple", "banana", "rice", "apple",
                        "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"}));
    }

}
