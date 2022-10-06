package course1006.map;

import java.util.HashMap;
import java.util.Map;

public class MapExercise2 {
    public static void main(String[] args) {
        String repoAddr = "https://github.com/SuInWoo/LikeLion2th/tree/main/src";

        HashMap<Character, Integer> alphabetCnt = new HashMap<>();

        for (int i = 0; i < repoAddr.length(); i++){
            char c = repoAddr.charAt(i);    //깃 주소를 문자 한개씩 받을 변수
            int num = (int)c;   //아스키 코드 숫자 비교를 위한 변수
            if ((num >= 65 && num <= 90) || (num >= 97 && num <= 122)   //대문자와 소문자 모두 담기위해, 처음 들어오는 값이면 value를 1로 초기화
                    && alphabetCnt.get(c) == null ){
                alphabetCnt.put(c, 1);
            } else if ((num >= 65 && num <= 90) || (num >= 97 && num <= 122)) { //이미 들어온 값이면 value++
                alphabetCnt.put(c, (alphabetCnt.get(c)+1));
            }
        }

        for (Map.Entry<Character,Integer> entry: alphabetCnt.entrySet()) {
            System.out.println(entry.getKey()+" : "+ entry.getValue());
        }
    }
}
