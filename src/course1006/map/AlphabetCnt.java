package course1006.map;

import java.util.HashMap;
import java.util.Map;

public class AlphabetCnt {
    public static boolean isAlphabet(char c){

        if (c >= 'A' && c <= 'Z'){
            return true;
        }else
            return false;

    }

    public static void main(String[] args) {
        String s = "https://github.com/SuInWoo/LikeLion2th/tree/main/src".toUpperCase();
        HashMap<Character, Integer> alphabetMap = new HashMap<>();

        for(char c = 'A'; c < 'Z'; c++) {
            alphabetMap.put(c, 0);
        }

        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            boolean isAlphabet = isAlphabet(c);
            if (isAlphabet){
                alphabetMap.put(c, alphabetMap.get(c)+1);
            }
        }

        for (Map.Entry<Character,Integer> entry: alphabetMap.entrySet()) {
            System.out.println(entry.getKey()+" : "+ entry.getValue());
        }
    }
}
