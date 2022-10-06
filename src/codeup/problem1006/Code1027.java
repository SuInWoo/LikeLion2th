package codeup.problem1006;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code1027 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] arr = str.split("\\.");

        System.out.printf("%s-%s-%s", arr[2], arr[1], arr[0]);
    }
}
