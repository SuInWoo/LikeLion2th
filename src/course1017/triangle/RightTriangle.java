package course1017.triangle;

public class RightTriangle {
    public static void main(String[] args) {
        /*
            *
            * *
            * * *
            * * * *
            * * * * *
         */

        //for문 사용
        int n = 4;  //Scanner 사용해서 추후 입력받을 수 있음

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
