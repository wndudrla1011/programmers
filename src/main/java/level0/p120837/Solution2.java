package level0.p120837;

public class Solution2 {

    public int solution(int hp) {
        int ant_5 = hp / 5;
        int ant_3 = (hp % 5) / 3;
        int ant_1 = (hp % 5) % 3;

        return ant_5 + ant_3 + ant_1;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution(24));
    }

}
