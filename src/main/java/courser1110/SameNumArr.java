package courser1110;

import java.util.ArrayList;
import java.util.List;

public class SameNumArr {
    public List<Integer> solution(int[] arr) {

        List<Integer> ans = new ArrayList<>();
        int compare = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != compare) {
                ans.add(arr[i]);
                compare = arr[i];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        SameNumArr sameNumArr = new SameNumArr();
        int[] arr = new int[]{1, 1, 3, 3, 0, 1, 1};
        sameNumArr.solution(arr);
    }
}
