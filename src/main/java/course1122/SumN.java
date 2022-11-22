package course1122;

import java.util.Scanner;

public class SumN {

    public static int rnt = 0;
    public static void sum(int n) {
        if (n == 0)
            return;

        rnt += n;
        sum(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sum(n);
        System.out.println(rnt);
    }
}
