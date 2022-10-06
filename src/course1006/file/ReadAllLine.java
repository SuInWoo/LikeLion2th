package course1006.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadAllLine {
    public String rAllLine(String fileName) throws IOException {
        FileReader fileReader = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fileReader);
        String str;
        String rnt = "";

        while ((str = br.readLine()) != null){
            rnt += str + "\n";
        }

        return rnt;
    }
    public static void main(String[] args) throws IOException{
        ReadAllLine readAllLine = new ReadAllLine();
        System.out.println(readAllLine.rAllLine("./a_file.txt"));
    }
}
