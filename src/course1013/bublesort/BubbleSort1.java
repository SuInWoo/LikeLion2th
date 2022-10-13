package course1013.bublesort;

public class BubbleSort1 {
    public int[] sort(int[] arr, boolean upAndDown){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        BubbleSort1 bs = new BubbleSort1();
        int[] arr = new int[]{7, 2, 3, 9, 28, 11};
        //오름차순 또는 내림차순으로 정렬하는 알고리즘을 짜보세요.
        boolean upAndDown = true;  //오름차순: true, 내림차순: false
        int[] arrUp = bs.sort(arr,true);

        for (int i : arrUp) {
            System.out.print(i + " ");
        }
    }
}
