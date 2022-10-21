package course1021.algorism1021;

public class BracketReplace {
    //replace 활용
    public boolean solution(String s){

        while (s.indexOf("()") >= 0){
            s = s.replace("()", "");
        }

        return s.length() == 0;
    }

    //split and join 활용

    public boolean solution2(String s){

        while (s.indexOf("()") >= 0) {
            String[] sp = s.split("\\(\\)");
            s = String.join("", sp);
        }

        return s.length() == 0;
    }
}
