package course1107;

public class Hasshad2 {
    public boolean solution(int x) {
        boolean ans = true;
        int sumOfDigit = 0;
        int num = x;

        while (x > 0) {
            sumOfDigit += x % 10;
            x = x /10;
        }

        if (num % sumOfDigit != 0)
            ans = false;

        return ans;
    }
    public static void main(String[] args) {
        Hasshad2 hasshad2 = new Hasshad2();

        boolean ans = hasshad2.solution(12);
        System.out.println(ans);
    }
}
