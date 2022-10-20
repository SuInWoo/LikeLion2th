package course1004;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for(int i = 0; i < arr.length; i++){
            arr[i] = i+1;
        }

        for (int a: arr) {
            System.out.print(a + " ");
        }
    }
}
