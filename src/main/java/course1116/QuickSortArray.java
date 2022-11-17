package course1116;

import java.util.Arrays;

public class QuickSortArray {

    public int[] sort(int[] arr, int startIdx, int endIdx) {
        int leftIdx = startIdx;
        int rightIdx = endIdx;

        int pivot = arr[(leftIdx+rightIdx)/2];  //중간값을 pivot으로 잡음

        while (leftIdx <= rightIdx) {
            while (arr[leftIdx] < pivot) leftIdx++;
            while (arr[rightIdx] > pivot) rightIdx--;

            //교환
            if (leftIdx <= rightIdx) {
                arr = swap(arr, leftIdx, rightIdx);
                leftIdx++;
                rightIdx--;
            }
        }

        if (startIdx < rightIdx)sort(arr, startIdx, rightIdx);
        if (endIdx > leftIdx) sort(arr, leftIdx, endIdx);

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

        System.out.println(Arrays.toString(qsa.sort(arr, 0, arr.length-1)));



    }
}
