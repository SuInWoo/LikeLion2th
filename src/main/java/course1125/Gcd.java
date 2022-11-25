package course1125;

public class Gcd {

    public static int solution (int a, int b) {

        while (a != b) {
            if (a > b)
                a -= b;
            else
                b -= a;
        }

        return a;
    }

    public static void main(String[] args) {
        System.out.println(solution(196, 42));
    }
}
