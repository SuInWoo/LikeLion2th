package course1123;

import java.util.Scanner;

public class Factorial {

    public static int fac(int n) {
        if (n == 1)
            return 1;

        return fac(n-1) * n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(fac(sc.nextInt()));
    }
}
