package course1031;

import java.util.ArrayList;

/*
    answers: 정답
    answer: 정답자를 담을 변수(return)

    풀이방법
    1. 나머지 활용하여 배열의 방 비교
    2. a와 answers비교하여 cnt1에 담음, ...
    3. cnt 비교하여 정답자를 담음

 */
public class Exam {

    private static int[] a = {1, 2, 3, 4, 5};
    private static int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
    private static int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

    public static int[] solution(int[] answers) {
        int[] answer = {0, 0 ,0};
        int max = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == a[i%5])   //1번 수포자
                answer[0]++;
            if (answers[i] == b[i%8])   //2번 수포자
                answer[1]++;
            if (answers[i] == c[i%10])  //3번 수포자
                answer[2]++;
        }

        max = Math.max(Math.max(answer[0], answer[1]), Math.max(answer[1], answer[2]));

        for (int i = 0; i < answer.length; i++) {
            if (max == answer[i])
                list.add(i+1);
        }

        answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 2};

        solution(arr);
    }
}
