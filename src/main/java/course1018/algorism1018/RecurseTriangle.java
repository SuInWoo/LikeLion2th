package course1018.algorism1018;

import java.util.Scanner;

public class RecurseTriangle {
    void printTriangle(int n){
        if (n <= 0) return;
        printTriangle(n-1);
        System.out.print("*");
    }

    void lineBreak(int n){
        if (n <= 0) return;
        lineBreak(n-1);
        printTriangle(n);
        System.out.println();
    }
    public static void main(String[] args) {
        RecurseTriangle rt = new RecurseTriangle();
        Scanner sc = new Scanner(System.in);
        rt.lineBreak(sc.nextInt());
    }
}
