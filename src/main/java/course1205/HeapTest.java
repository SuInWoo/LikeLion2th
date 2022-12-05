package course1205;

public class HeapTest {

    public static int[] setHeap(int[] arr) {

        for (int i = arr.length-1; i >= 0; i--) {
            int parent = i;
            int left = 2*i+1;
            int right = 2*i+2;

            if (left <= arr.length-1 && arr[parent] < arr[left])
                arr = swap(parent, left, arr);

            if (right <= arr.length-1 && arr[parent] < arr[right])
                arr = swap(parent, right, arr);
        }

        return arr;
    }

    public static int[] swap(int a, int b, int[] arr) {
        int temp = 0;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

        return arr;
    }

    public static void main(String[] args) {
        // {6,5,7,8} -> {8,6,7,5}
        int[] arr = new int[]{6, 5, 7, 8};
        arr = setHeap(arr);

        for (int i : arr) {
            System.out.printf("%d ", i);
        }

    }
}
