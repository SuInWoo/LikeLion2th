package course1107;

/*
    하샤드의 수

    풀이 방법
    1. 각 자리수의 합을 구함 => 10의 제곱수로 나누어 더함 or String 으로 입력받아 charAt으로 자릿수 더하기(형변환 사용)
    2. 나온 sum을 가지고 기존수에 나누어서 나누어떨어지면 true => %연산 사용
 */
public class Hasshad {
    public boolean solution(int x) {
        boolean answer = true;
        String str = Integer.toString(x);
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            sum += Character.getNumericValue(str.charAt(i));
        }

        if (x % sum != 0)
            answer = false;

        return answer;
    }

    public static void main(String[] args) {
        Hasshad hasshad = new Hasshad();

        boolean ans = hasshad.solution(12);
        System.out.print(ans);
    }
}
