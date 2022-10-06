package course1006.map;

import java.util.HashMap;
import java.util.Map;

/**
 * 알파벳 개수 출력하기
 *
 * 1. for문과 if문을 통해 해결
 * 2. 알파벳 판별 메소드를 통해 refactoring 해보기
 */
public class MapExercise2 {
    public static void main(String[] args) {
        String repoAddr = "https://github.com/SuInWoo/LikeLion2th/tree/main/src".toUpperCase();
        System.out.println(repoAddr);

        HashMap<Character, Integer> alphabetCnt = new HashMap<>();

        for (int i = 0; i < repoAddr.length(); i++){
            char c = repoAddr.charAt(i);    //깃 주소를 문자 한개씩 받을 변수
            if (c >= 'A' && c <= 'Z' && alphabetCnt.get(c) == null ){
                alphabetCnt.put(c, 1);
            } else if (c >= 'A' && c <= 'Z') { //이미 들어온 값이면 value++
                alphabetCnt.put(c, (alphabetCnt.get(c)+1));
            }
        }

        for (Map.Entry<Character,Integer> entry: alphabetCnt.entrySet()) {
            System.out.println(entry.getKey()+" : "+ entry.getValue());
        }
    }
}
