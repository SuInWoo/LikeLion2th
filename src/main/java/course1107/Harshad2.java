package course1107;

public class Harshad2 {
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
        Harshad2 harshad2 = new Harshad2();

        boolean ans = harshad2.solution(12);
        System.out.println(ans);
    }
}
