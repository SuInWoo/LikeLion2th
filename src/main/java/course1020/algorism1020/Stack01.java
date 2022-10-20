package course1020.algorism1020;

import java.util.EmptyStackException;

public class Stack01 {
    private int[] stack;
    private int pointer = -1;

    //10000으로 초기 설정
    public Stack01() {
        this.stack = new int[10000];
    }

    public int[] getArr(){
        return stack;
    }

    //스택에 push (증감연산자 사용)
    public void push(int value) {

        this.stack[++this.pointer] = value;
    }

    //스택에서 pop
    public int pop() {
        if (this.isEmpty()){
            throw new EmptyStackException();
        }
        return stack[pointer--];
    }

    //비어있는지 확인
    public boolean isEmpty(){
        if (pointer == -1)     //stack에 push가 안되면
            return true;
        return false;
    }

    public int peek() {
        if(this.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[pointer];
    }
}