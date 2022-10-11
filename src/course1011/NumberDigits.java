package course1011;

import java.util.Scanner;

public class NumberDigits {

    public int solution(int n){
        int result = 0;
        while(n > 0) {
            result += n % 10;
            n /= 10;
        }
        return result;
    }
    public static void main(String[] args) {

        NumberDigits numDigits = new NumberDigits();
        int rnt = numDigits.solution(1234);

        if (rnt == 10){
            System.out.println("테스트 통과");
        }else {
            System.out.printf("테스트 실패 result:%d \n", rnt);
        }

    }
}