package even_odd;

import java.util.Scanner;

public class EvenPlusOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1 % 2 == 0 && num2 % 2 ==0){
            System.out.println("짝수+짝수=짝수");
        }else if(num1 % 2 == 0 && num2 % 2 !=0) {
            System.out.println("짝수+홀수=홀수" );
        } else if (num1 % 2 != 0 && num2 % 2 ==0) {
            System.out.println("홀수+짝수=홀수" );
        }else System.out.println("홀수+홀수=짝수" );
    }
}
