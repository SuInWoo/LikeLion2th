package course1020.algorism1020;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class Stack01Test {

    @BeforeEach
    void setup(){
        // ex) db에서 데이터를 지우는 코드

        System.out.println("before each");
    }

    @Test
    @DisplayName("push 테스트")
    void push() {
        Stack01 stack = new Stack01();
        stack.push(100);
        stack.push(200);

        assertThat(100).isEqualTo(stack.getArrById(0));
        assertThat(200).isEqualTo(stack.getArrById(1));
    }

    @Test
    @DisplayName("pop 테스트")
    void pop() {
        Stack01 stack = new Stack01();
        int firstInput = 100;
        int secondInput = 200;
        stack.push(firstInput);
        stack.push(secondInput);

        assertThat(secondInput).isEqualTo(stack.pop());
        assertThat(firstInput).isEqualTo(stack.pop());
    }
}