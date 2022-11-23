package course1123;

import java.util.Scanner;

public class Fibonacci {

    public static long fibo(int n) {

        if (n == 2 || n == 1)
            return 1;

        return fibo(n-2) + fibo(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(fibo(sc.nextInt()));
    }
}
