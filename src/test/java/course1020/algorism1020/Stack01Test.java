package course1020.algorism1020;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class Stack01Test {

    @BeforeEach
    void setup(){
        // ex) db에서 데이터를 지우는 코드
        System.out.println("before each");
    }

    @Test
    @DisplayName("push test")
    void push() {
        Stack01 st = new Stack01();
        st.push(10);
        st.push(20);

        int[] arr = st.getArr();

        assertEquals(20, arr[1]);
        assertEquals(10, arr[0]);
    }

    @Test
    @DisplayName("pop test")
    void pop() {
        Stack01 st = new Stack01();
        st.push(10);
        st.push(20);

        assertEquals(20, st.pop());
        assertEquals(10, st.pop());

        //비어있을때 예외 처리
        //Exception 예외의 검증
        assertThrows(EmptyStackException.class, () -> {
            st.pop();
        });
    }

    @Test
    @DisplayName("stack empty test")
    void isEmpty(){
        Stack01 st = new Stack01();
        st.push(10);
        assertFalse(st.isEmpty());

        st.pop();
        assertTrue(st.isEmpty());
    }

    @Test
    void realStack(){
        Stack<Integer>  st = new Stack<>();
        assertThrows(EmptyStackException.class, () -> {
            st.pop();
        });
    }
}