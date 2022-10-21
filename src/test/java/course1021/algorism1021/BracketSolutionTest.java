package course1021.algorism1021;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class BracketSolutionTest {

    @Test
    @DisplayName("괄호 잘 풀리는지")
    void bracket() {
        BracketSolution bs = new BracketSolution();
        assertTrue(bs.solution("()()"));
        assertTrue(bs.solution("(())()"));
        assertFalse(bs.solution(")()("));
        assertFalse(bs.solution("(()("));
    }
}