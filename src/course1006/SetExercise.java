package course1006;

import java.util.HashSet;
import java.util.Set;

public class SetExercise {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(); //tree set

        set1.add("우수인");
        set1.add("우수인");    //중복해서 넣어도 한개의 값만 들어감
        set1.add("우르르");

        //HashSet 사용시 정렬관련 -> 정렬을 지원하지않는데
        //단지 넣은 키값과 HashSet의 테이블의 크기 (정확하게 말하면 크기 - 1)과 & 연산을 진행하여 테이블에 담기게 된다.
        Set<Integer> set2 = new HashSet<>();
        set2.add(4);
        set2.add(3);
        set2.add(1);
        set2.add(2);

        set2.add(17);

        System.out.println(set1);
        System.out.println(set2);
    }
}
