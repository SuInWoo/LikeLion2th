package course1122;

import java.util.Scanner;

public class PrintStar {

    public static void star(int n) {
        if(n == 1) {
            System.out.print("*");
        } else {
            System.out.print("*");
            star(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        star(n);
    }
}
