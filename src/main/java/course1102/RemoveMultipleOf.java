package course1102;

import java.util.ArrayList;
import java.util.List;

/*
    소수구하기

    에라토스테네스의 체 알고리즘 사용
 */

public class RemoveMultipleOf {

    public static void main(String[] args) {
        int N = 50;
        List<Integer> list = new ArrayList<>();

        // 2 ~ 49까지 값 넣기
        for (int i = 2; i <= N; i++) {
            list.add(i);
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0 && list.get(i) > 2)
                list.set(i, 0);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%d ", list.get(i));
        }
        System.out.println();
        System.out.printf("리스트 크기: %d", list.size());

    }
}
