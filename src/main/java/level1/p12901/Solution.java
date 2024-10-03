package level1.p12901;

public class Solution {

    public String solution(int a, int b) {
        int[] date_of_month = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = new String[]{"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};

        int date_of_year = 0;
        for (int i = 0; i < a - 1; i++) {
            date_of_year += date_of_month[i];
        }

        return day[(date_of_year + b) % 7];
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(5, 24));
    }

}
