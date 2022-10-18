package course1018.algorism1018;

import java.util.Scanner;

public class Code1356 {
    void printSquare(int n){

        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 1; i < n-1; i++) {
            System.out.print("*");
            for (int j = 1; j < n-1; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }

    public static void main(String[] args) {
        Code1356 main = new Code1356();
        Scanner sc = new Scanner(System.in);
        main.printSquare(sc.nextInt());
    }
}
