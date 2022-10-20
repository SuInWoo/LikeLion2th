package course1012;


import java.util.Scanner;

public class Code4596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];
        int maxValue = 0;
        int maxIndex1 = 0;
        int maxIndex2 = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] > maxValue){
                    maxValue = arr[i][j];
                    maxIndex1 = i+1;
                    maxIndex2 = j+1;
                }
            }
        }

        System.out.printf("%d\n%d %d", maxValue, maxIndex1, maxIndex2);
    }
}
