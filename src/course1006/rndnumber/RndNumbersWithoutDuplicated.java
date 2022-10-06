package course1006.rndnumber;


import java.util.HashSet;
import java.util.Set;

public class RndNumbersWithoutDuplicated {
    public static void main(String[] args) {

        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

        Set<Integer> rndNumSet = new HashSet<>();   //중복을 제거한 랜덤 숫자를 담을 Set

        for (int i = 0; i < 50; i++) {
            int r = randomNumberGenerator.generate(10);
            System.out.print(r + " ");  //랜덤 숫자 출력
            rndNumSet.add(r);   //랜덤 숫자를 Set에 담음
        }

        System.out.println("\n" + rndNumSet);

    }
}
