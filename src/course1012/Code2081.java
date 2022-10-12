package course1012;

import java.util.Scanner;

public class Code2081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];
        int maxIndex = 0;
        int maxValue = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 9; i++) {
            if (arr[i] > maxValue){
                maxValue = arr[i];
                maxIndex = i+1;
            }
        }

        System.out.printf("%d\n%d", maxValue, maxIndex);

    }
}
