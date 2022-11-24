package course1124;

import java.util.Scanner;

public class Triangle {

    // 1 부터 n 까지 출력
    public static void printTriangle(int n) {
        if (n == 0)
            return;

        printTriangle(n-1);
        System.out.println(setString(n));
    }

    public static String setString(int n) {
        if (n == 0)
            return "";

        return setString(n-1) + n + " ";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printTriangle(sc.nextInt());
    }
}
