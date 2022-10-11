package course1011;

import java.util.Scanner;

public class Code1278 {
    public int solution(int n) {
        int rnt = 0;
        while (n > 0) {
            n /= 10;
            rnt++;
        }
        return rnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Code1278 c = new Code1278();

        int num = sc.nextInt();
        int result = c.solution(num);
        System.out.println(result);
    }
}
