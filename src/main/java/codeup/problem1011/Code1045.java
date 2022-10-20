package codeup.problem1011;

import java.util.Scanner;

public class Code1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long num2 = sc.nextLong();

        System.out.println(num+num2);
        System.out.println(num-num2);
        System.out.println(num*num2);
        System.out.println(num/num2);
        System.out.println(num%num2);
        System.out.printf("%.2f \n", (float)num/(float) num2);
    }
}
