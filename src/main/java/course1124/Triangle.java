package course1124;

import java.util.Scanner;

public class Triangle {

    public static void printTriangle(int n) {

        if (n == 0) {
            return;
        }
        printTriangle(n-1);
        System.out.printf("%d ", n);
    }

    public static void solution(int start, int end) {

        if (start == end)
            return;

        start++;
        printTriangle(start);
        System.out.println();
        solution(start, end);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        solution(0, a);
    }
}
