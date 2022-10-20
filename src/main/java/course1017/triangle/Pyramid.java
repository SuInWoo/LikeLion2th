package course1017.triangle;

public class Pyramid {
    private String letter = "*";
    private int repeat = 1;

    public Pyramid() {
    }

    public Pyramid(String letter, int repeat) {
        this.letter = letter;
        this.repeat = repeat;
    }

    public void print(Pyramid pr){

        for (int i = 1; i <= pr.repeat; i++) {
            //공백
            for (int j = pr.repeat; j > i ; j--) {
                System.out.print(" ");
            }
            //홀수마다 letter 출력
            for (int j = 0; j < 2*i-1; j++) {
                System.out.print(pr.letter);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        String inStr = "#";
        int n = 4;
        Pyramid pr = new Pyramid(inStr, n);

        pr.print(pr);

    }
}
