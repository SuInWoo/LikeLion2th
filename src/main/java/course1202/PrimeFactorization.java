package course1202;

import java.util.Scanner;

public class PrimeFactorization {
    public static void factorization(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            while (n % i == 0){
                System.out.printf("%d ", i);
                n /= i;
            }
        }
        if (n != 1)
            System.out.printf("%d", n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        factorization(sc.nextInt());
    }
}
