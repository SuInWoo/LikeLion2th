package course1017.triangle;

public class RightTriangle {

    private String letter = "*";
    private int repeat;

    public RightTriangle() {
    }

    public RightTriangle(String letter, int repeat) {
        this.letter = letter;
        this.repeat = repeat;
    }

    public void print(RightTriangle rt){
        for (int i = 1; i <= rt.repeat; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(rt.letter);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        String inStr = "#";
        int n = 4;
        RightTriangle rt = new RightTriangle(inStr, n);

        rt.print(rt);



    }
}
