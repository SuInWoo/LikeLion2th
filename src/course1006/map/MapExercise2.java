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
    private String s;
    private HashMap<Character, Integer> alphabetCnt;

    public MapExercise2(String s) {
        this.s = s;
        this.alphabetCnt = new HashMap<>();
    }

    public boolean isAlphabet(char c){
        if (c >= 'A' && c <= 'Z'){
            return true;
        }else
            return false;
    }

    public void count() {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isAlphabet(c)) {
                if (alphabetCnt.get(c) != null)
                    alphabetCnt.put(c, alphabetCnt.get(c) + 1);
                else alphabetCnt.put(c, 1);
            }
        }
    }

    public HashMap<Character, Integer> getAlphabetCnt() {
        return alphabetCnt;
    }

    public static void main(String[] args) {

        String s = "https://github.com/SuInWoo/LikeLion2th/tree/main/src".toUpperCase();
        MapExercise2 mapExercise2 = new MapExercise2(s);

        mapExercise2.count();

        Map<Character, Integer> countMap = mapExercise2.getAlphabetCnt();

        for (Map.Entry<Character,Integer> entry: countMap.entrySet()) {
            System.out.println(entry.getKey()+" : "+ entry.getValue());
        }
    }
}
