package course1101;

/*
    프로그래머스 소수찾기: 1~n까지 소수의 개수를 반환

    풀이방법
    1. 소수: 1과 자기자신으로만 나누어지는 수
    2. 숫자 n이 소수인지 판별하려면 1~n까지 쭉 나누어보면 되지않을까 -> 답은 나오지만 프로그래머스에서 시간초과
    3.
 */
public class Decimal {
    // 1~n까지 쭉 나누어보기
    public int solution1(int n) {
        int answer = 0;

        for (int i = 2; i <= n; i++) {
            int cnt = 0;
            for (int j = 1; j <= i; j++) {
                if (i%j == 0) {
                    cnt++;
                }
            }
            if (cnt == 2)
                answer++;
        }
        return answer;
    }
    public static void main(String[] args) {

        Decimal decimal = new Decimal();
        System.out.println(decimal.solution1(5));
    }
}
