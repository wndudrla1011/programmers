package level2.오픈채팅방;

import java.util.*;

public class Solution {

    public List<String> solution(String[] records) {
        List<String> answer = new ArrayList<>();
        List<String[]> lists = new ArrayList<>(); //<ID, index>
        Map<String, String> map = new HashMap<>(); //<ID, Nickname>

        for (String record : records) {
            String[] str = record.split(" ");
            if (str[0].equals("Enter")) {
                map.put(str[1], str[2]);
                lists.add(new String[]{str[1], "1"});
            } else if (str[0].equals("Leave")) {
                lists.add(new String[]{str[1], "2"});
            } else {
                map.put(str[1], str[2]);
            }
        }

        for (String[] list : lists) {
            if (list[1].equals("1")) answer.add(map.get(list[0]) + "님이 들어왔습니다.");
            else answer.add(map.get(list[0]) + "님이 나갔습니다.");
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"}));
    }

}
