package level2.의상;

import java.util.*;

public class Solution {

    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>(); //<옷 종류, 개수>

        for (String[] clothe : clothes) {
            String type = clothe[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }

        Iterator<Integer> it = map.values().iterator();
        while (it.hasNext()) {
            answer *= it.next() + 1; //선택하지 않은 경우도 포함
        }

        return answer - 1; //모두 선택하지 않은 경우
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new String[][]{{"yellow_hat", "headgear"}
                , {"blue_sunglasses", "eyewear"}
                , {"green_turban", "headgear"}}));
    }

}
