package course1129;

import java.util.HashSet;
import java.util.Set;

public class RadixSort {
    public static int[] getDigits(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int[] digit = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {  // 자리수
            if (arr[i] == 0) digit[i] = 1;
            else digit[i] = (int)(Math.log10(arr[i])+1);
        }

        for (int i : digit) {   // 중복 제거
            if (!set.contains(i))
                set.add(i);
        }

        int[] rnt = new int[set.size()];
        int idx = 0;
        for (Integer integer : set) {   // 배열에 담기
            rnt[idx++] = integer;
        }

        return rnt;
    }
    public static void main(String[] args) {
        int[] num = new int[]{0, 1, 2, 7, 7, 8, 13, 14, 16, 18, 203};

        int[] result = getDigits(num);
        for (int i : result) {
            System.out.printf("%d ", i);
        }
    }
}
