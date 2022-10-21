package course1021.algorism1021;

public class BracketReplace {
    public boolean solution(String s){

        while (s.indexOf("()") >= 0){
            s = s.replace("()", "");
        }

        return s.length() == 0;
    }
}
