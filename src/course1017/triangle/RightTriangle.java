package course1017.triangle;

public class RightTriangle {

    public void printTriangle(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        RightTriangle rt = new RightTriangle();
        int n = 4;  //Scanner 사용해서 추후 입력받을 수 있음

        rt.printTriangle(n);

    }
}
