package level1.p81301;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public int solution(String s) {
        int[] indexes = new int[50];
        Arrays.fill(indexes, -1);

        HashMap<String, Integer> map = new HashMap<>();

        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (s.contains(entry.getKey())) {
                int index = s.indexOf(entry.getKey());

                while (index != -1) {
                    indexes[index] = entry.getValue();
                    index = s.indexOf(entry.getKey(), index + entry.getKey().length());
                }
            }
            if (s.contains("" + entry.getValue())) {
                int index = s.indexOf("" + entry.getValue());

                while (index != -1) {
                    indexes[index] = entry.getValue();
                    index = s.indexOf("" + entry.getValue(), index + 1);
                }
            }
        }

        return Integer.parseInt(
                Arrays.stream(indexes).boxed()
                .filter(i -> i != -1)
                .map(String::valueOf)
                .collect(Collectors.joining()));
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("123123123"));
    }

}
