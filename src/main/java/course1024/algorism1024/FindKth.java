package course1024.algorism1024;

import java.util.Arrays;

public class FindKth {

    public int[] solution(int[] array, int[][] commands){
        int[] answer = new int[commands.length];
        int idx = 0;

        for (int[] command : commands) {
            int[] sliced = Arrays.copyOfRange(array, command[0]-1, command[1]);
            Arrays.sort(sliced);
            answer[idx++] = sliced[command[2]-1];
        }
        
        return answer;
    }
}
