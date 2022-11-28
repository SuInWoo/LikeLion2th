package course1128;

public class Alpha {

    // 한 자리 알파벳 모두 출력
    public static void solution1() {
        for (int i = 65; i <= 90; i++) {
            System.out.printf("%c ", (char)i);
        }
    }

    // 두 자리 알파벳 출력
    public static void solution2() {
        for (int i = 65; i <= 90; i++) {
            for (int j = 65; j <= 90; j++) {
                System.out.printf("%c%c ", (char)i, (char)j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("한 자리 알파벳");
        solution1();
        System.out.println();
        System.out.println("두 자리 알파벳");
        solution2();
    }
}
