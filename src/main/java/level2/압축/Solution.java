package level2.압축;

import java.util.*;

public class Solution {

    public List<Integer> solution(String msg) {
        List<Integer> answer = new ArrayList<>();
        Map<String, Integer> dict = new HashMap<>();

        char tmp = 'A';
        int idx;
        for (idx = 1; idx <= 26; idx++) {
            dict.put(tmp + "", idx);
            tmp++;
        }

        int start = 0, end = 1;
        while (end <= msg.length()) {
            while (dict.containsKey(msg.substring(start, end))) { //사전에 존재
                end++;
                if (end > msg.length()) { //msg 끝까지 감 => 종료
                    answer.add(dict.get(msg.substring(start)));
                    break;
                }
            }
            if (end > msg.length()) break;
            dict.put(msg.substring(start, end), idx++); //새로운 단어 -> 사전에 등록
            answer.add(dict.get(msg.substring(start, end - 1))); //사전에 존재하는 단어 출력
            start = end - 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("KAKAO"));
    }

}
