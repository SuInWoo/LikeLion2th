package course1116;

import java.util.Arrays;

public class QuickSortArray {

    public int[] sort(int[] arr) {
        int pivot = arr[arr.length/2];  //중간값을 pivot으로 잡음

        int leftIdx = 0;
        int rightIdx = arr.length-1;

        while (leftIdx <= rightIdx) {
            while (arr[leftIdx] < pivot) leftIdx++;
            while (arr[rightIdx] > pivot) rightIdx--;

            //교환
            arr = swap(arr, leftIdx, rightIdx);

            // 교환 후 Idx 변경
            leftIdx++;
            rightIdx--;
        }

        return arr;
    }

    public int[] swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;

        return arr;
    }

    public static void main(String[] args) {

        QuickSortArray qsa = new QuickSortArray();
        int[] arr = new int[]{20, 18, 5, 19, 40, 50, 5, 25};

        System.out.println(Arrays.toString(qsa.sort(arr)));



    }
}
