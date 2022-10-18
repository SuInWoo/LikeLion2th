package course1018.algorism1018;

/*
    정사각형 출력 별찍기
 */
public class SquareStar {
    void printSquare(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        SquareStar squareStar = new SquareStar();
        int n = 3;

        squareStar.printSquare(3);
    }

}
