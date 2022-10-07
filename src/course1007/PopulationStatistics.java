package course1007;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/*
    파일 읽어오기
 */
public class PopulationStatistics {
    public void readByChar(String fileName) throws IOException {

        // 1byte 씩 읽기
        FileReader fileReader = new FileReader(fileName);
        String fileContents ="";

        while (fileContents.length() < 50){
            char c = (char)fileReader.read();
            fileContents += c;
        }

        System.out.println(fileContents);

    }
    public void readByLine(String fileName) throws IOException {

        //삽
        BufferedReader reader = new BufferedReader(
                new FileReader(fileName)
        );
        String str;

        while ((str = reader.readLine()) != null) {
            System.out.println(str);
        }

        reader.close();
    }

    //요즘 스타일
    public void readByLine2(String fileName) {
        try(BufferedReader br = Files.newBufferedReader(
                Paths.get(fileName), StandardCharsets.UTF_8)){

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public PopulationMove parse(String data){
        String[] parseArr = data.split(",");
        return new PopulationMove(Integer.parseInt(parseArr[0]), Integer.parseInt(parseArr[6]));
    }


    public static void main(String[] args) throws IOException {

        String address = "/Users/suin/Downloads/수업 데이터 파일/2021_인구관련연간자료_20221006_12557.csv";
        PopulationStatistics populationStatistics = new PopulationStatistics();

        PopulationMove populationMove = populationStatistics.parse("11,110,51500,2021,01,04,11,110,51500,5,1,033,1,,,,,,,,,,,,,,,,,,,,,,,,,,,,9");
        System.out.printf("toSido: %d fromSido: %d", populationMove.getToSido(), populationMove.getFromSido());

//        populationStatistics.readByChar(address);
//        populationStatistics.readByLine(address);
//        populationStatistics.readByLine2(address);

    }
}
