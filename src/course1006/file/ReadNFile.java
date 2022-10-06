package course1006.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadNFile {

    private String fileName;
    private int cnt;

    public ReadNFile(String fileName, int cnt) {
        this.fileName = fileName;
        this.cnt = cnt;
    }

    String readNChar(String filename, int cnt) throws IOException {

        String str = "";
        try (BufferedReader br = Files.newBufferedReader(Paths.get(filename), StandardCharsets.UTF_8)){
            for(int i = 0; i < cnt; i++) {
                str += (char)br.read();
            }
            return str;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ReadNFile readNFile = new ReadNFile("", 0);


        System.out.println("출력할 글자 수를 입력하세요.");
        int cnt = sc.nextInt();

        System.out.println(readNFile.readNChar("./a_file.txt", cnt));

    }

}
