package course1024.algorism1024;

import java.util.PriorityQueue;

public class FindKth2 {

    private int[] arr;

    public int getKthNum(int[] command){
        int frIdx = command[0];
        int toIdx = command[1];
        int nth = command[2];

        int rnt = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = frIdx-1; i < toIdx; i++) {
            pq.add(arr[i]);
        }

        for (int i = 0; i < nth; i++) {
            rnt = pq.poll();
        }
        return rnt;
    }

    public int[] solution(int[] array, int[][] commands){
        this.arr = array;
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            answer[i] = getKthNum(commands[i]);
        }
        return answer;
    }

}
