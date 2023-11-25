package level2.연속부분수열합의개수;

import java.util.*;

public class Solution {

    public int solution(int[] elements) {
        int[] newElements = new int[elements.length * 2];
        Set<Integer> set = new HashSet<>(); //연속 부분 수열의 합 개수

        for (int i = 0; i < elements.length; i++) {
            newElements[i] = newElements[i + elements.length] = elements[i];
        }

        for (int i = 1; i <= elements.length; i++) { //연속 부분 수열의 길이
            for (int j = 0; j < elements.length; j++) { //시작점
                set.add(Arrays.stream(newElements, j, j + i).sum());
            }
        }

        return set.size();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{7, 9, 1, 1, 4}));
    }

}
