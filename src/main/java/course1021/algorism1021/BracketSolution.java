package course1021.algorism1021;

import java.util.Stack;

public class BracketSolution {

    boolean solution(String s){

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(')   //'(' 만났을 때
                stack.push(c);
            else if (stack.isEmpty()) //')' 만났을 때
                return false;
            else
                stack.pop();
        }
        if (stack.isEmpty())
            return true;

        return false;
    }
}
