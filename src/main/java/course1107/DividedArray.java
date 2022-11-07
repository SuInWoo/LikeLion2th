package course1107;

import java.util.ArrayList;
import java.util.Collections;

public class DividedArray {
    public ArrayList<Integer> solution(int[] arr, int divisor)  {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0){
                ans.add(arr[i]);
            }
        }

        Collections.sort(ans);

        if (ans.isEmpty())
            ans.add(-1);

        return ans;
    }
}
