package course1123;

import java.util.Scanner;

public class Fibonacci2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] arr = new long[n];

        arr[1] = 1;
        arr[2] = 1;

        for (int i = 3; i < n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }

        for (long l : arr) {
            System.out.printf("%d ", l);
        }
    }
}
