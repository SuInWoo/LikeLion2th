package course1207;

import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int ans = 0;
        PriorityQueue<Integer> pq = new PriorityQueue();

        for (int i : scoville) {
            pq.offer(i);
        }

        while (pq.peek() <= K) {
            if (pq.size() == 1) {
                return -1;
            }
            int a = pq.poll();
            int b = pq.poll();


            int result = a + (b * 2);

            pq.offer(result);
            ans ++;
        }
        return ans;
    }
}
