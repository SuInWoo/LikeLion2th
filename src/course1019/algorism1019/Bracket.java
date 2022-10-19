package course1019.algorism1019;

import java.util.Stack;

public class Bracket {

    public boolean discriminant(String str){
        Stack<Character> bk = new Stack<>();
        bk.push(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == ')' && bk.peek() == '(')
                bk.pop();
            else
                bk.push(c);

        }
        if (bk.isEmpty())
            return true;
        else return false;
    }

    public static void main(String[] args) {
        Bracket bracket = new Bracket();
        String str = "(())";

        if (str.length() == 0)
            System.out.println("괄호가 없습니다.");
        else
            System.out.println(bracket.discriminant(str));

    }
}
