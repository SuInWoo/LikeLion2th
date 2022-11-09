package course1109;

public class SelectionSort {
    private static int[] arr = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3 ,39};

    public static void swap(int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        for (int i = 0; i < arr.length - 1; i++) {
            int swapIdx = i;
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    swapIdx = j;
                }
            }
            swap(i, swapIdx);
        }

        for (int i : arr) {
            System.out.printf("%d ", i);
        }
    }
}
