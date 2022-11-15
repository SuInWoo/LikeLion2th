package course1115;

import java.util.ArrayList;
import java.util.List;

/*
    20, 18, 3, 19, 40, 50, 5, 25
 */
public class QuickSort {
    public static List<Integer> quickSort(List<Integer> list) {

        if (list.size() <= 1)
            return list;

        List<Integer> left = new ArrayList<>(); //pivot 기준 왼쪽 리스트 -> pivot 보다 작은값
        List<Integer> right = new ArrayList<>();//pivot 기준 오른쪽 리스트  -> pivot 보다 큰값
        List<Integer> ans = new ArrayList<>();

        // 1. 기준값 뽑는 로직 구현
        int pivot = list.get(list.size()/2);

        // 2. 기준값 기준으로 왼쪽 오른쪽으로 나누어 담는 로직 구현
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < pivot)
                left.add(list.get(i));
            else if (list.get(i) > pivot) {
                right.add(list.get(i));
            }
        }

        ans.addAll(quickSort(left));
        ans.add(pivot);
        ans.addAll(quickSort(right));

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{20, 18, 3, 19, 40, 50, 5, 25};
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        System.out.print(quickSort(list));
    }
}
