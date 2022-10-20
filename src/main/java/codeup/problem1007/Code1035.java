package codeup.problem1007;

import java.util.Scanner;

public class Code1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int num = Integer.parseInt(s, 16);

        System.out.printf("%o", num);

    }
}