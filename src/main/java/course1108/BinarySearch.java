package course1108;

public class BinarySearch {

    public static int search(int[] nums, int targetNum){
        int start = 0;
        int end = nums.length-1;
        int idx;

        while (start <= end) {
            idx = (end + start) / 2;
            if (nums[idx] == targetNum)
                return idx;
            else if (nums[idx] > targetNum) {
                end = idx -1 ;
            } else {
                start = idx + 1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int targetNum = 7;

        int rnt = search(nums, targetNum);
        System.out.println(rnt);
    }
}
