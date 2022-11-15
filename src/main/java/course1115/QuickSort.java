package course1115;

import java.util.ArrayList;
import java.util.List;

/*
    20, 18, 5, 19, 5, 25 [ 40 ], 50
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{20, 18, 3, 19, 40, 50, 5, 25};
        List<Integer> left = new ArrayList<>(); //pivot 기준 왼쪽 리스트 -> pivot 보다 작은값
        List<Integer> mid = new ArrayList<>();  //pivot을 담는 리스트
        List<Integer> right = new ArrayList<>();//pivot 기준 오른쪽 리스트  -> pivot 보다 큰값

        // 1. 기준값 뽑는 로직 구현
        int pivot = arr[arr.length/2];

        // 2. 기준값 기준으로 왼쪽 오른쪽으로 나누어 담는 로직 구현
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < pivot)
                left.add(arr[i]);
            else if (arr[i] > pivot) {
                right.add(arr[i]);
            } else
                mid.add(arr[i]);
        }

        // hint. List사용
    }
}
