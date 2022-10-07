package course1007;

import java.io.FileReader;
import java.io.IOException;

/*
    파일 읽어오기
 */
public class PopulationStatistics {
    public static void main(String[] args) throws IOException {

        String address = "/Users/suin/Downloads/수업 데이터 파일/2021_인구관련연간자료_20221006_12557.csv";
        FileReader fileReader = new FileReader(address);

        String fileContents ="";
        while (fileContents.length() < 1_000_000){
            char c = (char)fileReader.read();
            fileContents += c;
        }

        System.out.println(fileContents);

    }
}
