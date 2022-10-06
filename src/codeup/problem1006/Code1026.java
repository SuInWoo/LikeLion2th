package codeup.problem1006;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String clock = br.readLine();
        String[] clockArr = clock.split("\\:");
        if (clockArr[1].equals("00")){
            System.out.println(0);
        }else
            System.out.println(clockArr[1]);
    }
}
