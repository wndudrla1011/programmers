package level2.소수찾기;

import java.util.*;

public class Solution {

    static int[] ch = new int[7];
    static int answer;
    static Set<Integer> set = new HashSet<>();

    public int solution(String numbers) {
        String[] piece = numbers.split("");

        DFS("", piece.length, piece);

        for (int number : set) {
            if (number == 2) answer++;
            if (number % 2 != 0 && Prime(number)) answer++;
        }

        return answer;
    }

    static void DFS(String cur, int len, String[] numbers) {
        if (cur.length() > 0) set.add(Integer.parseInt(cur));
        for (int i = 0; i < len; i++) {
            if (ch[i] == 0) {
                int next = Integer.parseInt(cur + Integer.parseInt(numbers[i]));
                ch[i] = 1;
                DFS(next + "", len, numbers);
                ch[i] = 0;
            }
        }
    }

    static boolean Prime(int n) {
        if (n < 2) return false;
        else {
            for (int i = 3; i <= Math.sqrt(n); i+=2) {
                if (n % i == 0) return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("17"));
    }

}
