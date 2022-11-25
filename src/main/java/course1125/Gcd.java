package course1125;

import java.util.Scanner;

public class Gcd {

    public static int solution (int a, int b) {

        while (a != b) {
            if (a > b)
                a -= b;
            else
                b -= a;
        }

        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solution(sc.nextInt(), sc.nextInt()));
    }
}
