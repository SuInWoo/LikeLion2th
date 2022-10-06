package course1006.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadOneLine {
    public String rLine(String fileName) throws IOException{
        FileReader fileReader = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fileReader);

        String str = "";
        str += br.readLine();

        return str;
    }
    public static void main(String[] args) throws IOException {

        ReadOneLine readOneLine = new ReadOneLine();
        System.out.println(readOneLine.rLine("./a_file.txt"));

    }
}
