package course1028;

import java.util.*;

public class Pocketmon {
    public int solution(int[] nums) {
        int answer = 0;
        int n = nums.length/2;

        HashSet<Integer> hs = new HashSet<Integer>();

        //번호 추가
        for(int i=0; i<nums.length; i++) {
            hs.add(nums[i]);
        }

        if(n < hs.size())
            answer = n;
        else
            answer = hs.size();
        return answer;
    }
}

