package course1017.triangle;

public class Diamond {
    private String letter = "*";
    private int repeat = 1;

    public Diamond() {
    }

    public Diamond(String letter, int repeat) {
        this.letter = letter;
        this.repeat = repeat;
    }

    public void print(int start, int end){

        //상단
        for (int i = start; i <= end; i++) {
            //공백
            for (int j = end; j > i ; j--) {
                System.out.print(" ");
            }
            //홀수 letter 출력
            for (int j = 0; j < 2*i-1; j++) {
                System.out.print(this.letter);
            }
            System.out.println();
        }

        //하단
        for (int i = end -1 ; i >= start; i--) {
            //공백
            for (int j = end; j > i ; j--) {
                System.out.print(" ");
            }
            //홀수 letter 출력
            for (int j = 0; j < 2*i-1; j++) {
                System.out.print(this.letter);
            }
            System.out.println();
        }
    }

    public void setDiamond(Diamond di){
        print(1, di.repeat);
    }

    public static void main(String[] args) {

        String inStr = "&";
        int n = 4;
        Diamond diamond = new Diamond(inStr, n);

        diamond.setDiamond(diamond);

    }
}
