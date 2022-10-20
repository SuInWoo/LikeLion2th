package codeup.problem1011;

import java.util.Scanner;

public class Code1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long num2 = sc.nextLong();
        long num3 = sc.nextLong();

        System.out.println(num+num2+num3);
        System.out.printf("%.1f", (float)(num+num2+num3)/3);
    }
}
