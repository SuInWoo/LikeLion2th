package course1108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DataSearch {
    public static int search(int[] arr, int searchNum)  {
        int idx = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchNum)
                idx = i+1;
        }

        return idx;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] numArr = new int[N];

        for (int i = 0; i < N; i++) {
            numArr[i] = Integer.parseInt(st.nextToken());
        }

        int rnt = search(numArr, Integer.parseInt(br.readLine()));
        System.out.println(rnt);

    }
}
