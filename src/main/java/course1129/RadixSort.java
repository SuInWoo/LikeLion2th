package course1129;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] num = new int[]{1, 0, 9, 5, 4, 7};
        int[] arr = new int[10];
        Arrays.fill(arr, -1);

        for (int i = 0; i < num.length; i++) {
            int n = num[i];
            arr[n] = n;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1)
                System.out.printf("%d ", arr[i]);
        }
    }
}
