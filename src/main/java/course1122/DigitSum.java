package course1122;

import java.util.Scanner;

public class DigitSum {

    public static long rnt = 0;

    public static void digit(long n) {
        if (n/10 == 0) {
            rnt += n;
            return;
        }

        rnt += n%10;
        digit((n-n%10)/10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        digit(n);
        System.out.println(rnt);
    }
}
