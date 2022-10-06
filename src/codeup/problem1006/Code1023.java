package codeup.problem1006;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code1023 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] strArr = str.split("\\.");

        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
    }
}
