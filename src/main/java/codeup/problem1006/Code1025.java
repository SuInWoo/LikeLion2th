package codeup.problem1006;

import java.util.Scanner;

public class Code1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digits = 10000;

        for (int i = 0; i < 5; i++){
            System.out.printf("[%d]\n", num/digits*digits);
            num %= digits;
            digits /= 10;
        }
    }
}
