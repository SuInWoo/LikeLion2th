package course1005.calculator;

/**
 * plus
 * minus
 * multiple
 * divide
 * 파라미터는 int a,b
 *
 * psvm 생성 x
 */
public class Calculator {

    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void plus() {
        System.out.println(a + b);
    }

    public void minus() {
        System.out.println(a - b);
    }

    public void multiple() {
        System.out.println(a * b);
    }

    public void divide() {
        System.out.println((float)(a / b));
    }
}
