package course1021.algorism1021;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BracketReplaceTest {

    @Test
    @DisplayName("괄호가 잘 풀리는지-Replace 활용")
    void bracketReplace() {

        BracketSolution bs = new BracketSolution();
        assertTrue(bs.solution("()()"));
        assertTrue(bs.solution("(())()"));
        assertFalse(bs.solution(")()("));
        assertFalse(bs.solution("(()("));

    }
}