package course1020.algorism1020;

public class Stack01 {
    private int[] stack;
    private int pointer = -1;
    //10000으로 초기 설정
    public Stack01() {
        this.stack = new int[10000];
    }

    public Stack01(int size) {

        this.stack = new int[size];
    }

    //스택에 push (증감연산자 사용)
    public void push(int value) {

        this.stack[++this.pointer] = value;
    }

    public int[] getStack() {
        return stack;
    }

    public int getArrById(int index){
        return stack[index];
    }

    public int[] getArr(int index){
        return stack;
    }

    //스택에서 pop
    public int pop() {
        return stack[pointer--];
    }
    public boolean isEmpty(){
        if (pointer == -1) {
            return true;
        }

        return false;
    }
}