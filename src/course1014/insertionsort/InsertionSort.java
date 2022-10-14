package course1014.insertionsort;

public class InsertionSort {

    public int[] sort(int[] arr){

        int key;
        for (int i = 1; i < arr.length; i++) {

            key = i;    //비교할 기준

            for (int j = i - 1; j >= 0 ; j--) {
                if (arr[key] < arr[j]){ //키 값과 그 전 값을 비교하여 앞에 값이 크면 교체 후 key--
                    int temp = arr[key];
                    arr[key] = arr[j];
                    arr[j] = temp;
                    key--;
                }else break;    //제대로 정렬이 되어있다면 for문을 빠져나와 key값 조정
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        int[] arr = new int[]{8, 5, 6, 2, 4};

        for (int sortArr : insertionSort.sort(arr)) {
            System.out.printf("%d ", sortArr);
        }

    }
}
