package course1201;

import java.util.PriorityQueue;

public class HallOfFame {
    public static int[] solution(int k, int[] score) {
        int[] ans = new int[score.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            if (pq.size() < k) {
                pq.add(score[i]);
            } else if (pq.peek() < score[i]){
                pq.poll();
                pq.add(score[i]);
            }
            ans[i] = pq.peek();
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] score = new int[]{10, 100, 20, 150 ,1, 100, 200};
        int k = 3;

        for (int ans : solution(k, score)) {
            System.out.print(ans + " ");
        }
    }
}
