package level0;

public class TheNextNumber {

    public int solution(int[] common) {
        int answer = 0;

        if ((common[2] - common[1]) == (common[1] - common[0])) {
            System.out.println("등차수열");
            answer = common[common.length - 1] + (common[1] - common[0]);
        } else {
            System.out.println("등비수열");
            answer = common[common.length - 1] * (common[1] / common[0]);
        }

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        TheNextNumber theNextNumber = new TheNextNumber();
        theNextNumber.solution(new int[]{5, 20, 80, 320});
    }

}
