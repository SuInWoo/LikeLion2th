package course1116;

public class QuickSortArray {
    public static void main(String[] args) {
        int[] arr = new int[]{20, 18, 5, 19, 40, 50, 5, 25};
        int pivot = arr[arr.length / 2];

        int leftIdx = 0;
        int rightIdx = arr.length - 1;

        while (arr[leftIdx] < pivot) {
            leftIdx += 1;
        }

        while (arr[rightIdx] > pivot) {
            rightIdx -= 1;
        }
    }
}
