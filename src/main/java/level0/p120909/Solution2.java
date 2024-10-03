package level0.p120909;

public class Solution2 {

    public int solution(int n) {
        String[] slice = String.valueOf(Math.sqrt(n)).split("\\.");
        return slice[1].equals("0") ? 1 : 2;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        int result = s.solution(976);
        System.out.println(result);
    }

}
