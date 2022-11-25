package course1125;

import java.util.Scanner;

public class Gcd2 {
    public static int gcd;
    public static void solution (int a, int b) {

        if (a == b) {
            gcd = a;
            return;
        } else if (a > b) {
            solution(a - b, b);
        } else
            solution(a, b - a);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solution(sc.nextInt(), sc.nextInt());
        System.out.println(gcd);
    }
}
