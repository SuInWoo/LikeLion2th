package course1019.algorism1019;

public class Stack01 {
    private int[] arr = new int[10000];
    private int pointer = -1;
    public Stack01() {}

    public Stack01(int size) {
        this.arr = new int[size];
    }

    public void push(int value) {
        this.pointer ++;
        this.arr[this.pointer] = value;
    }

    public int[] getArr() {
        return arr;
    }

    public void pop(int value){

    }

    public static void main(String[] args) {
        Stack01 stack01 = new Stack01();
        stack01.push(10);
        stack01.push(20);
    }
}
