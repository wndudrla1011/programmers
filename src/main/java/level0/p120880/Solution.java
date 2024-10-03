package level0.p120880;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public int[] solution(int[] numlist, int n) {
        List<Integer> answer = new ArrayList<>();
        List<Integer> list = Arrays.stream(numlist).boxed().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int elem : list) {
            map.put(elem, Math.abs(n - elem));
        }

        List<Map.Entry<Integer, Integer>> sortedMap = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toList());

        for (Map.Entry<Integer, Integer> entry : sortedMap) {
            answer.add(entry.getKey());
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[]{10000, 20, 36, 47, 40, 6, 10, 7000}, 30)));
    }

}
