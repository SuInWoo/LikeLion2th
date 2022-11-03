package course1102;

/*
    프로그래머스 소수찾기

    1. 리스트로 진행 => n값이 클경우 시간이 너무 오래걸림
    2. 방문한 값의 idx로 check해줄수있는 boolean[]을 통해 해결 => 배열을 두개 선언해야함
    3. 방문하면 방문한 배열의 값을 0으로 처리(지워야하는 값만) => 배열 한개로 해결가능
 */
public class FindPrimeNum {
    public int solution(int n) {
        int ans = 0;
        int[] arr = new int[n+10];

        for (int i = 2; i <= n; i++) arr[i] = i;

        for (int i = 2; i < n; i++) {
            if (arr[i] == 0) continue;  //이미 지워진 수면 넘어감

            //지워지지 않은 수 발견시 그 수의 배수들을 모두 0으로 값 변경
            for (int j = 2*i; j <= n; j+=i) arr[j] = 0;
        }

        for (int i : arr) if (i != 0) ans++;

        return ans;
    }

    public static void main(String[] args) {
        FindPrimeNum findPrimeNum = new FindPrimeNum();
        System.out.println(findPrimeNum.solution(10));
    }
}
