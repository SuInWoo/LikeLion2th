package course1128;

public class Alpha {

    // 한 글자 알파벳 모두 출력
    public static void solution1() {
        for (int i = 65; i <= 90; i++) {
            System.out.printf("%c ", (char)i);
        }
    }

    public static void recurSolution1(char c) {

        if (c > 'Z') return;

        System.out.printf("%c ", c);
        recurSolution1((char) (c+1));
    }

    // 두 글자 알파벳 출력
    public static void solution2() {
        for (int i = 65; i <= 90; i++) {
            for (int j = 65; j <= 90; j++) {
                System.out.printf("%c%c ", (char)i, (char)j);
            }
            System.out.println();
        }
    }

    public static void recurSolution2(char c1, char c2) {
        if (c1 > 'Z')
            return;
        else if (c2 > 'Z') {
            System.out.println();
            recurSolution2((char) (c1+1), 'A');
        } else {
            System.out.printf("%c%c ", c1, c2);
            recurSolution2(c1, (char) (c2 + 1));
        }
    }

    public static void main(String[] args) {
        System.out.println("한 글자 알파벳 - for");
        solution1();
        System.out.println();
        System.out.println("한 글자 알파벳 - 재귀");
        recurSolution1('A');
        System.out.println();

        System.out.println("두 글자 알파벳 - for");
        solution2();
        System.out.println("두 글자 알파벳 - 재귀");
        recurSolution2('A', 'A');
    }
}
