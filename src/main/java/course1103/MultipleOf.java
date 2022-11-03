package course1103;

import java.util.Arrays;

public class MultipleOf {
    public static void main(String[] args) {

        //초기 세팅
        int N = 50;
        int[] nums = new int[N - 1];    //2~50까지 49팅
        boolean[] checks = new boolean[nums.length];    //방문여부를 저장할 배열
        Arrays.fill(checks, true);  //boolean 변수를 초기 true로 세팅
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 2;
        }

        for (int i = 2; i < nums.length; i+=2) {
            checks[i] = false;
        }

        for (int i = 0; i < checks.length; i++) {
            if(checks[i]) System.out.println(nums[i]);
        }

    }
}
