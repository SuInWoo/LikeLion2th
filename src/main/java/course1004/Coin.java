package course1004;

import java.util.Scanner;

public class Coin {
    public static void main(String[] args) {
        int coin;
        Scanner sc = new Scanner(System.in);
        System.out.println("금액입력: ");
        coin = sc.nextInt();

        int coinArr[] = new int[]{50000, 10000, 5000, 1000, 500, 100, 50, 10};
        int coinCount[] = new int[8];

        for (int i = 0; i < 8; i++) {
            coinCount[i] = coin / coinArr[i];
            coin %= coinArr[i];
            System.out.println(coinArr[i] + "원: " + coinCount[i] + "개");
        }
    }
}