package course1006.map;

public class AlphabetCnt {
    public static boolean isAlphabet(char c){

        int num = (int)c;
        if ((num >= 65 && num <= 90) || (num >= 97 && num <= 122)){
            return true;
        }else
            return false;

    }
    public static void main(String[] args) {
        String s = "aabbcabae/";

        for(int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i)+ ":" + isAlphabet(s.charAt(i)));
        }
    }
}
