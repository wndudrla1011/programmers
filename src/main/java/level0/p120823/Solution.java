package level0.p120823;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            String star = "*";
            System.out.println(star.repeat(i));
        }
    }

}
