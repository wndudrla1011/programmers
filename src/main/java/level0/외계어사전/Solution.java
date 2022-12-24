package level0.외계어사전;

public class Solution {

    public int solution(String[] spell, String[] dic) {
        for (String d : dic) {
            int answer = 1;
            for (String s : spell) {
                if (!d.contains(s)) { //d.indexOf(s) == -1
                    answer = 0;
                    break;
                }
            }
            if (answer == 1)
                return answer;
        }

        return 2;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new String[]{"z", "d", "x"}, new String[]{"def", "dww", "dzx", "loveaw"}));
    }

}
