package course1004.even_odd;

import java.util.Scanner;

public class EvenPlusOdd2 {
    private String getEvenOdd(int num){
        if (num % 2 == 0){
            return "짝수";
        }else return "홀수";
    }
    public void printEvenOddStatement(int first, int second){
        System.out.printf("%s+%s=%s", getEvenOdd(first), getEvenOdd(second), getEvenOdd(first+second));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EvenPlusOdd2 evenPlusOdd2 = new EvenPlusOdd2();

        int first = sc.nextInt();
        int second = sc.nextInt();

        evenPlusOdd2.printEvenOddStatement(first, second);
    }
}
