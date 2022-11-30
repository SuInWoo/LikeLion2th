package course1130;

public class SumOfDivisors {
    public static int sum(int n) {
        int ans = 0;

        for (int i = 1; i <= n/2 ; i++) {
            if (n % i == 0) ans += i;
        }
        return ans + n;
    }
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}
