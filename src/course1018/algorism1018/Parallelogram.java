package course1018.algorism1018;

import java.util.Scanner;

public class Parallelogram {
    void printPara(int n){
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Parallelogram pl = new Parallelogram();
        Scanner sc = new Scanner(System.in);
        pl.printPara(sc.nextInt());
    }
}
