package course1021.algorism1021;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BracketReplaceTest {

    @Test
    @DisplayName("괄호가 잘 풀리는지-Replace 활용")
    void bracketReplace() {

        BracketReplace br = new BracketReplace();
        assertTrue(br.solution("()()"));
        assertTrue(br.solution("(())()"));
        assertFalse(br.solution(")()("));
        assertFalse(br.solution("(()("));

    }

    @Test
    @DisplayName("괄호가 잘 풀리는지-Split 활용")
    void bracketSplit() {

        BracketReplace br = new BracketReplace();
        assertTrue(br.solution2("()()"));
        assertTrue(br.solution2("(())()"));
        assertFalse(br.solution2(")()("));
        assertFalse(br.solution2("(()("));

    }
}